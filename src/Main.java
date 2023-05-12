import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        // Sonucun double değerinde çıkması için result değeri double olarak tanımlanır
        double result = 0;


        Scanner input = new Scanner(System.in);

        // Kullanıcıdan N sayısı alınır
        System.out.print("Harmonik seriyi hesaplamak için N sayısını giriniz: ");
        n = input.nextInt();

        // harmonik seriyi hesaplayacak for döngüsü. Her döngüde 1 sayısını i değerine böler ve i'yi 1 artırır
        for (double i = 1; i <= n; i++){
            result += (1/i);
        }

        System.out.println("Sonuç: " + result);

    }
}