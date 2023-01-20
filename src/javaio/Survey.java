package javaio;

public class Survey {
	private int surveyNo;
	private int surveyAccuracy;
	public Survey()
	{
		this(0,0);
	}
	public Survey(int i, int j) {
	setSurveyNo(i);
	setSurveyAccuracy(j);
	}
	public int getSurveyNo() {
		return surveyNo;
	}
	public void setSurveyNo(int surveyNo) {
		this.surveyNo = surveyNo;
	}
	public int getSurveyAccuracy() {
		return surveyAccuracy;
	}
	public void setSurveyAccuracy(int surveyAccuracy) {
		this.surveyAccuracy = surveyAccuracy;
	}
	
	
}
