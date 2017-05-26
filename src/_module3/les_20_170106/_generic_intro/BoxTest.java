package _module3.les_20_170106._generic_intro;

public class BoxTest {
    public static void main(String[] args) {
        Box box1 = new Box(new String[]{"AB","CD","EF"});
        System.out.println("box1 = " + box1);

        Box box2 = new Box(new Integer[]{1,2,3});
        System.out.println("box2 = " + box2);

        box1.setN(new Integer(1),0);// боксинг без пула
        box1.setN(1,1);// боксинг с пулом
        System.out.println("box1 = " + box1);

        // мы можем в переменную Object записывать и перезаписывать разные типы
        Object aa = "sdgsdg";
        System.out.println("aa = " + aa);
        aa = new Integer (154651);
        System.out.println("aa = " + aa);


        //problem 1 - storing anything!! Integer, String,...
        box2.setN("AB", 0);
        System.out.println("box2 = " + box2);
        //problem 2 - downcasting + problem 3(from1) - runtime errors
        int a= (Integer)box2.getN(1)+(Integer)box2.getN(2);
        System.out.println("a = " + a);
        //a= (Integer)box2.getN(0)+(Integer)box2.getN(1);//error
        //System.out.println("a = " + a);



    }
}
