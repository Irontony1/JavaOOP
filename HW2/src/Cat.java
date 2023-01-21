public class Cat extends Animal implements GoodMood, BadMood {

    public Cat(String nickName, String color, int age) {
        super(nickName, color, age);
    }

    public void voice() {
        System.out.println("мяу");
    }

    @Override
    public void eat() {
        if (super.mood < 10 && super.mood > 0) {
            System.out.println("Я поел, спаисбо :)");
            super.mood += 1;
        }
    }

    @Override
    public void play() {
        if (super.mood < 10 && super.mood > 0){
            System.out.println("Наигрался , мяу");
            super.mood += 1;
        }
    }

    @Override
    public int getMood() {
        return super.getMood();
    }

    @Override
    public void stepOn() {
        if (super.mood < 10 && super.mood > 0) {
            System.out.println("маааааяу");
            super.mood -= 2;
        }
    }

    @Override
    public void dirty() {
        if (super.mood < 10 && super.mood > 0) {
            System.out.println("Мойдодыр");
            super.mood -= 1;
        }
    }

    @Override
    public void hungry() {
        if (super.mood < 10 && super.mood > 0) {
            super.mood -= 3;
        }
    }
}
