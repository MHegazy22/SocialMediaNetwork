package sw1_project;

public class NormalUser extends User{
    String type ;

    public NormalUser(String type, String name, String email, String password, String gender) {
        super(name, email, password, gender);
        this.type = type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
    
}
