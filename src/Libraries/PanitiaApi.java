package Libraries;

import Helpers.Api;
import java.util.HashMap;
import java.util.Map;
import com.google.gson.JsonObject;

public class PanitiaApi {
    Api api = new Api();

    public JsonObject ping() throws Exception {
        return api.builder("GET", "/");
    }

    // Accounts

    public JsonObject loginEmail(String email, String password) throws Exception {
        Map<String, String> requestBody = new HashMap<>();
        requestBody.put("email", email);
        requestBody.put("password", password);
        return api.builder("POST", "/auth/login", requestBody);
    }

    public JsonObject loginGogle(String credential) throws Exception {
        Map<String, String> requestBody = new HashMap<>();
        requestBody.put("credential", credential);
        return api.builder("POST", "/auth/google", requestBody);
    }


    public JsonObject getUserParticipant(String limit, String offset) throws Exception {
        Map<String, String> requestBody = new HashMap<>();
        requestBody.put("limit", limit);
        requestBody.put("offset", offset);
        return api.builder("GET", "/user/participant", requestBody);
    }

    public JsonObject getUserCommitte(String limit, String offset) throws Exception {
        Map<String, String> requestBody = new HashMap<>();
        requestBody.put("limit", limit);
        requestBody.put("offset", offset);
        return api.builder("GET", "/user/committe", requestBody);
    }

    public JsonObject createUser(Map<String, String> data) throws Exception{
        return api.builder("POST", "/user", data);
    }

    // public JsonObject createUserBatch(Map<String, String> users) throws Exception{
    //     Map<String, String> requestBody = new HashMap<>();
    //     requestBody.put("users", users);
    //     return api.builder("POST", "/user/batch", users);
    // }

    public JsonObject getUser(String user_id) throws Exception{
        return api.builder("GET", "/user/" + user_id);
    }

    // Tryouts
    public JsonObject getTryouts() throws Exception{
        return api.builder("GET", "/exam");
    }

    public JsonObject getTryout(String tryout_id) throws Exception{
        return api.builder("GET", "/exam/" + tryout_id);
    }

    public JsonObject createTryout(Map<String, String> data) throws Exception{
        return api.builder("POST", "/exam", data);
    }

    public JsonObject editTryout(String tryout_id, Map<String, String> data) throws Exception{
        return api.builder("PATCH", "/exam/" + tryout_id, data);
    }

    public JsonObject deleteTryout(String tryout_id) throws Exception{
        return api.builder("DELETE", "/exam/" + tryout_id);
    }

    // Subtests

    public JsonObject getSubtests(String tryout_id) throws Exception{
        return api.builder("GET", "/exam/subtest?exam=" + tryout_id);
    }

    public JsonObject getSubtest(String subtest_id) throws Exception{
        return api.builder("GET", "/exam/subtest/" + subtest_id);
    }

    public JsonObject createSubtest(Map<String, String> data) throws Exception{
        return api.builder("POST", "/exam/subtest", data);
    }

    public JsonObject editSubtest(String subtest_id, Map<String, String> data) throws Exception{
        return api.builder("PATCH", "/exam/subtest/" + subtest_id, data);
    }

    public JsonObject deleteSubtest(String subtest_id) throws Exception{
        return api.builder("DELETE", "/exam/subtest/" + subtest_id);
    }

    // Questions

    public JsonObject getQuestionsBySubtest(String subtest_id) throws Exception{
        return api.builder("GET", "/qbank/subtest/" + subtest_id + "/questions");
    }

    public JsonObject getQuestion(String question_id) throws Exception{
        return api.builder("GET", "/qbank/question/" + question_id);
    }

    public JsonObject createQuestion(Map<String, String> data) throws Exception{
        return api.builder("POST", "/qbank/question", data);
    }

    public JsonObject editQuestion(String question_id, Map<String, String> data) throws Exception{
        return api.builder("PATCH", "/qbank/question/" + question_id, data);
    }

    public JsonObject deleteQuestion(String question_id) throws Exception{
        return api.builder("DELETE", "/qbank/question/" + question_id);
    }

    // Packages

    public JsonObject getPackages() throws Exception{
        return api.builder("GET", "/qbank/package");
    }

    public JsonObject getPackage(String package_id) throws Exception{
        return api.builder("GET", "/qbank/package/" + package_id);
    }

    public JsonObject createPackage(Map<String, String> data) throws Exception{
        return api.builder("POST", "/qbank/package", data);
    }

