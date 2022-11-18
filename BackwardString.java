import java.util.Scanner;

public class BackwardString {

	Scanner input = new Scanner(System.in);
	int min = 5;
	int max = 25;
	String user;
	StringBuilder userInput = new StringBuilder();

	public void Reverse() {
		
		
		System.out.println("Type what you would like reversed:");
		user = input.nextLine();
		
	for(int i = user.length() - 1;  i >= 0; i--) {
		userInput.append(user.charAt(i));
	}
				
			System.out.println(userInput.toString());
			if(userInput.length()< min ||userInput.length()< max)
				System.out.println("Must be 5 - 25 characters long. Try Again:");	
	{
		System.out.println("Must be 5 - 25 characters long. Try Again:");
		user = input.next();
	}
	}

public static void main(String[] args) {
	
	BackwardString test = new BackwardString();
	
	test.Reverse();
	
}
}
