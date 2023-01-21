import java.util.ArrayList;
import java.util.Objects;

class Husband extends Wife {
    protected Wife wife;
    public String maritalStatus = "";

    public Husband(String gender, int age, String name) {
        super(gender, age, name);
    }


    @Override
    public Object[] getChildren() {
        return wife.getChildren();
    }


    @Override
    public String toString() {
        return super.toString();
    }

    public  Husband setWife(Wife spouse) {
        this.maritalStatus = "married";
        wife = spouse;

        return Husband.this;
    }
    @Override
    public void getSpouse() {
        if (Objects.equals(maritalStatus, "married")) {
            System.out.println("Жена " + wife);
        } else System.out.println("Нет жены");
    }
    @Override
    public void getMaritalStatus() {
        if (Objects.equals(maritalStatus, "married")) {
            System.out.println("Женат ");
        } else System.out.println("Не женат");
    }


}
