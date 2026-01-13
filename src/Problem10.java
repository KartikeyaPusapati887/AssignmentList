import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args){
       Scanner input=new Scanner(System.in);
       int height=input.nextInt();
       double heightInch=height/2.54;
       System.out.println("Your Height in cm is "+height+" while in feet is "+Math.round(heightInch/12)+ " and inches is "+heightInch%12);
    }
}
