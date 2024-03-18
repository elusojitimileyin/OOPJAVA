package OnlineStore;

public class Users {
    private String name;
    private int age;
    private String emailAddress;
    private String homeAddress;
    private  int phone;
    private  int password;
 public Users(String name, int age){
     this.name = name;
     this.age = age;



 }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
