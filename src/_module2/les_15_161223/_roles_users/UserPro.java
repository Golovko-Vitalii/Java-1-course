package _module2.les_15_161223._roles_users;

public abstract class UserPro extends User {

    public UserPro(String name) {
        super(name);
    }

    public void editEntry(){
        System.out.println(this.getClass().getSimpleName() +
                " " + this.getName() + " edited entry");
    }
}
