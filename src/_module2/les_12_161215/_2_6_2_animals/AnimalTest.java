package _module2.les_12_161215._2_6_2_animals;

public class AnimalTest {
    public static void main(String[] args) {
        Bird [] birds = new Bird[2];
        Fish [] fishs = new Fish[2];
        birds [0] = new Owl("Wise owl", 1.5,true, 40000);
        birds [1] = new Eagle("Wise eagle", 5,true, 1000);
        fishs [0] = new Shark("Tiger shark", 300, true, 3000);
        fishs [1] = new Percidae("Tiger percidae", 2.3, false, 900);
        Animal [] animals = new Animal[birds.length+fishs.length];
        // animals[0] = birds [0];
        // animals[1] = birds [1];
        // animals[2] = fishs [0];
        // animals[3] = fishs [1];
        System.arraycopy(birds,0,animals,0,birds.length);
        System.arraycopy(fishs,0,animals,birds.length,fishs.length);
        //System.out.println(Arrays.toString(animals));// проверка

        for (Animal animal: animals){
            animal.eat();
            animal.sound();
            System.out.println(animal);
            System.out.println(animal.info());
            System.out.println("------------------------------");
        }
        for (Fish fish : fishs) {
            //    fish.
        }

        for (Bird bird : birds) {
            //bird.
        }
        System.out.println(birds[0].info());
        // Создать массив из ... <- Penguin, Shark
        // Заставить их плавать. (fori...{ .swim()})

        Swim [] swimmers = new Swim[4];
        swimmers [0] = new Penguin("Vinni",70, true, 40);
        swimmers [1] = new Penguin("Georg",80, true, 47);
        swimmers [2] = new Shark("Tiger shark", 300, true, 3000);
        swimmers [3] = new Shark("Wale shark", 450, false, 4899);
        for (Swim swimmer : swimmers) {
            System.out.println(swimmer);
            swimmer.swim();
        }
        System.out.println("-------------");


    }
}
