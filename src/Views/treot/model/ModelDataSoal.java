package Views.treot.model;

import com.google.gson.JsonObject;

public class ModelDataSoal {

    public static JsonObject getDataSoalJawaban(){
        return dataSoalJawaban;
    }

    public static void setDataSoalJawaban(JsonObject dataSoalJawaban){
        ModelDataSoal.dataSoalJawaban = dataSoalJawaban;
    }

    public void destroySoal(){
        ModelDataSoal.dataSoalJawaban = null;
    }

    private static JsonObject dataSoalJawaban = null;
}
