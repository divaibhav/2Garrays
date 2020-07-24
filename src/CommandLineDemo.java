/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 24-Jul-20
 *  Time: 1:25 PM
 */

// parsing and accepting all type from command line
public class CommandLineDemo {
    public static void main(String[] args) {
        int number1 = Integer.parseInt(args[0]);
        byte b = Byte.parseByte(args[1]);
        short s = Short.parseShort(args[2]);
        long l = Long.parseLong(args[3]);
        double d = Double.parseDouble(args[4]);
        float f = Float.parseFloat(args[5]);
        boolean bb = Boolean.parseBoolean(args[6]);
        System.out.println(number1);
        System.out.println(b);
        System.out.println(s);
        System.out.println(l);
        System.out.println(d);
        System.out.println(f);
        System.out.println(bb);
    }
}
