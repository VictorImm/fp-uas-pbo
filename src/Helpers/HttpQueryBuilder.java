package Helpers;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.net.URLEncoder;
import java.util.Map;

public class HttpQueryBuilder {
    public static String buildGETQuery(String url, Map<String, String> parameters) {
        StringBuilder queryBuilder = new StringBuilder(url);
        queryBuilder.append("?");
        try {
            for (Map.Entry<String, String> entry : parameters.entrySet()) {
                String key = URLEncoder.encode(entry.getKey(), "UTF-8");
                String value = URLEncoder.encode(entry.getValue(), "UTF-8");
                queryBuilder.append(key).append("=").append(value).append("&");
            }
            queryBuilder.deleteCharAt(queryBuilder.length() - 1); // Menghapus tanda '&' terakhir
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return queryBuilder.toString();
    }

    public static byte[] buildQuery(Map<String, String> parameters){
        StringBuilder postData = new StringBuilder();
            for (Map.Entry<String, String> param : parameters.entrySet()) {
                if (postData.length() != 0) {
                    postData.append('&');
                }
                postData.append(param.getKey());
                postData.append('=');
                postData.append(param.getValue());
            }
            byte[] postDataBytes = postData.toString().getBytes(StandardCharsets.UTF_8);
            return postDataBytes;
    }

    // public static void main(String[] args) {
    //     String url = "http://example.com/api";
    //     Map<String, String> parameters = new HashMap<>();
    //     parameters.put("param1", "value1");
    //     parameters.put("param2", "value2");
    //     parameters.put("param3", "value3");

    //     String query = buildQuery(url, parameters);
    //     System.out.println("Query: " + query);
    // }
}

