package practice2;

public class GradeBookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int grades[] = {88,97,55,78,93,64,76,97,100,98};
		GradeBook gb = new GradeBook("Science",grades);
		gb.displayGrades();
		gb.displayReport();
	}

}
