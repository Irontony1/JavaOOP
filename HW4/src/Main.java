import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        TaskList taskList = new TaskList();
        taskList.setTask(new Task(1,"Провести инвентаризацию"));
        taskList.setTask(new Task(2, "Провести собрание"));
        taskList.setTask(new Task(3, "Попить кофе"));

        taskList.setTask(new Task(1, "Купить машину"));
        taskList.setTask(new Task(2, "Заправить машину"));
        taskList.setTask(new Task(5, "Купить цветы"));
        System.out.println(taskList.toString());
        System.out.printf(taskList.getTask());
        taskList.readUsingFiles();
    }
}
