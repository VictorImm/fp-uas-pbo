package Controllers.Account;

import Controllers.BaseController;
import Helpers.Api;
import Helpers.Session;

import com.google.gson.*;
import java.util.HashMap;
import java.util.Map;

public class User extends BaseController {

    // public User() {
    //     throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    // }
    public String login(String email, String password) {
        String notif = "";
        try {
            JsonObject response = panitiaApi.loginEmail(email, password).getAsJsonObject();
            if (response.get("ok").getAsBoolean()) {
                Session.setLoggedIn();
                Session.setUsername(response.get("data").getAsJsonObject().get("account").getAsJsonObject().get("name").getAsString());
                Session.setEmail(response.get("data").getAsJsonObject().get("account").getAsJsonObject().get("email").getAsString());
                Session.setToken(response.get("data").getAsJsonObject().get("access_token").getAsString());
                notif = "Login Berhasil";
            } else {
                notif = response.get("message").getAsString();
            }
        } catch (Exception e) {
            notif = "Error : " + e.getMessage();
        }
        return notif;
    }

    public int getRole() {
        int role;
        try {
            Api api = new Api();
            JsonObject response = api.request("GET", "/profile");
            role = response.get("data").getAsJsonObject().get("account").getAsJsonObject().get("role_id").getAsInt();
        } catch (Exception e) {
            System.out.println("Error " + e);
            role = 0;
        }
        return role;
    }

}
