import java.util.Scanner;

public class Problem9 {

        public static void main(String[] args){
            Scanner input=new Scanner(System.in);
            int fees=input.nextInt();
            int discountPercent=input.nextInt();
            double discount=fees*discountPercent/100.0;

            System.out.println(fees-discount);
        }
    }


