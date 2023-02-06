//Denny To
//CSCI 1301
//Program Two
package programTwo;
import java.util.Scanner;
public class ToDennyProgramTwo {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		
		//Asking user for inputs for height
		double heightInches;
		System.out.print("Enter your height in inches: ");
		Scanner scnr1 = new Scanner(System.in);
		heightInches = scnr1.nextDouble();
		
		//Asking user for inputs for weight
		double weightPounds;
		System.out.print("Enter your weight in pounds: ");
		Scanner scnr2 = new Scanner(System.in);
		weightPounds = scnr2.nextDouble();
		
		//Asking user for inputs for age
		double ageYears;
		System.out.print("Enter your age in years: ");
		Scanner scnr3 = new Scanner(System.in);
		ageYears = scnr3.nextDouble();
		
		//Asking user for inputs for gender
		String gender;
		System.out.print("Enter your gender (M/F): ");
		Scanner scnr4 = new Scanner(System.in);
		gender = scnr4.next();
		//determining which BMR formula to use by using if statements
		double BMR = 0;
		if (gender.equals("M")) {
			BMR = 665 + (6.23 * weightPounds) + (12.7 * heightInches) - (6.8 * ageYears);
		}
		else if (gender.equals("F")) {
			BMR = 655 + (4.35 * weightPounds) + (4.7 * heightInches) - (4.7 * ageYears);
		}
		else {
			System.out.println("Invalid response.");
			System.exit(0);
		}
		
		//Asking user for inputs for amount of physical activity
		int activity;
		System.out.println("\n" + "Which of the following indicates the"
				+ " amount of physical activity that you engage in in a week: ");
		System.out.println("1. You don't exercise");
		System.out.println("2. You engage in light exercise "
				+ "one to three days a week.");
		System.out.println("3. You exercise moderately "
				+ "three to five times a week.");
		System.out.println("4. You exercise intensely "
				+ "six to seven days a week.");
		System.out.println("5. You exercise intensely "
				+ "six to seven days a week and have a physically active job.");
		System.out.print("Enter the number corresponding with your choice: ");
		
		//Calculating BMR with the inclusion of physical activity using if-else statments
		Scanner scnr5 = new Scanner(System.in);
		activity = scnr5.nextInt();
		if (activity == 1) {
			BMR = BMR * 1.2;
		}
		else if (activity == 2) {
			BMR = BMR * 1.375;
		}
		else if (activity == 3) {
			BMR = BMR * 1.55;
		}
		else if (activity == 4) {
			BMR = BMR * 1.725;
		}
		else if (activity == 5) {
			BMR = BMR * 1.9;
		}
		else {
			System.out.println("Invalid response.");
			System.exit(0);
		}
		
		System.out.printf("Your BMR is %,.2f.\n", BMR);
		
		//Asking user if they have any meals to enter
		Scanner scnr7 = new Scanner(System.in);
		int calories = 0;
		int addCalories;
		
		int totalCalories;
		System.out.print("\n" + "Enter your calorie limit for the day: ");
		Scanner scnr8 = new Scanner(System.in);
		totalCalories = scnr8.nextInt();
		
		String moreMeals;
		System.out.print("\n" + "Thanks. Do you have meals to enter? (Y/N): ");
		Scanner scnr6 = new Scanner(System.in);
		moreMeals = scnr6.next();
		
		if (moreMeals.equals("Y")) { //if user inputs Y, a while loop is activated, and runs until user inputs N
			while (moreMeals.equals("Y")) {
				System.out.print("Input the amount of calories in your meal: ");
				addCalories = scnr7.nextInt();
				calories = calories + addCalories;
				System.out.println("Updated calorie count: " + calories);
				System.out.println("Calories left for the day: " + (totalCalories - calories) + "\n");
				System.out.print("Do you have more meals to enter? (Y/N): ");
				moreMeals = scnr6.next();
				if (calories == totalCalories) {
					System.out.println("\n" + "You have reached the calorie limit for the day.");
					System.out.println("Thank you for playing.");
					System.exit(0);
				}
				if (calories > totalCalories) {
					System.out.println("\n" + "You have reached the calorie limit for the day.");
					System.out.println("Thank you for playing.");
					System.exit(0);
				}
				if (moreMeals.equals("N")) {
					System.out.println("\n" + "You have " + (totalCalories - calories) + " calories left for the day");
					System.out.println("Thank you for playing.");
					System.exit(0);
				}
			}	
		}
		else if (moreMeals.equals("N")){
			System.out.println("No? Thank you for playing.");
		}
		
	}

}
