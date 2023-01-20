package practice2;

public class GameLauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GuessGame gg = new GuessGame();
		System.out.println("-------------------Rules--------------------");
		System.out.println("The players should input numbers between 0-9");
		System.out.println("--------------------------------------------");
		System.out.println("Happy Playing :) ");
		gg.startGame();
		System.out.println("Happy Ending :) ");

	}

}
