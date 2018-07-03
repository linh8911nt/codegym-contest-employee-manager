package com.codegym.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "group_employee")
public class GroupEmployee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long groupEmployeeId;

    private String groupEmployeeName;
    private String groupEmployeeDesc;

    @OneToMany(targetEntity = Employee.class)
    private List<Employee> employees;

    public GroupEmployee() {
    }

    public GroupEmployee(String groupEmployeeName, String groupEmployeeDesc, List<Employee> employees) {
        this.groupEmployeeName = groupEmployeeName;
        this.groupEmployeeDesc = groupEmployeeDesc;
        this.employees = employees;
    }

    public Long getGroupEmployeeId() {
        return groupEmployeeId;
    }

    public void setGroupEmployeeId(Long groupEmployeeId) {
        this.groupEmployeeId = groupEmployeeId;
    }

    public String getGroupEmployeeName() {
        return groupEmployeeName;
    }

    public void setGroupEmployeeName(String groupEmployeeName) {
        this.groupEmployeeName = groupEmployeeName;
    }

    public String getGroupEmployeeDesc() {
        return groupEmployeeDesc;
    }

    public void setGroupEmployeeDesc(String groupEmployeeDesc) {
        this.groupEmployeeDesc = groupEmployeeDesc;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
