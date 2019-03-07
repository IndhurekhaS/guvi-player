import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        switch(s1)
        {
            case "Monday":
                System.out.println("no");
                break;
            case "Tuesday":
                System.out.println("no");
                break;
            case "Wednesday":
                System.out.println("no");
                break;
            case "Thursday":
                System.out.println("no");
                break;
            case "Friday":
                System.out.println("no");
                break;
            case "Saturday":
                System.out.println("yes");
                break;
            case "Sunday":
                System.out.println("yes");
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}
