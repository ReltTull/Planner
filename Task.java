public class Task<Type> {
    private Type priorityLvl;
    public String taskName;
    public String description;

    public Task(Type priorityLvl, String name, String description) {
        this.priorityLvl = priorityLvl;
        this.taskName = name;
        this.description = description;
    }

    public void getInfo() {
        System.out.println("Task " + taskName + ": " + description + ", priority - " + priorityLvl);

    }
}
