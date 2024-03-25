package Lession.T2;

import Lession.T2.Animal.Cat;
import Lession.T2.Animal.Dog;
import Lession.T2.Animal.Bird;
import Lession.T2.Obstacle.Obstacle;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik");
        Dog dog1 = new Dog("Bobik");
        Bird bird1 = new Bird("Chirik");
        Obstacle waterObstacle = new Obstacle(145,0.0);
        Obstacle highObstacle = new Obstacle(0,1.6);
        Obstacle longObstacle = new Obstacle(1000,0.0);

        System.out.println(cat1.getName() + " смог преодолеть препядствие? " + cat1.run(longObstacle));
        System.out.println(cat1.getName() + " смог преодолеть препядствие? " + cat1.jump(highObstacle));
        System.out.println(cat1.getName() + " смог преодолеть препядствие? " + cat1.swimm(waterObstacle));
        System.out.println(dog1.getName() + " смог преодолеть препядствие? " + dog1.run(longObstacle));
        System.out.println(dog1.getName() + " смог преодолеть препядствие? " + dog1.jump(highObstacle));
        System.out.println(dog1.getName() + " смог преодолеть препядствие? " + dog1.swimm(waterObstacle));
        System.out.println(bird1.getName() + " смог преодолеть препядствие? " + bird1.run(longObstacle));
        System.out.println(bird1.getName() + " смог преодолеть препядствие? " + bird1.jump(highObstacle));
        System.out.println(bird1.getName() + " смог преодолеть препядствие? " + bird1.swimm(waterObstacle));
    }
}
