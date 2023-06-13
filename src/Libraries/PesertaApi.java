package Libraries;

import Helpers.Api;
import java.util.HashMap;
import java.util.Map;

// import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class PesertaApi {
    Api api = new Api();

    public JsonObject ping() throws Exception {
        return api.builder("GET", "/");
    }

    /**
     * Untuk mendapatkan daftar tryout yang tersedia untuk dikerjakan
     */
    public JsonObject getAttempts() throws Exception {
        return api.builder("GET", "/exam/my-attempt");
    }

    /**
     * Memilih tryout yang akan dikerjakan dan mulai pengerjaan
     */
    public JsonObject startAttempt(String exam_id) throws Exception {
        Map<String, String> requestBody = new HashMap<>();
        requestBody.put("exam", exam_id);
        return api.builder("POST", "/exam/user-attempt", requestBody);
    }

    /**
     * Mendapatkan informasi mengenai pengerjaan tryout (global)
     */
    public JsonObject getAttempt(String attempt_id) throws Exception {
        return api.builder("GET", "/exam/attempt/" + attempt_id);
    }

    /**
     * Mulai pengerjaan subtest
     */
    public JsonObject startSubattempt(String subtest_id, String attempt_id) throws Exception {
        Map<String, String> requestBody = new HashMap<>();
        requestBody.put("subtest", subtest_id);
        requestBody.put("attempt", attempt_id);
        return api.builder("POST", "/exam/subattempt", requestBody);
    }

    /**
     * Mendapatkan data pengerjaan subtest (answer_token)
     */
    public JsonObject getSubattempt(String subattempt_id) throws Exception {
        return api.builder("GET", "/exam/subattempt/" + subattempt_id);
    }

    /**
     * Untuk mendapatkan soal dan pilihan jawaban
     */
    public JsonObject getQuestions(String subattempt_id) throws Exception {
        return api.builder("GET", "/exam/subattempt/" + subattempt_id + "/questions");
    }

    /**
     * Untuk mendapatkan soal, pilihan jawaban dan jawaban yang telah dipilih
     */
    public JsonObject getAnswers(String answerToken) throws Exception {
        return api.builder("GET", "/exam/answer?answer_token=" + answerToken);
    }

    /**
     * Untuk menyimpan jawaban
     */
    public JsonObject putAnswer(String answerToken, String id, String selectedId) throws Exception {
        Map<String, Object> requestData = new HashMap<>();
        requestData.put("answer_token", answerToken);
        Map<String, Object> answer = new HashMap<>();
        answer.put("id", id);
        answer.put("selected_id", selectedId);
        requestData.put("answers", new Map[] { answer });

        return api.builder("/exam/answer", requestData);
    }

    /**
     * Finish
     */
    public JsonObject finishSubattempt(String subattempt_id) throws Exception {
        return api.builder("POST", "/exam/subattempt/finish/" + subattempt_id);
    }
}
