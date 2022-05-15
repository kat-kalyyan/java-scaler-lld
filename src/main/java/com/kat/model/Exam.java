package com.kat.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "exam")
public class Exam extends BaseModel {
    private int duration;
}