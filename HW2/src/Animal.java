
public abstract class Animal {
    private String nickName;
    private String color;
    private int age;
    protected int mood = 5;   // Шкала настроения от 0 (укусит) до 10 (играется и целует)

    public Animal(String nickName, String color, int age) {
        this.nickName = nickName;
        this.color = color;
        this.age = age;
    }

    public String getNickName() {
        return nickName;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMood(){
        return this.mood;
    }

}
