package New_Code;
import New_Code.CaffeineBeverage;
public class Tea  extends CaffeineBeverage{
    public void brew() {
        System.out.println("Steeping tea bag");
    }
    public void addCondiments() {
        System.out.println("Adding sugar");
    }
    public boolean customerWantsCondiments() {
        return false;
    }
}