package _module1.les_04_161201.home_work;

public class Task1 {
    public static void main(String[] args) {
       int [] a = {1,5,2,9,11,4,7};
       double average;
       double sum = 0;
       for (int number:a){
           sum+=number;
       }
       average=sum/a.length;
        System.out.println("average = " + average);
        int index = 0;
        double delta = Math.abs(a[index]-average);
        double d;
        for (int i = 1; i < a.length; i++) {
            d = Math.abs(a[i] - average);
            if (d < delta) {
                index = i;
                delta = d;
            }
        }
        System.out.println("most close to average element "+ "is a["+index+"]="+a[index]);
    }
}
