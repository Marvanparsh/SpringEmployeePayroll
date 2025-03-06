package com.bridgelabz.employeepayrollapp.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;

public class EmployeeDTO {
    @NotEmpty(message = "Name cannot be empty")
    @Pattern(regexp = "^[A-Z][a-zA-Z\\s]+$", message = "Name must start with uppercase and have only letters and spaces")
    public String name;

    @Min(value = 5000, message = "Salary must be at least 5000")
    public long salary;

    public EmployeeDTO(String name, long salary) {
        this.name = name;
        this.salary = salary;
    }
}
