public class ToDoItem {
    private String description;
    private boolean isDone;

    public ToDoItem(String description) {
        this.description = description;
        isDone = false;
    }

    public String getDescription() {
        return description;
    }

    // Setter for description
    public void setDescription(String description) {
        this.description = description;
    }

    // Getter for isDone
    public boolean isDone() {
        return isDone;
    }

    // Setter for isDone
    public void setDone(boolean isDone) {
        this.isDone = isDone;
    }
}
