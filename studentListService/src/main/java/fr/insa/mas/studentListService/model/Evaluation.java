package fr.insa.mas.studentListService.model;

public class Evaluation {
	private int studentID;
	private float average;
	
	public Evaluation(int studentID, float average) {
		this.studentID = studentID;
		this.average = average;
	}
	
	// Empty constructor, necessary for JSON to Java deserialization
	public Evaluation() {
		
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
