package Views.treot.model;

public class ModelStartAttempt {

    public static String getAttemptID(){
        return attempt_id;
    }

    public static void setAttemptID(String attempt_id){
        ModelStartAttempt.attempt_id = attempt_id;
    }

    public static String getTimeRemaining(){
        return time_remaining;
    }

    public static void setTimeRemaining(String time_remaining){
        ModelStartAttempt.time_remaining = time_remaining;
    }

//    public static ModelStart(String attempt_id, String time_remaining) {
//        ModelStart.attempt_id = attempt_id;
//        ModelStart.time_remaining = time_remaining;
//    }
//
//    public static ModelStart() {
//    }

    private static String attempt_id;
    private static String time_remaining;
}
