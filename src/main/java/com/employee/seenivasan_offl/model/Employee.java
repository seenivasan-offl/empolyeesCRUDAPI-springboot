package com.employee.seenivasan_offl.model;

import jakarta.persistence.*;
import lombok.*;
import javax.validation.constraints.Positive;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;

    @Positive(message = "Salary must be positive")
    private double salary;

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', email='" + email + "', salary=" + salary + "}";
    }
}
