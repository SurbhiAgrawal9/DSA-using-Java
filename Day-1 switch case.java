// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
        String fruit = sc.next();
        switch(fruit) { 
             case "Mango": 
                System.out.print("king of fruit");
                break;
                case "Apple":
                    System.out.print("A sweet red fruit");
                    break;
                case "Orange":
                        System.out.print("Round fruit");
                        break;
                case "Grapes":
                            System.out.print("Small fruit");
                            break;
              default :
                System.out.println("please enter the valid fruit");
        }
       
    }
}
