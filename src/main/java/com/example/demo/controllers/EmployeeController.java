package com.example.demo.controllers;

import com.example.demo.dto.EmployeeDTO;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {
    @GetMapping("/employees/{employeeId}")
    public EmployeeDTO getEmployeebYiD(@PathVariable(name = "employeeId") Long Id) {
        return new EmployeeDTO(Id, "Abhishek", "abhi@gmail.com", 25, LocalDate.of(2026, 2, 22), true);
    }

    @GetMapping
    public String getEmployeeAge(@RequestParam(required = false, name = "inputAge") Integer age,
                                 @RequestParam(required = false) String sortBy)  //required = false <-- makes the field optional
    {
        {
            if ( age== null) {
                return "Enter a value for ";
            } else return "Hi the  is: "+age+ " "+sortBy;

        }
    }
    @PostMapping
    public EmployeeDTO createNewEmployee(@RequestBody EmployeeDTO employeeDTO)
    {
        employeeDTO.setId(100L);
        employeeDTO.setName("Abhishek");
        return employeeDTO;
    }

    @PutMapping
    public String updateEmployeeById()
    {
        return "Hello from PUT";
    }
}
//“@RequestParam is required by default. Without required=false, Spring rejects missing parameters before the controller method is invoked,
// so null checks inside the method are ineffective.”
//vvimp note: PathVariable conversion happens before controller execution. If conversion fails, your method is never called.