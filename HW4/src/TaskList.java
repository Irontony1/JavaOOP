import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Date;


public class TaskList {

    public ArrayList<ArrayDeque<Task>> common = new ArrayList<>();
    public ArrayDeque<Task> easy = new ArrayDeque<>();
    public ArrayDeque<Task> normal = new ArrayDeque<>();
    public ArrayDeque<Task> hard = new ArrayDeque<>();
    public static int id = 0;

    public TaskList() {
        this.common.add(hard);
        this.common.add(normal);
        this.common.add(easy);
    }


    public void setTask(Task task) {
        if (task.getDeadline() == 1) {
            common.get(0).add(task);
        } else if (task.getDeadline() == 2) {
            common.get(1).add(task);
        } else common.get(2).add(task);

        writeUsingFiles(getId(), getDateTime(), task.getDeadline(), task.getTask());
    }

    private void writeUsingFiles(String id, String date, int deedline, String task) {
        String filePath = "C:/Users/anton/Desktop/Geek/Practice/Java/JavaOOP/HW4.file.csv";
        String text = id + " |" + date + " |" + deedline + " |" + task + "\n";
        try {
            FileWriter writer = new FileWriter(filePath, true);
            BufferedWriter bufferWriter = new BufferedWriter(writer);
            bufferWriter.write(text);
            bufferWriter.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void readUsingFiles() {
        try {
            File file1 = new File("C:/Users/anton/Desktop/Geek/Practice/Java/JavaOOP/HW4.file.csv");
            FileReader reader = new FileReader(file1);
            int c;
            while ((c = reader.read()) != -1) {

                System.out.print((char) c);
            }
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }


    public String getTask() {
        if (common.get(0).isEmpty() && common.get(1).isEmpty() && common.get(2).isEmpty()) {
            return "Список задач пуст";
        } else if (!common.get(0).isEmpty()) {
            return common.get(0).getFirst().toString();
        } else if (!common.get(1).isEmpty()) {
            return common.get(1).getFirst().toString();
        }
        return common.get(2).getFirst().toString();
    }

    public String getDateTime() {
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }

    public String getId() {
        return Integer.toString(id++);
    }


    @Override
    public String toString() {
        return "Список priori{" +
                "=" + common +
                '}';
    }
}
