public class Main {
    public static void main(String[] args) {
        Cat bob = new Cat("bobick","white", 1);
        Dog murz = new Dog("Murzick","black",2);
        bob.eat();
        bob.play();
        bob.stepOn();
        murz.dirty();
        murz.hungry();
        Fish di = new Fish("didi","blue",3);
        di.eat();
        System.out.println(di.getMood());
        System.out.println(murz.getMood());
        System.out.println(bob.getMood());
    }
}