public class Main {
    public static void main(String[] args) {
        int numberOne = 26;
        int numberTwo = 25;
        int numberThree = 27;
        int theBiggest = numberOne;
        if(theBiggest<numberTwo){
            theBiggest = numberTwo;
        }
        if(theBiggest<numberThree){
            theBiggest = numberThree;
        }
        System.out.println("En büyük sayi = "+theBiggest);
    }
}