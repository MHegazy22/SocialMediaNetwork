package sw1_project;
import java.util.*; 
public class User {
    String name ; 
    String email ;
    String password ;
    String gender ;
    ArrayList<User> friends = new ArrayList<>();
    ArrayList<User> friendRequest = new ArrayList<>();
    ArrayList<String> notification = new ArrayList<>();
    ArrayList<Page> pages = new ArrayList<>();
    ArrayList<Groupe> groupes = new ArrayList<>();

    public User() {}

    public User(String name, String email, String password, String gender) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getGender() {
        return gender;
    }

    /*send friend requist*/
    public void addFriend(MySystem sys) {
         
        Scanner myObj = new Scanner(System.in);  
        System.out.println("Enter User Name : ");
        String userName = myObj.nextLine();
        
        sys.searchUser(userName).friendRequest.add(this);
        sys.searchUser(userName).notification.add(this.name + "sent you afriend requist .");
        
    }
    public void acceptFriend(User x) {
        
    }
    
    
    
}
