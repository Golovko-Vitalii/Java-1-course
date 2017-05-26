package _module2.les_15_161223._roles_users;

public class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public void login(){
        System.out.println("Login OK, user "+this.getName());
    }

    public void print (){
        System.out.println("Info about user "+this.getName());
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
