package Main.java;
import java.util.Scanner;

 class Problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] ages = new int[10];
        for (int i = 0; i < ages.length; i++) {
            ages[i] = input.nextInt();
        }
        for(int j = 0; j < ages.length; j++) {
            if (ages[j] > 18) {
                System.out.println("The student with the age " + ages[j] + " can vote");
            }
            else{
                System.out.println("The student with the age " + ages[j] + " cannot vote");
            }
        }
    }

}
class Problem2{
     public static void main(String[] args){
         Scanner input = new Scanner(System.in);
         int[] arr=new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }
    for(int j=0;j<arr.length;j++){
        if(arr[j]<0){
            System.out.println("Negative");
        }
        else if(arr[j]==0){
            System.out.println("Zero");
        }
        else{
            if(arr[j]%2==0){
                System.out.println("Even");
            }
            else{
                System.out.println("Odd");
            }
        }
    }
     }

}
class Problem3{
     public static void main(String[] args){
         Scanner input = new Scanner(System.in);
         int number=input.nextInt();
         int[] arr=new int[10];
         for(int i=1;i<11;i++){
             arr[i-1]=i*number;
         }
         for (int i = 1; i <= 10; i++) {
             System.out.println(number + " * " + i + " = " + arr[i - 1]);
         }
     }


}


class Problem4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] arr = new double[10];
        double total = 0.0;
        int index = 0;

        while (true) {
            double value = sc.nextDouble();

            if (value <= 0)
                break;

            if (index == 10)
                break;

            arr[index] = value;
            index++;
        }

        for (int i = 0; i < index; i++) {
            System.out.println(arr[i]);
            total += arr[i];
        }

        System.out.println(total);
    }
}


class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int[] multiplicationResult = new int[4];

        int index = 0;
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[index] = number * i;
            index++;
        }

        index = 0;
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[index]);
            index++;
        }
    }
}


class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] heights = new double[11];
        double sum = 0.0;

        for (int i = 0; i < 11; i++) {
            heights[i] = sc.nextDouble();
        }

        for (int i = 0; i < 11; i++) {
            sum += heights[i];
        }

        double mean = sum / 11;
        System.out.println(mean);
    }
}
class Problem7{
     public static void main(String[] args){
         Scanner input=new Scanner(System.in);
         int number=input.nextInt();
         int[] evenarr=new int[number/2+1];
         int[] oddarr=new int[number/2+1];
         int e=0;
         int o=0;
         for(int i=1;i<=number;i++){
             if(i%2==0){
                 evenarr[e]=i;
                 e++;
             }
             else{
                 oddarr[o]=i;
                 o++;
             }
         }

         System.out.println("Odd numbers:");
         for (int i = 0; i <e; i++) {
             System.out.println(oddarr[i]);
         }

         System.out.println("Even numbers:");
         for (int i = 0; i < o; i++) {
             System.out.println(evenarr[i]);
         }
     }
}
class Problem8{
     public static void main(String[] args){
         int[] factors=new int[10];
         int maxFactor=10;
         Scanner input=new Scanner(System.in);
         int number=input.nextInt();
         int index=0;
         for(int i=0;i<=number;i++){
             if(number%i==0){
             if(index==maxFactor+1){
                 maxFactor=maxFactor*2;
                 int[] temp=new int[maxFactor];
                 for(int j=0;j<=maxFactor/2;j++){
                     temp[j]=factors[j];

                 }
                 factors=temp;

             }
             factors[index]=i;
             index++;
             }


         }
for(int i=0;i<factors.length;i++){
    System.out.println(i);
}


     }

}