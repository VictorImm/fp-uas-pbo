package Views.treot.model;

public class ModelSubtest {

    public static String getSubtestID(){
        return subtest_id;
    }

    public static void setSubtestID(String subtest_id){
        ModelSubtest.subtest_id = subtest_id;
    }
    
    public static String getAttemptID(){
        return attempt_id;
    }

    public static void setAttemptID(String attempt_id){
        ModelSubtest.attempt_id = attempt_id;
    }

    public void destroySubtest(){
        ModelSubtest.subtest_id = null;
        ModelSubtest.attempt_id = null;
        // ModelSubtest.time_remaining =null;
    }

    private static String subtest_id = null;
    private static String attempt_id = null;
    // private static String time_remaining = null;
}
