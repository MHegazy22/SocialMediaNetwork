package sw1_project;

public class PremiumUser extends User{
    String type ; 

    public PremiumUser(String type, String name, String email, String password, String gender) {
        super(name, email, password, gender);
        this.type = type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
    
    public void addedFuntionalities (){
        System.out.println("I Am Premuim $$ ");
    } 
}
