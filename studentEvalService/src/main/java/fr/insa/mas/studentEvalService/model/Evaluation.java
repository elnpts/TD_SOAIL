package fr.insa.mas.studentEvalService.model;

public class Evaluation {
	private int studentID;
	private float average;
	
	public Evaluation(int studentID, float average) {
		this.studentID = studentID;
		this.average = average;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public float getAverage() {
		return average;
	}

	public void setAverage(float average) {
		this.average = average;
	}
}
