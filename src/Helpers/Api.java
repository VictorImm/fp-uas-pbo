package Helpers;

import com.google.gson.*;
import java.io.DataOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

public class Api {
    protected final String API_URL = "https://tryout.hoaks.my.id/api";

    public JsonObject request(String method, String endpoint, Map<String, String> requestBody) throws Exception{
        String fullUrl = API_URL + endpoint;
        URL finalUrl = new URL(fullUrl);
        HttpURLConnection conn = (HttpURLConnection) finalUrl.openConnection();
        byte[] DataBytes = HttpQueryBuilder.buildQuery(requestBody);
        conn.addRequestProperty("Content-Type", "application/x-www-form-urlencoded");

        // Memeriksa method request
        switch (method) {
            case "POST":
                conn.setRequestMethod("POST");
                // conn.addRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                conn.setDoOutput(true);
                try (DataOutputStream wr = new DataOutputStream(conn.getOutputStream())) {
                    wr.write(DataBytes);
                }
                break;
            case "PATCH":
                conn.setRequestMethod("PATCH");
                // conn.addRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                conn.setDoOutput(true);
                try (DataOutputStream wr = new DataOutputStream(conn.getOutputStream())) {
                    wr.write(DataBytes);
                }
                break;
            case "DELETE":
                conn.setRequestMethod("DELETE");
                break;
            default:
                fullUrl = HttpQueryBuilder.buildGETQuery(fullUrl, requestBody);
                finalUrl = new URL(fullUrl);
                conn = (HttpURLConnection) finalUrl.openConnection();
                conn.setRequestMethod("GET");
                break;
        }

        // cek apakah user sudah login
        if(Session.isLoggedIn()) {
            conn.setRequestProperty("Authorization", "Bearer " + Session.getToken());
        }
        
        // Membaca response dari API
        BufferedReader reader;
        if (conn.getResponseCode() == HttpURLConnection.HTTP_OK) {
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

        // Konvert response ke JsonObject
        JsonElement jsonElement = JsonParser.parseString(response.toString());
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        conn.disconnect();
        
        return jsonObject;
    }

    public JsonObject request(String method, String endpoint) throws Exception{
        String fullUrl = API_URL + endpoint;
        URL finalUrl = new URL(fullUrl);
        HttpURLConnection conn = (HttpURLConnection) finalUrl.openConnection();
        conn.setRequestMethod("GET");
        conn.addRequestProperty("Content-Type", "application/x-www-form-urlencoded");

        // cek apakah user sudah login
        if(Session.isLoggedIn()) {
            conn.setRequestProperty("Authorization", "Bearer " + Session.getToken());
        }

        // Memeriksa kode respons HTTP
        // int responseCode = conn.getResponseCode();
        // if(responseCode == 0){
        //     throw new Exception("Server Unavaible : API_URL");
        // }
        // System.out.println("Response Code: " + responseCode);

        // Membaca response dari API
        BufferedReader reader;
        if (conn.getResponseCode() == HttpURLConnection.HTTP_OK) {
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

        // Konvert response ke JsonObject
        JsonElement jsonElement = JsonParser.parseString(response.toString());
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        conn.disconnect();
        
        return jsonObject;
    }

    public JsonObject builder(String method, String endpoint, Map<String, String> requestBody) throws Exception{
        try {
            
            JsonObject jsonObject = request(method, endpoint, requestBody);
            if(jsonObject.get("ok").getAsBoolean()){
                return jsonObject;
            }else{
                if(jsonObject.get("message").getAsString().equals("Expired token")){
                    Session.destroySession();
                    throw new Exception("Session Expired");
                }
                return jsonObject;
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public JsonObject builder(String method, String endpoint) throws Exception{
        try {
            JsonObject jsonObject = request(method, endpoint);
            if(jsonObject.get("ok").getAsBoolean()){
                return jsonObject;
            }else{
                if(jsonObject.get("message").getAsString().equals("Expired token")){
                    Session.destroySession();
                    throw new Exception("Session Expired");
                }
                return jsonObject;
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
