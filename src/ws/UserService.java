package ws;

import Entity.User;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

@WebService(serviceName = "userWS")
public class UserService {
    @WebMethod(operationName = "getUser")
    public User getUser(@WebParam(name = "code") int code){

        return new User(code, "Jane Doe", 30);
    }

    @WebMethod
    public int getBirthYear(@WebParam(name="age") int age){
        return 2020 - age;
    }

    @WebMethod
    public List<User> getUserList(){
        User u1 = new User(1, "first user", (int) (Math.random() * 20));
        User u2 = new User(2, "second user", (int) (Math.random() * 30));
        User u3 = new User(3, "third user", (int) (Math.random() * 40));

        List<User> list = new ArrayList<>();
        list.add(u1);
        list.add(u2);
        list.add(u3);
        return list;
    }
}
