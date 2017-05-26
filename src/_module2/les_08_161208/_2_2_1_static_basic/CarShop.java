package _module2.les_08_161208._2_2_1_static_basic;

public class CarShop {
    private Car[] cars;
    private int maxIndex;

    public CarShop(int maxCount) {
        cars = new Car[maxCount];
        maxIndex = -1;
    }

    public void add(Car car) {  //тип, как Integer n
        //maxIndex++;
        //cars[maxIndex]=car;
        if (maxIndex < cars.length - 1)
            cars[++maxIndex] = car;
        else
            System.out.println("no place to add car!" + car + "!");//если превысим в CarShop shop=new CarShop(10); значение 10

    }

    /*public void delete(int number){
         //if(maxIndex<cars.length-1)
         cars[number]=cars[maxIndex--];
        //else System.out.println("no place to add car!"+car+"!");//если превысим в CarShop shop=new CarShop(10); значение 10

    }*/
    public void delete(int n) {
        if (0 < n && n <= maxIndex) {
            cars[n] = cars[maxIndex];
            cars[maxIndex] = null;
            maxIndex--;
        } else {
            System.out.println("Cannot delete! " + "Index" + n + " is not correct!");
        }

    }

    public void printCarsAfterYear(int year) {
        //for(Car car:cars){        if(car.getYear()>=year) System.out.println(car);)}
        for (int i = 0; i <= maxIndex; i++) {
            if (cars[i].getYear() >= year)
                System.out.println(cars[i]);
        }

    }
   /* public void printCarsAfterLetter(char c){
        for (char i = "A"; i <="Z" ; i++){
        if (cars[i].getName().charAt(0) = c)
            System.out.println(cars[i]);
    }*/

    public void printCarsAfterLetter(char c) {
        for (int i = 0; i <= maxIndex; i++) {
            if (cars[i].getName().charAt(0) >= c)
                System.out.println(cars[i]);
        }
    }

    public int getAverageAge (){
        int avarageAge = 0;
        for (int i = 0; i <= maxIndex; i++) {
            avarageAge +=2016-  cars[i].getYear();
        }
        System.out.println("maxIndex = " + maxIndex);
        return avarageAge/=maxIndex+1;
    }

    public double getAverageAgeClass() {
        double sum = 0;
        double aver;
        for (int i = 0; i <= maxIndex; i++) {
            sum += 2016- cars[i].getYear();
        }
        aver = sum / (maxIndex+1);
        System.out.println("maxIndex = " + maxIndex);
        return aver;
    }

    public boolean containsCar(String name){
        for (int i = 0; i <= maxIndex; i++) {
            if (cars[i].getName()==name) return true;
        } return false;
    }

    public void print() {
        for (int i = 0; i <= maxIndex; i++) {
            System.out.println(cars[i]);
        }
    }
}
