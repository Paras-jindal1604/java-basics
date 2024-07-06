import java.util.Scanner;
public class takinginput {
    public static void main(String[] args) {
    
        Scanner scn = new Scanner(System.in);
        
        // area of circle 
         /* 
        System.out.print("Enter radius of circle: ");

        int r = scn.nextInt();
        double area = 3.14*r*r;
        System.out.println(" Area of circle is : " + area);
        */

        // take 2 integers and find remainder without modulo operator

        int a = scn.nextInt();
        int b = scn.nextInt();

        int q = a/b;
        int r = a - (b*q);
        System.out.println("remainder is: " + r);



        System.out.println(2*3/4+7/4+8-2+5/8);
    }
    
}





