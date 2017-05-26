package _module2.les_10_161213.home_work;

public class TestSpaceObjects {
    public static void main(String[] args) {
        SpaceObjects [] spaceObjects = new SpaceObjects[3];
        spaceObjects [0] = new SpaceObjects(100000);
        spaceObjects [1] = new Star(10000,10000);
        spaceObjects [2] = new Planet(1000,3);
        for (SpaceObjects spaceObject : spaceObjects) {
            System.out.println(spaceObject);
            spaceObject.show();
        }

    }
}
