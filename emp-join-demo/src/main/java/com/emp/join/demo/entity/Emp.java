package com.emp.join.demo.entity;

//import jakarta.persistence.*;
//import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.*;
import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "Employee1")
public class Emp {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Integer id;
    @NotBlank(message = "Please provide valid name")
    @Size(min = 3, max = 20, message = "Name should be minimum 3 character and maximum 20 ")
    private String name;
    private Integer salary;
    @NotBlank
    @Size(max = 1, message = "Maximum 1 character allow")
    private String status;
    @NotNull(message = "Age not valid")
    @Min(value = 18, message = "Minimum age should be 18")
    @Max(value = 100, message = "Maximum age not more than 100")
    private Integer age;

    @NotBlank
    @Email(message = "Please provide a valid Email address")
    private String email;

    @OneToMany
    @JoinColumn(name = "A_id")
    private  List<EmpAddress> address;


}