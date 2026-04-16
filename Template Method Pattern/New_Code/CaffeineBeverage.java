package New_Code;
import java.util.Scanner;
public abstract class CaffeineBeverage {
   final public void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if  (customerWantsCondiments()){
            addCondiments();
        }
    }

    public void boilWater() {
        System.out.println("Boiling water");
    }

    public void pourInCup() {
        System.out.println("Pouring into cup");
    }

    public boolean customerWantsCondiments() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like sugar and milk?");
        String response = scanner.nextLine();
        return response.equals("yes");
    }
    public abstract void brew();
    public abstract void addCondiments();


}

        