package tryout;
import Libraries.PanitiaApi;

// ======================================== ngetes doang gapenting =========================

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello World!");
        PanitiaApi panitiaApi = new PanitiaApi();
        // panitiaApi.ping();
        // System.out.println(panitiaApi.getUserCommitte("10", "0").getAsJsonObject());
        System.out.println(panitiaApi.loginEmail("asumantap27@gmail.com", "hubed.om1").getAsJsonObject());
    }
}
