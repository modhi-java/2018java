package app;

import java.util.Scanner;

public class SmallestValue {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("أدخل الرقم الأول: ");
        double x = in.nextDouble();
        System.out.print("Input the Second number: ");
        double y = in.nextDouble();
        System.out.print("Input the third number: ");
        double z = in.nextDouble();
        System.out.print("The smallest value is " + smallest(x, y, z)+"\n" );
        System.out.print("أكبر قيمة " + maxest(x, y, z)+"\n" );
    }

    public static double smallest(double x, double y, double z)
    {
        return Math.min(Math.min(x, y), z);
    }

    public static double maxest(double x, double y, double z)
    {
        return Math.max(Math.min(x, y), z);
    }

}
