package hibernate.task2;

import javax.persistence.*;

@Entity
@Table(name = "tasks")
public class Tasks {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String title;
    @Column
    private TaskType taskType;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    public Tasks(String title, TaskType taskType) {
        this.title = title;
        this.taskType = taskType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public TaskType getTaskType() {
        return taskType;
    }

    public void setTaskType(TaskType taskType) {
        this.taskType = taskType;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Tasks{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", taskType=" + taskType +
                '}';
    }
}
