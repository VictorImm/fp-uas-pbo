package Views.treot.model;

public class ModelSubattempt {


    public static String getSubAttemptID(){
        return subattempt_id;
    }

    public static void setSubAttemptID(String subattempt_id){
        ModelSubattempt.subattempt_id = subattempt_id;
    }

    public static String getAnswerToken(){
        return answer_token;
    }

    public static void setAnswerToken(String answer_token){
        ModelSubattempt.answer_token = answer_token;
    }

    public static String getTimeRemaining(){
        return time_remaining;
    }

    public static void setTimeRemaining(String time_remaining){
        ModelSubattempt.time_remaining = time_remaining;
    }

    public static void destroySubattempt(){
        ModelSubattempt.answer_token = null;
        ModelSubattempt.subattempt_id = null;
        ModelSubattempt.time_remaining = null;
    }
    
    private static String subattempt_id;
    private static String answer_token;
    private static String time_remaining;
}
