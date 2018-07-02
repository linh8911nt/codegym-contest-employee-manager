package com.codegym.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "group_employee")
public class GroupEmployee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long group_employee_id;

    private String group_employee_name;
    private String group_employee_desc;

    @OneToMany(targetEntity = Employee.class)
    private List<Employee> employees;

    public GroupEmployee() {
    }

    public GroupEmployee(String group_employee_name, String group_employee_desc, List<Employee> employees) {
        this.group_employee_name = group_employee_name;
        this.group_employee_desc = group_employee_desc;
        this.employees = employees;
    }

    public Long getGroup_employee_id() {
        return group_employee_id;
    }

    public void setGroup_employee_id(Long group_employee_id) {
        this.group_employee_id = group_employee_id;
    }

    public String getGroup_employee_name() {
        return group_employee_name;
    }

    public void setGroup_employee_name(String group_employee_name) {
        this.group_employee_name = group_employee_name;
    }

    public String getGroup_employee_desc() {
        return group_employee_desc;
    }

    public void setGroup_employee_desc(String group_employee_desc) {
        this.group_employee_desc = group_employee_desc;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
