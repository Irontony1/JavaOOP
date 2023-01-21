import java.util.ArrayList;
import java.util.Objects;

public class Wife extends Human {
    protected ArrayList<Children> children = new ArrayList<>();
    protected Husband husband;
    protected String maritalStatus = "";


    public Wife(String gender, int age, String name) {
        super(gender, age, name);
    }


    @Override
    public String toString() {
        return "Человек{" +
                " Пол ='" + getGender() + '\'' +
                ", Возраст =" + getAge() +
                ", Имя ='" + getName() + '\'' +
                '}';
    }

    public void setHusband(Husband spouse) {
        this.maritalStatus = "married";
        husband = spouse;
    }

    public void getSpouse() {
        if (Objects.equals(maritalStatus, "married")) {
            System.out.println("Mуж " + husband);
        } else System.out.println("Нет мужа");
    }

    public void getMaritalStatus() {
        if (Objects.equals(maritalStatus, "married")) {
            System.out.println("Замужем ");
        } else System.out.println("Не замужем");

    }

    public void setChildren(Children kid) {
        if (Objects.equals(maritalStatus, "married")) {
            children.add(kid);
        }
        //kid.mother = Wife.this;
        //kid.Father = husband;

    }

    public Object[] getChildren() {
        return children.toArray();
    }


}


