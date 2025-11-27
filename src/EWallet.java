
import java.util.Scanner;

public class EWallet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //input

        // İstifadəçidən cari balansını soruşmaq
        System.out.println("Elektron Pul Kisəsinə Xoş Gəlmisiniz!");
        System.out.print("Cari balansınızı daxil edin (AZN): "); // senin balansin
        double balance = scanner.nextDouble(); //here u add ur balance

        // Balansın miqdarına görə bonus xəbərdarlığı -
        if (balance < 100) {
            System.out.println("Balans aşağıdır. Əlavə edin və 5% bonus qazanın.");
        } else if (balance >= 100 && balance <= 500) {
            System.out.println("Balans stabildir. Bütün əməliyyatlar sığortalanır.");
        } else {
            System.out.println("Siz VIP müştərisiniz! Bütün köçürmələr pulsuzdur.");
        }

        // Əməliyyat növlərini göstərmək
        System.out.println("\n--- Mövcud Əməliyyatlar ---");
        System.out.println("1 - Pul Köçürmə");
        System.out.println("2 - Balans Artırma");
        System.out.println("3 - Hesab Ödənişi");
        System.out.println("4 - Qızıl Alma");

        System.out.print("Əməliyyat növünü seçin (1-4): ");
        int operation = scanner.nextInt();

        // Əməliyyat seçiminə görə ilkin mərhələ
        switch (operation) {
            case 1:
                System.out.println("Pul Köçürmə əməliyyatı seçildi.");
                System.out.println("Zəhmət olmasa köçürəcəyiniz məbləği və alıcının hesab nömrəsini daxil edin.");
                System.out.println("Komissiya: 0.5% (VIP müştərilər üçün pulsuz)");
                break;
            case 2:
                System.out.println("Balans Artırma əməliyyatı seçildi.");
                System.out.println("Zəhmət olmasa artırmaq istədiyiniz məbləği və ödəniş üsulunu seçin.");
                System.out.println("Mövcud üsullar: Bank kartı, Nağd ödəniş, Digər e-wallet");
                break;
            case 3:
                System.out.println("Hesab Ödənişi əməliyyatı seçildi.");
                System.out.println("Zəhmət olmasa ödəmək istədiyiniz hesabın növünü və məbləği daxil edin.");
                System.out.println("Mövcud hesablar: Elektrik, Su, Qaz, İnternet, Telefon");
                break;
            case 4:
                System.out.println("Qızıl Alma əməliyyatı seçildi.");
                System.out.println("Zəhmət olmasa almaq istədiyiniz qızılın miqdarını (qram) daxil edin.");
                System.out.println("Cari qızıl qiyməti: 1 qram = 120 AZN");
                break;
            default:
                System.out.println("Yanlış əməliyyat seçimi! Zəhmət olmasa 1-4 arasında seçim edin.");
                break;
        }

        System.out.println("\nƏməliyyatınızı davam etdirmək üçün təlimatları izləyin.");
        System.out.println("Təhlükəsiz əməliyyatlar üçün təşəkkür edirik!");
        scanner.close();
    }

}
