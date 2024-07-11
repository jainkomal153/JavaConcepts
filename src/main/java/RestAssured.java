import java.io.File;
import java.net.ResponseCache;

public class RestAssured {

    String url ="https://xyz.com/login";


    private void sendRequest(){
        Response response = given().when(url).body("{\n" +
                "  \"credentials\": {\n" +
                "    \"name\": \"administrator\",\n" +
                "    \"password\": \"passw0rd\",\n" +
                "    \"site\": {\n" +
                "      \"contentUrl\": \"\"\n" +
                "    }\n" +
                "  }\n" +
                "}").post;
    }

    public static void main(String[] args) {

    }
}
