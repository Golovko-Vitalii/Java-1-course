package _module2.les_11_161214._2_3_polymorphysm_dynamic;

public class Manager extends Worker {
    private double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + this.bonus;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + getName() + '\'' +
                ", salary=" + getSalary() + "(" +
                super.getSalary()+ "+" + this.bonus + ")" +
                '}';
    }
}
