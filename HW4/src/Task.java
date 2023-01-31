public class Task extends TaskList {
    public int deadline;
    public String task;

    public Task(int deadline, String task){
        this.deadline = deadline;
        this.task = task;
    }

    @Override
    public String getTask() {
        return task;
    }

    public int getDeadline() {
        return deadline;
    }

    @Override
    public String toString() {
        return "Задача{" +
                "дней -> " + deadline +
                ",описание: " + task + '\'' +
                '}';
    }
}
