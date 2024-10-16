package StackOverflowTest;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;


public class UsersDB {
    private  Map<String, String>mp;
    private static UsersDB instance;

     private UsersDB(){
        mp = new ConcurrentHashMap<String, String>();
    }
    
    public static UsersDB getInstance() {
        if(instance == null){
            instance = new UsersDB();
        }
        return instance;
    }

    public boolean isUserSigned(String userName, String password){
      return mp.containsKey(userName) && mp.get(userName) == password;
    }

    public void signUpUser(String userName, String password){
        mp.put(userName, password); 
    }
}
