package com.example.demo.dto;

import lombok.Getter;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class EmployeeDTO {
    @Getter
    private Long id;
    @Getter
    private String name;
    @Getter
    private String email;
    @Getter
    private Integer age;
    @Getter
    private LocalDate datOfJoining;
public EmployeeDTO(){

}
    public EmployeeDTO(Long id, String name, String email, Integer age, LocalDate datOfJoining, Boolean isActive) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.datOfJoining = datOfJoining;
        this.isActive = isActive;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setDatOfJoining(LocalDate datOfJoining) {
        this.datOfJoining = datOfJoining;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    private Boolean isActive;

}
