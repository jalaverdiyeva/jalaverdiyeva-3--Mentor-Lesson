
import java.util.Scanner;

public class NationalPark {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // İstifadəçidən fəaliyyət növünü soruşmaq

        System.out.println("Milli Parka Xoş Gəlmisiniz!"); // println("") -> moves the cursor to a new line
        System.out.println("Hansı fəaliyyətlə məşğul olacaqsınız?");
        System.out.println("[1] - Hiking (Dağ gəzintisi)");
        System.out.println("[2] - Camping (Düşərgə qurma)");
        System.out.println("[3] - Biking (Velosiped sürməsi)");

        System.out.print("Seçiminizi daxil edin (1-3): "); // print("") -> does NOT move to a new line

        int activity = scanner.nextInt(); // 1, 2 or 3

        // Fəaliyyət növünə görə endirim tətbiqi
        if (activity == 1) {
            System.out.println("Hiking seçdiniz. Heç bir endirim yoxdur.");
        } else if (activity == 2) {
            System.out.println("Camping seçdiniz. Çadır ləvazimatlarına 15% endirim tətbiq edildi!");
        } else if (activity == 3) {
            System.out.println("Biking seçdiniz. Velosiped icarəsinə 25% endirim tətbiq edildi!");
        } else {
            System.out.println("Xəbərdarlıq: Yanlış seçim! Zəhmət olmasa 1, 2 və ya 3 daxil edin.");
        }

        // Gəzinti marşrutlarını göstərmək
        System.out.println("\n--- Mövcud Gəzinti Marşrutları ---");
        System.out.println("[1] - Şəlalə Marşrutu");
        System.out.println("[2] - Dağ Zirvəsi Marşrutu");
        System.out.println("[3] - Meşə Gəzintisi Marşrutu");
        System.out.println("[4] - Göl Ətrafı Marşrutu");

        System.out.print("Marşrut seçiminizi daxil edin (1-4): ");

        int route = scanner.nextInt();

        // Marşrut seçiminə görə məlumat vermək
        switch (route) {
            case 1:
                System.out.println("Şəlalə Marşrutu seçildi.");
                System.out.println("Çətinlik səviyyəsi: Asan");
                System.out.println("Təxmini vaxt: 2 saat");
                break;
            case 2:
                System.out.println("Dağ Zirvəsi Marşrutu seçildi.");
                System.out.println("Çətinlik səviyyəsi: Çətin");
                System.out.println("Təxmini vaxt: 6 saat");
                break;
            case 3:
                System.out.println("Meşə Gəzintisi Marşrutu seçildi.");
                System.out.println("Çətinlik səviyyəsi: Orta");
                System.out.println("Təxmini vaxt: 3 saat");
                break;
            case 4:
                System.out.println("Göl Ətrafı Marşrutu seçildi.");
                System.out.println("Çətinlik səviyyəsi: Asan");
                System.out.println("Təxmini vaxt: 1.5 saat");
                break;
            default:
                System.out.println("Yanlış marşrut seçimi! Zəhmət olmasa 1-4 arasında seçim edin.");
                break;
        }

        System.out.println("\nYaxşı gəzinti! Təbiətin dadını çıxarın!");
        scanner.close();
    }

}
