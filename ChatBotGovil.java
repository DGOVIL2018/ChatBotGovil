import java.util.Scanner;

public class ChatBotGovil
{
	public static void main (String[] args)
	{

		Scanner kb = new Scanner(System.in);
		System.out.print("Please enter your first and last name, or type bye if you dont want to chat: ");
		String Name = kb.nextLine();
		if (Name == "bye" || Name == "Bye")
		{
			System.out.println("Well, ok then, don't talk to me.");
			System.exit(0);
		}


		while(!(Name.equals("bye") || Name.equals("Bye")))
		{
			System.out.println("Hey " + Name + ". Let us chat!");
			
			System.out.println("Enter your weight: ");
			double weight = kb.nextDouble();
			
			if (weight < 120 )
			{
				System.out.println("You are light! Eat more food!");
			}
			
			else
			{
				System.out.println("You are heavy... eat less!");
			}	

			System.out.print("What is your height in feet?: ");
			double height = kb.nextDouble();

			if (height < 5.0 )
			{
				System.out.println("You are short!");
			}
			
			else
			{
				System.out.println("You are tall!");
			}	
		
			System.out.print("Enter your GPA: ");
			double GPA = kb.nextDouble();

			if (GPA < 3.0 )
			{
				System.out.println("START STUDYING!");
			}
	
			else
			{
				System.out.println("You are smart!");
			}

}



	

	}




}