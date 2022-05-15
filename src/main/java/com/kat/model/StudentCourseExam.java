package com.kat.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "student_course_exam")
public class StudentCourseExam extends BaseModel {
    @ManyToOne
    private Student student;
    @ManyToOne
    private CourseExam courseExam;
    private int mark;
}