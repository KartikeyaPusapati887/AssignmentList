import java.util.Scanner;

public class Problem8 {
public static void main(String[] args){
    int km;
    Scanner input=new Scanner(System.in);
    km=input.nextInt();
    double miles=km/1.6;
    System.out.println("The total miles is "+ String.format("%.2f",miles)+ " mile for the given "+ km);

}
}
