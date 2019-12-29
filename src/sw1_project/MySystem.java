package sw1_project;

import java.util.*;


public class MySystem {
    User curr ;
    ArrayList<User> users = new ArrayList<>();
    ArrayList<User> pages = new ArrayList<>();
    ArrayList<User> groupes = new ArrayList<>();

    public MySystem() {}
 
   
    public void register(){
        Scanner myObj = new Scanner(System.in);  
        System.out.println("Enter username");
        String userName = myObj.nextLine();
        
        System.out.println("Enter Email");
        String email = myObj.nextLine();
        
        System.out.println("Enter Password");
        String pass = myObj.nextLine();
        
        System.out.println("Enter Gender");
        String gender = myObj.nextLine();
        
        System.out.println("Enter Country");
        String country = myObj.nextLine();
        
        System.out.println("Enter Date Of Birth");
        String date = myObj.nextLine();
        
        User x = new NormalUser("normal",userName,email,pass,gender,country,date);
        this.users.add(x);
        this.curr = x ;
    }
    
    public Boolean login(){
        Scanner myObj = new Scanner(System.in);  
        System.out.println("Enter User Name :");
        String name = myObj.nextLine();
       
        System.out.println("Enter Password :");
        String pass = myObj.nextLine();
        
        Verification ver = new Verification(this);
        if (ver.verifyLogin(name, pass))
            this.curr = this.searchUser(name) ;
        else {
            System.out.println("Invalid User Name Or Password");
            return false ;
        } 
        return true ;
    }
    
    public User searchUser(String name){
        User user = null;
        for (int i=0 ; i<this.users.size() ; i++)
        {
            if (this.users.get(i).getName().equals(name))
            {
                user = this.users.get(i);
                break ;
            }
        }
        return user ;
    }
    public void delteUser(String name){
        for (int i=0 ; i<this.users.size() ; i++)
        {
            if (this.users.get(i).getName().equals(name))
            {
                this.users.remove(i);
                break ;
            }
        }
    }
    public void upgrade(){
        Verification ver = new Verification();
        ver.verifyCredit(); 
        
        User user = new PremiumUser("premium",curr.getName(),curr.getEmail(),curr.getPassword(),curr.getGender(),curr.getCountry(),curr.getDateOfBirth());
        delteUser(curr.getName());
        this.users.add(user);
        this.curr = user ;
        System.out.println("you are now premium $$ :) ");
    }

    void procces(){
        while (true){
            Scanner myObj = new Scanner(System.in);
                System.out.println("1- Make Post :");
                System.out.println("2- send friend requist :");
                System.out.println("3- notification :");
                System.out.println("4- frind requists :");
                System.out.println("5- Upgrage Registeration :");
                System.out.println("6- logout");
                int process2 = myObj.nextInt();
                if (process2 == 1) {
                    curr.addPost();
                }
                if (process2 == 2) {
                    this.curr.addFriend(this);
                }
                if (process2 == 3) {
                    for (int i=0 ; i<this.curr.notification.size() ; i++)
                        System.out.println(this.curr.notification.get(i));
                }
                if (process2 == 4) {
                    while (true) {
                        if (curr.friendRequest.size() >= 1) {
                            for (int i = 0; i < this.curr.notification.size(); i++) {
                                System.out.println((i + 1) + "- " + this.curr.friendRequest.get(i).getName());
                            }
                            System.out.println("enter number of user or 0 to back :");
                            int i = myObj.nextInt();

                            if (i == 0) {
                                break;
                            } else {
                                System.out.println("1- show posts : \n2- acceptfriend requist  \n0- back :");
                                int temp = myObj.nextInt();
                                if (temp == 1) {
                                    curr.friendRequest.get(i - 1).showPost();

                                } else if (temp == 2) {
                                    this.curr.acceptFriend(curr.friendRequest.get(i - 1));
                                    curr.friendRequest.remove(i - 1);
                                    if (curr.friendRequest.isEmpty()) 
                                        break;
                                    }
                                }
                        } else {
                            System.out.println("there is no friend requists.");
                            break;
                        }
                    
                }
                }
                if (process2 == 5) {
                    this.upgrade();
                }
                if (process2 == 6) {
                    break;
                }
            }
    }
    void run() {
        while (true) {
            Scanner myObj = new Scanner(System.in);
            System.out.println("Enter Process");
            System.out.println("1- LogIn :");
            System.out.println("2- Register :");
            System.out.println("0- end ");
            
            int process = myObj.nextInt();

            if (process == 1) {
                if (this.login())
                    procces();
            }
            if (process == 2) {
                this.register();
                procces();
            }
            if (process == 0)
                break ; 
        }
    }
    
}
