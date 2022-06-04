import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.println("|                            Welcome to Password Generator CLI!                               |");
        System.out.println("| With this Password Generating Program you are able to generate Passwords to fit your needs! |");
        System.out.println("-----------------------------------------------------------------------------------------------");

        System.out.println("");
        System.out.println("How long would you like your Password to be?");
        int passwordLength = input.nextInt();

        System.out.println("To generate the Password to your liking answer the following questions with Yes or No:");
        System.out.println("Would you like to include Upper Case Letters?");
        input.nextLine();
        String upperCondition = input.nextLine();

        System.out.println("Would you like to include Lower Case Letters?");
        String lowerCondition = input.nextLine();

        System.out.println("Would you like to include Numbers?");
        String numCondition = input.nextLine();

        System.out.println("Would you like to include Symbols?");
        String symCondition = input.nextLine();

//      Testing the getSpecificationString method
//      System.out.println(SpecificationRandomizer.getSpecificationString(SpecificationRandomizer.upperCaseString));
//      System.out.println(SpecificationRandomizer.getSpecificationString(SpecificationRandomizer.lowerCaseString));
//      System.out.println(SpecificationRandomizer.getSpecificationString(SpecificationRandomizer.numericString));
//      System.out.println(SpecificationRandomizer.getSpecificationString(SpecificationRandomizer.symbolString));
    }
}