import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String message = "Bugün hava çok güzel.";
        System.out.println(message);
       /* System.out.println("Eleman sayısı : "+message.length());
        System.out.println("5.eleman : "+message.charAt(4));
        System.out.println(message.concat("Yaşasın!"));
        System.out.println(message.startsWith("B"));
        System.out.println(message.endsWith("."));
        char[] characters = new char[5];
        message.getChars(0,5,characters,0);
        System.out.println(characters);
        System.out.println(message.indexOf('a'));
        System.out.println(message.lastIndexOf( "a"));*/

        String newMessage = message.replace(' ','-');
        System.out.println(newMessage);//String fonksiyonların neredeyse hepsi yeni bir çıktı üretmez metnin kendisini değiştirir.
        System.out.println(message.substring(2,5));// sıklıkla kullanılan bir metotdur.

        for(String word : message.split(" ")){
            System.out.println(word);

        }
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());//Özellikler veri tabanlarına arama ifadesi gönderdiğimizde kullanırız.
        System.out.println(message.trim());



    }
}