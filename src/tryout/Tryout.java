package tryout;

// ======================================== ngetes doang gapenting =========================
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class Tryout {
    
    public static void main(String[] args) {
        System.out.println("Hello World!");
        try {
            // URL API yang ingin Anda panggil
            URL url = new URL("https://tryout.hoaks.my.id/api/auth/login");

            // Membuat objek HttpURLConnection
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            // Mengatur metode request menjadi POST
            conn.setRequestMethod("POST");
            conn.setDoOutput(true);

            // Mengirim data dalam body request
            // String requestBody = "{\"email\":\"asumantap27@gmail.com\",\"password\":\"hubed.com1\"}";
            String requestBody = "email=" + URLEncoder.encode("asumantap27@gmail.com", StandardCharsets.UTF_8)
                    + "&password=" + URLEncoder.encode("hubed.com1", StandardCharsets.UTF_8);
            OutputStream outputStream = conn.getOutputStream();
            outputStream.write(requestBody.getBytes());
            outputStream.flush();

            // Memeriksa kode respons HTTP
            int responseCode = conn.getResponseCode();
            System.out.println("Response Code: " + responseCode);

            // Membaca response dari API
            BufferedReader reader;
            if (responseCode == HttpURLConnection.HTTP_OK) {
                reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            } else {
                reader = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
            }

            String line;
            StringBuilder response = new StringBuilder();

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            
            // Menampilkan response dari API
            JsonElement jsonElement = JsonParser.parseString(response.toString());

            // JsonArray jsonArray = jsonElement.getAsJsonArray();
            // for (JsonElement element : jsonArray) {
            //     JsonObject obj = element.getAsJsonObject();
            //     String value = obj.get("data").getAsString();
            //     // Lakukan sesuatu dengan nilai yang diperoleh
            // System.out.println(value);

            // }


            JsonObject jsonObject = jsonElement.getAsJsonObject();
            JsonObject data = jsonObject.getAsJsonObject("data").getAsJsonObject("account");
            String value = data.get("email").getAsString();
            System.out.println(value);

            // Menutup koneksi
            conn.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
