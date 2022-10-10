package lu.uni.programming1.lab1.exercise5;
import java.util.Scanner;

public class Steam{
    double discount1;
    double discount2;
    double discount3;

    double VAT = 1.05;

    double price1;    
    double price2;
    double price3;
    //compute the average temp
    public double PriceTotal()
    {
        double result1 = discount1*price1 + price1;
        double result2 = discount2*price2 + price2;
        double result3 = discount3*price3 + price3;
        double FinalResult = (result1 + result2 + result3) * VAT;
        return FinalResult;
    }

    public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the price for item 1 : ");
        Steam o1=new Steam();        
        o1.price1 = scanner.nextDouble();
        o1.price1 = Math.min(o1.price1,49.99);
        o1.price1 = Math.max(o1.price1,4.99);
        System.out.print("Enter the dicount for item 1 : ");
        o1.discount1 = scanner.nextDouble();
        o1.discount1 = Math.min(o1.discount1,1.0);
        o1.discount1 = Math.max(o1.discount1,0.0);

        System.out.print("Enter the price for item 2 : ");
        o1.price2 = scanner.nextDouble();
        o1.price2 = Math.min(o1.price2,49.99);
        o1.price2 = Math.max(o1.price2,4.99);
        System.out.print("Enter the dicount for item 2 : ");
        o1.discount2 = scanner.nextDouble();
        o1.discount2 = Math.min(o1.discount2,1.0);
        o1.discount2 = Math.max(o1.discount2,0.0);

        System.out.print("Enter the price for item 3 : ");
        o1.price3 = scanner.nextDouble();
		o1.price3 = Math.min(o1.price3,49.99);
        o1.price3 = Math.max(o1.price3,4.99);
        System.out.print("Enter the dicount for item 3 : ");
        o1.discount3 = scanner.nextDouble();
        o1.discount3 = Math.min(o1.discount3,1.0);
        o1.discount3 = Math.max(o1.discount3,0.0);
        
		System.out.println("game 1 base price is : " + o1.price1 + ", the discount for this item is " + o1.discount1);
        System.out.println("game 2 base price is : " + o1.price2 + ", the discount for this item is " + o1.discount2);
        System.out.println("game 3 base price is : " + o1.price3 + ", the discount for this item is " + o1.discount3);
        System.out.println("You have to pay : " +o1.PriceTotal());

		scanner.close();
	}

}