package Lession.T1;

import java.time.Year;

public class Cat {
    private String name;
    private String color;
    private final int birthAge;

    private final long id;

    public Cat(String name, String color, int birthAge) {
        this.name = name;
        this.color = color;
        this.birthAge = birthAge;
        this.id = IdGenerator.newId();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return Year.now().getValue() - this.birthAge;
    }

    public long getId() {
        return this.id;
    }

    private static class IdGenerator {
        private static long id = 1;
        public static long newId() {
            return id++;
        }
    }

}
