import java.util.Scanner;

public class Problem12 {
public static void main(String[] args){
Scanner input=new Scanner(System.in);
int distanceInFeet=input.nextInt();
float distanceInYards=distanceInFeet/3.0f;
int distanceInMiles=(int)distanceInYards/1760;
float remainingYards=distanceInYards%1760;
System.out.printf("Your Height in feet is %d while in miles is %d and yards is %.2f",distanceInFeet,distanceInMiles,remainingYards);


}



}
