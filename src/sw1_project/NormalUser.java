package sw1_project;

public class NormalUser extends User{

    public NormalUser(String type, String name, String email, String password, String gender, String country, String dateOfBirth) {
        super(type, name, email, password, gender, country, dateOfBirth);
    }
    @Override
    public void addedFuntionalities (){
        System.out.println("you should upgrade to premuim to use this feature ");
    }
}
