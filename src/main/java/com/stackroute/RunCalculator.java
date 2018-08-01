package com.stackroute;
import java.util.*;
import com.stackroute.calculatorpack.Calc;
 
public class RunCalculator{
 
     public static void main(String []args){
         int a,b,choice;
         float result=0;

         Scanner s=new Scanner(System.in); 
          
         System.out.print("Enter first number: ");
         a=s.nextInt();
         System.out.print("Enter second number: ");
         b=s.nextInt();
          
         System.out.print("\n1: Addition.\n2: Subtraction.");
         System.out.print("\n3: Multiplication.\n4: Divide.");
         System.out.print("\n5: Exit.");
          
         System.out.print("\nEnter your choice: ");
         choice=s.nextInt();
         
	Calc c = new Calc();
         switch(choice)
         {
             case 1:
                 result=c.add(a,b); break;
             case 2:
                 result=c.subtract(a,b); break;
             case 3:
                 result=c.multiply(a,b); break;
             case 4:
                 result=c.divide(a,b); break;       
             default:
                 System.out.println("Exiting!!!\n");
         }
         if(choice>=1 && choice<=5)
            System.out.println("Result is: " + result);
          
     }
}
