package com.kat.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "student")
public class Student extends BaseModel {
    private String username;
    private String password;
    private String college;
    private String email;
}