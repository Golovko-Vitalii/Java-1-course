package _module2.les_15_161223._roles_users;

import java.util.Scanner;

public class Admin extends UserPro {
    public Admin(String name) {
        super(name);
    }
    public String delUser (User users []){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inpute name user to delete");
        String userName = scanner.next();
        for (int i = 0; i < users.length; i++) {
            if (userName.equals(users[i].getName())){
                users[i]=null;
                return ("Delete user '"+userName+"' OK");
            }
        }
        return ("Delete user '"+userName+"' ERROR, no such user!");
    }
}
