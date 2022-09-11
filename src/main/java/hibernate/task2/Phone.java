package hibernate.task2;

import org.hibernate.mapping.Join;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;

@Entity
@Table(name = "phone")
public class Phone {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column
    private PhoneBrand brand;

    @OneToOne(mappedBy = "phone", fetch = FetchType.LAZY)
    private Employee employee;

    public Phone() {
    }

    public Phone(String phoneNumber, PhoneBrand brand) {
        this.phoneNumber = phoneNumber;
        this.brand = brand;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public PhoneBrand getBrand() {
        return brand;
    }

    public void setBrand(PhoneBrand brand) {
        this.brand = brand;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
