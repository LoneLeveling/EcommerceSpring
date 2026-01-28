package com.example.demo.controllers;

import com.example.demo.dto.EmployeeDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class EmployeeController {
    @GetMapping("/employees/{employeeId}")
    public EmployeeDTO getEmployeebYiD(@PathVariable Long employeeId)
    {
        return new EmployeeDTO(employeeId,"Abhishek","abhi@gmail.com",25, LocalDate.of(2026,2,22),true);
    }

    @GetMapping("/employees")
    public String getEmployeeAge(@RequestParam (required = false) Integer age)
    {
        if(age==null) {
            return "Enter a value for age";
        }
        else return "Hi the age is: "+age;
    }
}
//“@RequestParam is required by default. Without required=false, Spring rejects missing parameters before the controller method is invoked, so null checks inside the method are ineffective.”
//vvimp note: PathVariable conversion happens before controller execution.   If conversion fails, your method is never called.