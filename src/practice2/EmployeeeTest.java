package practice2;

public class EmployeeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date d1 = new Date(2,1,2023);
		Date d2 = new Date(10,6,2001);
		Employeee ee = new Employeee("Priya",20,d2.toString(),d1.toString());
		System.out.println(ee.toString());
	}

}
