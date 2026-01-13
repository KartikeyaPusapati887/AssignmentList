public class Problem4 {
    public static void main(String []args){
        int Cost=129;
        int SellingPrice=191;
        int Profit=SellingPrice-Cost;
        double ProfitPercentage=((double)Profit/Cost)*100.0;
        System.out.println("The Cost Price is INR" +Cost+ " and Selling Price is INR "+ SellingPrice+ "\nThe Profit is INR "+Profit+ " and the Profit Percentage is "+String.format("%.2f",ProfitPercentage));
    }
}
