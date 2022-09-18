public class Main {
    public static void main(String[] args) {
        double[] mylist = {1.8,2.7,6.8,3.9}; // new double[4] olarak ta yazma ile aynı şeydir.
        double total = 0;
        double max = mylist[0];
        for(double number:mylist){
            if(max<number){
                max = number;
            }
            total = total +number;
            System.out.println(number);
        }
        System.out.println("Toplam = "+total);
        System.out.println("En büyük  = "+max);
    }
}