package _module2.les_17_170103.TestOOP;

public class Test3 {
        public static void main(String[] args) {
            new ExampleClass2().getVersion();
        }
    }
    class ExampleClass1 {
        private String version = "curent версія: 0.1 a";
        private void getVersion() {
            System.out.println(version);
        }
    }
    class ExampleClass2 extends ExampleClass1 {
        private String version = "curent version: 0.5 b";
        //@Override //error!
        public void getVersion() {
            System.out.println(version);
        }

}
