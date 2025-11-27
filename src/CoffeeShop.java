import java.util.Scanner;

public class CoffeeShop {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // İstifadəçidən yaşını soruşmaq
        System.out.println("Qəhvə Mağazasına Xoş Gəlmisiniz!");
        System.out.print("Yaşınızı daxil edin: ");
        int age = scanner.nextInt();

        // Yaşa görə endirim və xüsusi təklif
        if (age < 12) {
            System.out.println("12 yaşdan kiçik olduğunuz üçün pulsuz içki alırsınız!");
        } else if (age >= 13 && age <= 17) {
            System.out.println("Tələbə endirimi! 20% endirim tətbiq edildi.");
        } else if (age >= 65) {
            System.out.println("Yaşlılar endirimi! 30% endirim tətbiq edildi.");
        } else {
            System.out.println("Standart qiymətlər tətbiq edilir.");
        }

        // Qəhvə menyusunu göstərmək
        System.out.println("\n--- Qəhvə Menyusu ---");
        System.out.println("1 - Espresso (3 AZN)");
        System.out.println("2 - Cappuccino (5 AZN)");
        System.out.println("3 - Latte (6 AZN)");
        System.out.println("4 - Americano (4 AZN)");
        System.out.println("5 - Mocha (7 AZN)");
        System.out.print("Seçiminizi daxil edin (1-5): ");

        int choice = scanner.nextInt();

        // Seçimə görə qəhvə növünü çap etmək
        switch (choice) {
            case 1:
                System.out.println("Espresso seçdiniz! Güclü və dadlı qəhvə.");
                System.out.println("Qiyməti: 3 AZN");
                break;
            case 2:
                System.out.println("Cappuccino seçdiniz! Süd köpüyü ilə mükəmməl qarışım.");
                System.out.println("Qiyməti: 5 AZN");
                break;
            case 3:
                System.out.println("Latte seçdiniz! Yumşaq və kremli dad.");
                System.out.println("Qiyməti: 6 AZN");
                break;
            case 4:
                System.out.println("Americano seçdiniz! Klassik və sadə qəhvə.");
                System.out.println("Qiyməti: 4 AZN");
                break;
            case 5:
                System.out.println("Mocha seçdiniz! Şokolad və qəhvənin mükəmməl birləşməsi.");
                System.out.println("Qiyməti: 7 AZN");
                break;
            default:
                System.out.println("Xəbərdarlıq: Yanlış seçim! Zəhmət olmasa 1-5 arasında seçim edin.");
                break;
        }

        System.out.println("\nSifarişiniz hazırlanır. Təşəkkür edirik!");
        scanner.close();
    }
}
