package practice1;

public class Enumprac {
	enum temp
	{
		HIGH,
		MODERATE,
		LOW
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		temp var = temp.MODERATE;
			switch(var)
			{
			case LOW:
				System.out.println("Temp is Low");
				break;
			case MODERATE:
				System.out.println("Temp is moderate");
				break;
			case HIGH:
				System.out.println("Temp is High");
				break;
			default:
				System.out.println("NOTHING");
			}
		
	}

}
