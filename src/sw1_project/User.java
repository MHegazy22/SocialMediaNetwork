package sw1_project;
import java.util.*; 
public class User {
    String name ; 
    String email ;
    String password ;
    String gender ;
    String country ;
    String dateOfBirth ;
    String type ;
    float credit ;
    ArrayList<User> friends = new ArrayList<>();
    ArrayList<User> friendRequest = new ArrayList<>();
    ArrayList<String> notification = new ArrayList<>();
    ArrayList<Post> posts = new ArrayList<>();
    ArrayList<Page> pages = new ArrayList<>();
    ArrayList<Groupe> groupes = new ArrayList<>();

    public User() {}

    public User(String type ,String name, String email, String password, String gender, String country, String dateOfBirth) {
        this.type = type ;
        this.name = name;
        this.email = email;
        this.password = password;
        this.gender = gender;
        this.country = country;
        this.dateOfBirth = dateOfBirth;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
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

    public void setCountry(String country) {
        this.country = country;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getCountry() {
        return country;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }
    
    public void setCredit(float credit) {
        this.credit = credit;
    }

    public float getCredit() {
        return credit;
    }
    
    /*send friend requist*/
    public void addFriend(MySystem sys) {
         
        Scanner myObj = new Scanner(System.in);  
        System.out.println("Enter User Name : ");
        String userName = myObj.nextLine();
        
        if (sys.searchUser(userName) != null && !(userName==this.name)){
            sys.searchUser(userName).friendRequest.add(this);
            sys.searchUser(userName).notification.add(this.name + " sent you afriend requist .");
        }else
            System.out.println("User Not Found!!");
    }
    public void acceptFriend(User x) {
        this.friends.add(x);
        x.friends.add(this);
        x.notification.add(this.name + " accepted your friend requist ");
        System.out.println("ypu and "+ x.getName() +" are now friends ");
    }
    public void addPost ()
    {
        System.out.println("Enter Text To Post : ");
        Scanner myObj = new Scanner(System.in);  
        System.out.println("Enter Text To Post : ");
        String txt = myObj.nextLine();
        Post p = new Post(txt,0,0);
        this.posts.add(p);
        System.out.println("your post has been uploaded :)");
    }
    public void showPost(){
        for (int i=0 ; i<this.posts.size() ; i++)
        {
            System.out.println("<<--------------------******---------------->>");
            System.out.println(this.posts.get(i).getText());
            System.out.println("<<--------------------******---------------->>");
        }
    }
    
}
