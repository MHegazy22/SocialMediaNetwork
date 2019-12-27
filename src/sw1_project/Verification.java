package sw1_project;

public class Verification {
    MySystem sys ;

    public Verification(MySystem sys) {
        this.sys = sys;
    }

    
    
    public Boolean verifyLogin (String userName , String pass)
    {
        if (sys.searchUser(userName).password.equals(pass))
            return true;
        
        return false ;
    }
}
