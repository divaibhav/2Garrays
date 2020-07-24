/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 24-Jul-20
 *  Time: 1:40 PM
 */
/*
Accept 5 command line arguments and print them on console, if there's no argument
print No Arguments, if there 1 or 2 or 3 or 4 then print respective number
of arguments
 */
public class CommandLineTask {
    public static void main(String [] args){
       try {
           for (int i = 0; i < 1; i++) {
               int a = Integer.parseInt(args[0]);
               int b = Integer.parseInt(args[1]);
               int c = Integer.parseInt(args[2]);
               int d = Integer.parseInt(args[3]);

               System.out.println("Argument 1 -->" + a);
               System.out.println("Argument 2-->" + b);
               System.out.println("Argument 3-->" + c);
               System.out.println("Argument 4-->" + d);
           }
       }catch (Exception e){
           System.out.println("Printing no Arguments.");
           System.out.println("You Enter only four number's.");
       }
    }
}

