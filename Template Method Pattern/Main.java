import java.util.Scanner;
// import Old_Code.Tea;
// import Old_Code.Coffee;

import New_Code.Tea;
import New_Code.Coffee;

public class Main{
    public static void main(String[] args){
        // Old Code exmaple 
        Tea tea = new Tea();
        Coffee coffee = new Coffee();
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like tea or coffee?");
        String beverage = scanner.nextLine();

        if (beverage.equals("tea")) {
            System.out.println("Making tea...");
            tea.prepareRecipe();
        } else if (beverage.equals("coffee")) {
            System.out.println("\nMaking coffee...");
            coffee.prepareRecipe();
        }
    }
}