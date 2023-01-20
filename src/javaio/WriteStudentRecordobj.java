package javaio;

public class WriteStudentRecordobj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WriteStudentRecord wrs = new WriteStudentRecord();
		wrs.openTextFile();
		wrs.readIntoStudent();
		wrs.closeTextFile();
	}

}
