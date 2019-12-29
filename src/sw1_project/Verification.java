package sw1_project;

import java.util.Scanner;

public class Verification {
    MySystem sys ;

    
    
    public Verification(MySystem sys) {
        this.sys = sys;
    }

    Verification() {}

    

    public Boolean verifyCredit(){
        Scanner myObj = new Scanner(System.in);  
        System.out.println("enetr card number : ");
        String cardNumber = myObj.nextLine();
        return true ;
    }
    
    public Boolean verifyLogin (String userName , String pass)
    {
        if (sys.searchUser(userName).password.equals(pass))
            return true;
        
        return false ;
    }
}
