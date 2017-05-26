package _module2.les_11_161214._2_3_polymorphysm_dynamic;

import java.util.Objects;

public class WorkerTest {
    public static void main(String[] args) {
        Worker [] workers = new Worker[5];
        workers[0] = new Worker("Pavel", 4000);
        workers[1] = new Manager("Oleg", 5000,3000);
        workers[2] = new Worker("Max", 5000);
        workers[3] = new Manager("Dima", 6000, 2000);
        workers[4] = new Worker("Anna", 6000);

        for (Worker worker : workers){
            System.out.println(worker.toString());//полиморфизм в вызове метода toString()
        }
        System.out.println(avarageSalary(workers));
        System.out.println(getAverageBonus(workers));
        System.out.println(getAverageSalaryOnlyWorkers(workers));



        Worker w = new Worker("Tom", 5000);
        Worker m = new Manager("Tom", 5000, 1000);

        System.out.println(m instanceof Manager);
        System.out.println(m.getClass()==Manager.class);
        System.out.println(Objects.class);
        System.out.println(Objects.class.getSimpleName());
        System.out.println(w.getClass()==Worker.class);

        Manager [] managers = new Manager[1];

        System.out.println("managers instanceof Worker[]"+(managers instanceof Worker[]));
        System.out.println("workers instanceof Manager[]"+(workers instanceof Manager[]));
        System.out.println("workers instanceof Worker[]"+(workers instanceof Worker[]));
    }
    public static double avarageSalary(Worker [] w){
        double sum = 0;
        for (Worker worker : w) {
            sum+=worker.getSalary();
        }
        return sum/w.length;
    }
    public static double getAverageBonus(Worker [] w){
        double sum = 0;
        int count = 0;
        for (Worker worker : w) {
            // instanceof проверяет входит ли элемент в множество
            if (worker instanceof Manager) {
                //нисходящее преобразование, downcasting
                sum += ((Manager) worker).getBonus();
                count++;
            }
        }
        return sum/count;
    }
    static double getAverageSalaryOnlyWorkers (Worker [] workers){
        double sum = 0;
        int count = 0;
        for (Worker worker : workers) {
            // ! instanceof проверяет не входит ли элемент в множество
            //if (!(worker instanceof Manager)) { //аналогично
            if (worker.getClass()==Worker.class) {
                sum += worker.getSalary();
                count++;
            }
        }
        return sum/count;
    }
}
