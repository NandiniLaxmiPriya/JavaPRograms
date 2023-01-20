package javaio;

public class SurveyWriteObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SurveyWrite sw = new SurveyWrite();
		sw.openInToFile();
		sw.readSurvey();
		sw.closeInFile();
		
	}

}
