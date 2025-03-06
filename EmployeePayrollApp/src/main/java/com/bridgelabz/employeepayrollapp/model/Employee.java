package com.bridgelabz.employeepayrollapp.model;

import com.bridgelabz.employeepayrollapp.dto.EmployeeDTO;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "employee_payroll")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private long salary;

    public Employee() {}

    public Employee(EmployeeDTO employeeDTO) {
        this.name = employeeDTO.getName();   // Use getter instead of direct field access
        this.salary = (long) employeeDTO.getSalary();
    }



}
