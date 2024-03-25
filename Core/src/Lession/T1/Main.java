package Lession.T1;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Bob","Braun",2022);
        Cat cat2 = new Cat("Robert","White",2019);
        Cat cat3 = new Cat("Chack","Red",2020);
        Cat cat4 = new Cat("Will","Grey",2019);
        Cat cat5 = new Cat("Roza","White-Grey",2021);

        System.out.println(cat1.getId() + " " + cat1.getName() + " " + cat1.getAge());
        System.out.println(cat2.getId() + " " + cat2.getName() + " " + cat2.getAge());
        System.out.println(cat3.getId() + " " + cat3.getName() + " " + cat3.getAge());
        System.out.println(cat4.getId() + " " + cat4.getName() + " " + cat4.getAge());
        System.out.println(cat5.getId() + " " + cat5.getName() + " " + cat5.getAge());
    }
}
