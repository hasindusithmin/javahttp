
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.fasterxml.jackson.databind.ObjectMapper;

public class App {
    public static void main(String[] args) throws Exception {
        String[] keys = {"id","name","email","body"};
        try (Scanner sc = new Scanner(System.in)) {
        for(int i=0;i<keys.length;i++){
        String q = String.format("Enter Your %s:",keys[i]);
        System.out.print(q);
        keys[i] = sc.nextLine();
        }
        }
        Com com = new Com(Integer.parseInt(keys[0]),keys[1], keys[2],keys[3]);
        ObjectMapper mapper = new ObjectMapper();
        String reqBody = mapper.convertValue(com, Map.class).toString();
        
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest requestObj = HttpRequest.newBuilder().uri(URI.create("http://127.0.0.1:3000/comment"))
                .POST(HttpRequest.BodyPublishers.ofString(reqBody)).build();
        HttpResponse<String> responseObj = client.send(requestObj, HttpResponse.BodyHandlers.ofString());
        System.out.println(responseObj.body());
    }
}
