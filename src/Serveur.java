import ws.UserService;

import javax.xml.ws.Endpoint;

public class Serveur {
    public static void main(String[] args){
        String url = "http://0.0.0.0:8686/";
        Endpoint.publish(url, new UserService());
        System.out.println("server running on "+url);
    }
}
