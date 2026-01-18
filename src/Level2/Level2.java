package Level2;

import java.util.Scanner;

class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] salary = new double[10];
        double[] years = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        for (int i = 0; i < 10; i++) {
            double s = sc.nextDouble();
            double y = sc.nextDouble();

            if (s <= 0 || y < 0) {
                i--;
                continue;
            }

            salary[i] = s;
            years[i] = y;
        }

        for (int i = 0; i < 10; i++) {
            if (years[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total Bonus: " + totalBonus);
        System.out.println("Total New Salary: " + totalNewSalary);
    }
}



class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] age = new int[3];
        double[] height = new double[3];

        for (int i = 0; i < 3; i++) {
            age[i] = sc.nextInt();
            height[i] = sc.nextDouble();
        }

        int youngestAge = age[0];
        double tallestHeight = height[0];

        int youngestIndex = 0;
        int tallestIndex = 0;

        for (int i = 1; i < 3; i++) {
            if (age[i] < youngestAge) {
                youngestAge = age[i];
                youngestIndex = i;
            }

            if (height[i] > tallestHeight) {
                tallestHeight = height[i];
                tallestIndex = i;
            }
        }

        String[] names = {"Amar", "Akbar", "Anthony"};

        System.out.println("Youngest: " + names[youngestIndex]);
        System.out.println("Tallest: " + names[tallestIndex]);
    }
}
class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        int[] digits = new int[10];
        int count = 0;

        while (number > 0 && count < 10) {
            digits[count] = number % 10;
            number = number / 10;
            count++;
        }

        int largest = digits[0];
        int secondLargest = -1;

        for (int i = 1; i < count; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println(largest);
        System.out.println(secondLargest);
    }
}



class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        while (number > 0) {

            if (index == maxDigit) {
                maxDigit = maxDigit + 10;
                int[] temp = new int[maxDigit];

                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }

                digits = temp;
            }

            digits[index] = number % 10;
            number = number / 10;
            index++;
        }

        int largest = digits[0];
        int secondLargest = -1;

        for (int i = 1; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println(largest);
        System.out.println(secondLargest);
    }
}
class Problem5{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int number=input.nextInt();
        int space=10;
        int[] arr=new int[space];
        int index=0;
        while(number>0){
            if(index==space){
                space+=10;
                int[] temp=new int[space];
                for(int i=0;i<arr.length;i++){
                    temp[i]=arr[i];
                }
                arr=temp;
            }
            arr[index]=number%10;
            number=number/10;
            index+=1;
        }
        for(int i=0;i<index;i++){
            System.out.println(arr[i]);
        }
    }
}

 class Problem6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double[] weight = new double[n];
        double[] height = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            weight[i] = sc.nextDouble();
            height[i] = sc.nextDouble();
        }

        for (int i = 0; i < n; i++) {
            bmi[i] = weight[i] / (height[i] * height[i]);

            if (bmi[i] <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi[i] <= 24.9) {
                status[i] = "Normal";
            } else if (bmi[i] <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(height[i] + " " + weight[i] + " " + bmi[i] + " " + status[i]);
        }
    }
}
class Problem7{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int persons=input.nextInt();
        double [][]arr=new double [persons][3];
        String[]status=new String[persons];
for(int i=0;i<persons;i++){
    double height=input.nextDouble();
    while (height < 0) {
        System.out.println("Enter positive value");
         height=input.nextDouble();
    }
    double weight=input.nextDouble();
    double BMI=weight/(height*height);
    arr[i][0]=height;
    arr[i][1]=weight;
    arr[i][2]=BMI;
    if (arr[i][2] <= 18.4) {
        status[i] = "Underweight";
    } else if (arr[i][2] <= 24.9) {
        status[i] = "Normal";
    } else if (arr[i][2] <= 39.9) {
        status[i] = "Overweight";
    } else {
        status[i] = "Obese";
    }
    }
        for (int i = 0; i <persons; i++) {
            System.out.println(
                    arr[i][0] + " " +
                            arr[i][1] + " " +
                            arr[i][2] + " " +
                            status[i]
            );
        }


}

    }



class Problem8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int students = input.nextInt();
        int[][] marks = new int[students][3];
        double[] percentage = new double[students];
        char[] grade = new char[students];
        for (int i = 0; i < students; i++) {
            for (int j = 0; j < 3; j++) {
                int m = input.nextInt();
                if (m < 0) {
                    j--;
                    continue;
                }
                marks[i][j] = m;
            }
        }
        for (int i = 0; i < students; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = total / 3.0;
            if (percentage[i] >= 80) {
                grade[i] = 'A';
            }
            else if (percentage[i] >= 70) {grade[i] = 'B';
            }
            else if (percentage[i] >= 60) {
                grade[i] = 'C';
            } else if (percentage[i] >= 50) {
                grade[i] = 'D';
            } else if (percentage[i] >= 40) {
                grade[i] = 'E';
            } else {grade[i] = 'R';
            }
        }

        for (int i = 0; i < students; i++) {
            System.out.println(
                    marks[i][0] + " " +
                            marks[i][1] + " " +
                            marks[i][2] + " " +
                            percentage[i] + " " +
                            grade[i]
            );
        }
    }
}

class Problem9{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int number=input.nextInt();
        int[][] arr=new int[number][3];
        for(int i=0;i<number;i++){
            for(int j=0;j<3;j++){
                int marks=input.nextInt();
            }
        }
        double[] percentage=new double[number];
        double[] marks=new double[number];
        char[] grades=new char[number];
        for (int i = 0; i < number; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += arr[i][j];
            }

            percentage[i] = sum / 3.0;

            if (percentage[i] >= 80) {
                grades[i] = 'A';
            } else if (percentage[i] >= 70) {
                grades[i] = 'B';
            } else if (percentage[i] >= 60) {
                grades[i] = 'C';
            } else if (percentage[i] >= 50) {
                grades[i] = 'D';
            } else if (percentage[i] >= 40) {
                grades[i] = 'E';
            } else {
                grades[i] = 'R';
            }
        }

        for (int i = 0; i < number; i++) {
            System.out.println(
                    arr[i][0] + " " + arr[i][1] + " " +
                            arr[i][2] + " " + percentage[i] + " " +
                            grades[i]
            );
        }
    }

}
class Problem10{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int number=input.nextInt();
        int[] arr=new int[10];
        int index=0;
        int maxSize=10;
        while(number>0){
            if(index==maxSize){
                maxSize+=10;
                int[] temp=new int[maxSize];
                for(int i=0;i<arr.length;i++){
                    temp[i]=arr[i];

                }
                arr=temp;

            }
            arr[index]=number%10;
            index+=1;
            number=number/10;


        }
        int[] frequency=new int[index];
        for(int j=0;j<index;j++){
            frequency[arr[j]]+=1;

        }
        for(int i=0;i<frequency.length;i++){
            if(frequency[i]!=0){
                System.out.println(i+" "+frequency[i]);
            }

        }
    }

}