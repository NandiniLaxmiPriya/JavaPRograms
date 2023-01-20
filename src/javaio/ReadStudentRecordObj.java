package javaio;

public class ReadStudentRecordObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReadStudentRecord rsr = new ReadStudentRecord();
		rsr.opentextFile();
		rsr.readStuRecords();
		rsr.closetextFile();
	}

}
