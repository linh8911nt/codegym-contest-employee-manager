package com.codegym.model;

import javax.persistence.*;
import java.sql.Date;
import java.time.LocalDate;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long employee_id;

    private String employee_name;
    private boolean gender;
    private Date day_of_birth;
    private String phone_number;
    private String employee_idcard;
    private String employee_email;
    private String employee_address;

    @ManyToOne
    @JoinColumn(name = "group_employ_id")
    private GroupEmployee groupEmployee;

    public Employee() {
    }

    public Employee(String employee_name, boolean gender, Date day_of_birth, String phone_number, String employee_idcard, String employee_email, String employee_address, GroupEmployee groupEmployee) {
        this.employee_name = employee_name;
        this.gender = gender;
        this.day_of_birth = day_of_birth;
        this.phone_number = phone_number;
        this.employee_idcard = employee_idcard;
        this.employee_email = employee_email;
        this.employee_address = employee_address;
        this.groupEmployee = groupEmployee;
    }

    public Long getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(Long employee_id) {
        this.employee_id = employee_id;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public Date getDay_of_birth() {
        return day_of_birth;
    }

    public void setDay_of_birth(Date day_of_birth) {
        this.day_of_birth = day_of_birth;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getEmployee_idcard() {
        return employee_idcard;
    }

    public void setEmployee_idcard(String employee_idcard) {
        this.employee_idcard = employee_idcard;
    }

    public String getEmployee_email() {
        return employee_email;
    }

    public void setEmployee_email(String employee_email) {
        this.employee_email = employee_email;
    }

    public String getEmployee_address() {
        return employee_address;
    }

    public void setEmployee_address(String employee_address) {
        this.employee_address = employee_address;
    }

    public GroupEmployee getGroupEmployee() {
        return groupEmployee;
    }

    public void setGroupEmployee(GroupEmployee groupEmployee) {
        this.groupEmployee = groupEmployee;
    }
}
