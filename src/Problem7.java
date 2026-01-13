public class Problem7 {
    public static void main(String[] args){
        int radius=6378;
        double VolumeInKms=Math.PI*Math.pow(radius,3)*4/3;
        double VolumeInMi=VolumeInKms/Math.pow(1.6,3);
        System.out.println("The volume of earth in cubic kilometers is "+String.format("%.2f",VolumeInKms)+ " and cubic miles is "+String.format("%.2f",VolumeInMi));

    }
}
