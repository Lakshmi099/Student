package com.student.demo.model;

import java.util.List;

import lombok.Data;

@Data
public class StudentInfo {
	private String studentId;
	private String name;
	private List<Marks> marks;
}
