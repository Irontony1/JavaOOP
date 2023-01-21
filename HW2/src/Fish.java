public class Fish extends Animal implements GoodMood {

    public Fish(String nickName, String color, int age) {
        super(nickName, color, age);
    }


    @Override
    public void eat() {
        if (super.mood < 10 && super.mood > 0) {
            super.mood += 1;
        }
    }

    @Override
    public void play() {
        //nothing
    }
}
