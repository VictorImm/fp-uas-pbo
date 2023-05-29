package Helpers;

public class Session {
    private static String name;
    private static String email;
    private static String token;
    private static boolean isLoggedIn;

    public static void destroySession() {
        name = null;
        email = null;
        token = null;
        isLoggedIn = false;
    }

    public static String getUsername() {
        return name;
    }

    public static void setUsername(String name) {
        Session.name = name;
    }

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        Session.email = email;
    }

    public static boolean isLoggedIn() {
        return isLoggedIn;
    }

    public static void setLoggedIn(boolean loggedIn) {
        isLoggedIn = loggedIn;
    }

    public static String getToken() {
        return token;
    }

    public static void setToken(String token) {
        Session.token = token;
    }
}