    public JsonObject editPackage(String package_id, Map<String, String> data) throws Exception{
        return api.builder("PATCH", "/qbank/package/" + package_id, data);
    }

    public JsonObject deletePackage(String package_id) throws Exception{
        return api.builder("DELETE", "/qbank/package/" + package_id);
    }

    // Subtest's questions

    public JsonObject getQuestionsBySubtestId(String subtest_id) throws Exception{
        return api.builder("GET", "/exam/question?subtest=" + subtest_id);
    }

    public JsonObject addQuestion(String question_id, String subtest_id) throws Exception{
        Map<String, String> requestBody = new HashMap<>();
        requestBody.put("subtest_id", subtest_id);
        requestBody.put("question_id", question_id);
        return api.builder("POST", "/exam/question", requestBody);
    }

    public JsonObject removeQuestion(String question_id) throws Exception{
        return api.builder("DELETE", "/exam/question/" + question_id);
    }

    public JsonObject importQuestion(String package_id, String subtest_id) throws Exception{
        Map<String, String> requestBody = new HashMap<>();
        requestBody.put("package_id", package_id);
        requestBody.put("subtest_id", subtest_id);
        return api.builder("POST", "/exam/question/import", requestBody);
    }

    // Attempts / Pengerjaan

    public JsonObject getAttempts(String tryout_id) throws Exception{
        return api.builder("GET", "/exam/attempt?exam=" + tryout_id);
    }

    public JsonObject getAttempt(String attempt_id) throws Exception{
        return api.builder("GET", "/exam/attempt/" + attempt_id);
    }

    public JsonObject createAttempt(Map<String, String> data) throws Exception{
        return api.builder("POST", "/exam/attempt", data);
    }

    public JsonObject editAttempt(String attempt_id, Map<String, String> data) throws Exception{
        return api.builder("PATCH", "/exam/attempt/" + attempt_id, data);
    }

    public JsonObject deleteAttempt(String attempt_id) throws Exception{
        return api.builder("DELETE", "/exam/attempt/" + attempt_id);
    }

    // Subattempts

    public JsonObject getSubattemptsBySubtestId(String subtest_id) throws Exception{
        return api.builder("GET", "/exam/subattempt?subtest=" + subtest_id);
    }

    public JsonObject getSubattemptsByAttemptId(String attempt_id) throws Exception{
        return api.builder("GET", "/exam/subattempt?attempt=" + attempt_id);
    }

    public JsonObject getSubattempt(String subattempt_id) throws Exception{
        return api.builder("GET", "/exam/subattempt/" + subattempt_id);
    }

    public JsonObject deleteSubattempt(String subattempt_id) throws Exception{
        return api.builder("DELETE", "/exam/subattempt/" + subattempt_id);
    }

    public JsonObject reviewSubattempt(String subattempt_id) throws Exception{
        return api.builder("POST", "/exam/subattempt/" + subattempt_id + "/review");
    }

    // Scoring

    public JsonObject getSubtestSumaryResult(String subtest_id) throws Exception{
        return api.builder("GET", "/exam/ranker/irt-summary?subtest=" + subtest_id);
    }

    public JsonObject runPreparing(String subtest_id) throws Exception{
        return api.builder("POST", "/exam/ranker/preparing/" + subtest_id);
    }

    public JsonObject runWeighting(String subtest_id) throws Exception{
        return api.builder("POST", "/exam/ranker/weighting/" + subtest_id);
    }

    public JsonObject runDistributing(String subtest_id) throws Exception{
        return api.builder("POST", "/exam/ranker/distributing/" + subtest_id);
    }

    public JsonObject runSummarizing(String subtest_id) throws Exception{
        return api.builder("POST", "/exam/ranker/summarizing/" + subtest_id);
    }

    public JsonObject runAgregating(String subtest_id) throws Exception{
        return api.builder("POST", "/exam/ranker/agregating/" + subtest_id);
    }

    public JsonObject getRankExam(String exam_id) throws Exception{
        return api.builder("GET", "/exam/ranker/agregate/" + exam_id);
    }

    public JsonObject getRankSubtest(String subtest_id) throws Exception{
        return api.builder("GET", "/exam/ranker/subtest/" + subtest_id);
    }

    public JsonObject getStats(String exam_id) throws Exception{
        return api.builder("GET", "/exam/ranker/stats/" + exam_id);
    }

    public JsonObject getFullRank(String exam_id) throws Exception{
        return api.builder("GET", "/exam/ranker/agregate-full/" + exam_id);
    }

}
