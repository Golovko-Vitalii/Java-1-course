package _module2.les_15_161223._roles_users;

import java.util.Scanner;

public class UserTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User [] users = new User[3];
        users [0] = new Admin("Alex");
        users [1] = new Moderator("Mark");
        users [2] = new User("Peter");
        System.out.println("All users in database:");
        for (int i = 0; i < users.length ; i++) {
            users[i].print();users[i].login();
            System.out.println("-----------");
        }

        for (int i = 0; i < users.length ; i++) {
            if (users[i] instanceof Admin){
                users[i].login();
                ((UserPro)users[i]).editEntry();
                System.out.println(users[i].getName()+" is admin, you can delete user, do you wanna? y/n");
                if (scanner.next().equals("y")){
                System.out.println(((Admin)users[i]).delUser(users));}
            } else if (users[i] instanceof Moderator){
                ((UserPro)users[i]).editEntry();
                ((Moderator)users[i]).banUser();
            }
            System.out.println("-----------");
        }
        System.out.println("All users in database:");
        for (int i = 0; i < users.length ; i++) {
            if (users[i]!=null)
            {users[i].print();users[i].login();
            System.out.println("-----------");}
        }
    }
}
