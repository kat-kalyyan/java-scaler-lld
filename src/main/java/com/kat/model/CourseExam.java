package com.kat.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.sql.Date;

@Getter
@Setter
@Entity
@Table(name = "course_exam")
public class CourseExam extends BaseModel {
    @ManyToOne
    private Course course;
    @ManyToOne
    private Exam exam;
    private Date scheduledDate;
}