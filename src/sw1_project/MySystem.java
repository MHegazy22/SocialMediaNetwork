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
        
        User x = new NormalUser("normal",userName,email,pass,gender);
        this.users.add(x);
        this.curr = x ;
    }
    
    public void login(){
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
        } 
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

    void run() {
        while (true) {
            Scanner myObj = new Scanner(System.in);
            System.out.println("Enter Process");
            System.out.println("1- LogIn :");
            System.out.println("2- Register");
            int process = myObj.nextInt();

            if (process == 1) {
                this.login();
            }
            if (process == 2) {
                this.register();
            }
            while (true){
                System.out.println("1- print name :");
                System.out.println("2- send friend requist :");
                System.out.println("3- notification :");
                System.out.println("4- frind requists :");
                System.out.println("5- logout");
                int process2 = myObj.nextInt();
                if (process2 == 1) {
                    System.out.println(this.curr.getName());
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
                            System.out.println("enter number of user to accept his friend requist or 0 to back :");
                            int i = myObj.nextInt();

                            if (i == 0) {
                                break;
                            } else {
                                this.curr.acceptFriend(curr.friendRequest.get(i - 1));
                                curr.friendRequest.remove(i - 1);
                                if(curr.friendRequest.isEmpty())
                                    break;
                            }
                        } else {
                            System.out.println("there is no friend requists.");
                            break;
                        }
                    }
                }
                if (process2 == 5) {
                    break;
                }
            }
        }
    }
    
}
