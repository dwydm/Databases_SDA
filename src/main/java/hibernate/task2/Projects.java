package hibernate.task2;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Projects {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String projectName;
    @ManyToMany
    @JoinTable(name = "Project_Employee",
    joinColumns = {
            @JoinColumn(name = "project_id")},
            inverseJoinColumns = {
            @JoinColumn(name = "employee_id")
    })
    private List<Employee> employeeList;

    public Projects(String projectName) {
        this.projectName = projectName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    @Override
    public String toString() {
        return "Projects{" +
                "projectName='" + projectName + '\'' +
                '}';
    }
}
