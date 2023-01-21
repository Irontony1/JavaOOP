 abstract class Human {
    private String gender;
    private int age;
    private String name;
    protected String maritalStatus = "";

    public Human(String gender, int age, String name) {
        this.gender = gender;
        this.age = age;
        this.name = name;
    }

    public Human() {

    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }



    @Override
    public String toString() {
        return "Человек{" +
                "Пол ='" + gender + '\'' +
                ", Возраст =" + age +
                ", Имя ='" + name + '\'' +
                '}';
    }
}

