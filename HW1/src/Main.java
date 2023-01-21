import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Husband person1 = new Husband("m", 25, "Nikolai");
        Wife person2 = new Wife("w", 23, "Kate");
        person2.setHusband(person1.setWife(person2));
        person2.getSpouse();
        person1.getSpouse();
        person2.getMaritalStatus();
        person1.getMaritalStatus();
        person2.setChildren(new Children("w", 0, "pole"));
        person2.setChildren(new Children("m", 1, "pol"));
        person2.setChildren(new Children("w", 3, "viktor"));
        System.out.println(Arrays.toString(person1.getChildren()));
        System.out.println(Arrays.toString(person2.getChildren()));

    }
}