package sw1_project;

public class PremiumUser extends User{

    public PremiumUser(String type, String name, String email, String password, String gender, String country, String dateOfBirth) {
        super(type, name, email, password, gender, country, dateOfBirth);
    }
    
    public void addedFuntionalities (){
        System.out.println("I Am Premuim $$ :) ");
    }
}
