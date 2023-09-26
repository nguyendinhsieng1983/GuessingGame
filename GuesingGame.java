import java.util.Scanner;

public class GuesingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inpt = new Scanner(System.in);
		
		String strName;
		int counter = 1;

		System.out.println("Please, guess my name.");
		strName = inpt.nextLine();
		
		
		do {
			
			System.out.println("Do you want to quit (y/n) ?");
			String choose = inpt.nextLine();
			
			if ( choose.equals("y")) {
				System.out.println(choose);
				return;
			}
			
			System.out.println("Please, guess my name.");
			strName = inpt.nextLine();
			counter++;
			
			
		} while (!strName.equals("sieng"));

		
		System.out.println(strName);
		System.out.println("Congratulation!");
		System.out.println("Guesses: " + counter);
		
		
	}

}
