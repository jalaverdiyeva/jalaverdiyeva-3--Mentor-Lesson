
import java.util.Scanner;

public class MovieRating {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // İstifadəçidən film reytinqini soruşmaq
        System.out.println("Film Qiymətləndirmə və Tövsiyə Sisteminə Xoş Gəlmisiniz!");

        System.out.print("Sevdiyiniz son filmə 1-dən 10-a qədər reytinq verin: ");
        int rating = scanner.nextInt();

        // Reytinqə görə əks əlaqə
        if (rating >= 1 && rating <= 4) {  //from least to most
            System.out.println("Çox pis qiymətləndirmə. Niyə belə bəyənmədiniz?");
        } else if (rating >= 5 && rating <= 7) {
            System.out.println("Orta qiymətləndirmə. Daha yaxşı filmlər tapaq!");
        } else if (rating >= 8 && rating <= 10) {
            System.out.println("Əla seçim! Bu filmi dostlarınıza tövsiyə etdiyinizə əmin olun.");
        } else {
            System.out.println("Reytinq 1 ilə 10 arasında olmalıdır. Xahiş edirəm yenidən yoxlayın.");
        }

        // Film janrlarını göstərmək
        System.out.println("\n--- Məşhur Film Janrları ---");
        System.out.println("1 - Sci-Fi (Elmi-fantastik)");
        System.out.println("2 - Drama");
        System.out.println("3 - Komediya");
        System.out.println("4 - Qorxu");
        System.out.print("Hansı janrda film tövsiyəsi istəyirsiniz? (1-4): ");

        int genre = scanner.nextInt();

        // Janr seçiminə görə film tövsiyəsi
        switch (genre) {
            case 1:
                System.out.println("Sci-Fi janrında tövsiyə: 'Interstellar' (2014)");
                System.out.println("Səbəb: Kosmosun sirləri və vaxtın relativismi haqqında möhtəşəm film.");
                System.out.println("Rejissor Christopher Nolan-ın ən yaxşı əsərlərindən biridir.");
                break;
            case 2:
                System.out.println("Drama janrında tövsiyə: 'The Shawshank Redemption' (1994)");
                System.out.println("Səbəb: İnsan ruhunun gücü və dostluq haqqında dərin hekayə.");
                System.out.println("IMDB-də ən yüksək reytinqli filmlərdən biridir.");
                break;
            case 3:
                System.out.println("Komediya janrında tövsiyə: 'The Grand Budapest Hotel' (2014)");
                System.out.println("Səbəb: Wes Anderson-ın unikal vizual üslubu və zərif yumoru.");
                System.out.println("Həm gülməli, həm də vizual cəhətdən möhtəşəm filmdir.");
                break;
            case 4:
                System.out.println("Qorxu janrında tövsiyə: 'Hereditary' (2018)");
                System.out.println("Səbəb: Psixoloji qorxu və ailə dramının mükəmməl qarışımı.");
                System.out.println("Müasir qorxu sinemasının ən yaxşı nümunələrindən biridir.");
                break;
            default:
                System.out.println("Yanlış janr seçimi! Zəhmət olmasa 1-4 arasında seçim edin.");
                break;
        }

        System.out.println("\nFilm tövsiyələrimizi bəyəndiyinizi ümid edirik!");
        System.out.println("Yaxşı seyr!");
        scanner.close();
    }

}

