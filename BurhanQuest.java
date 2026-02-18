import java.util.Scanner;
import java.util.*;

public class BurhanQuest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String ascii = """
▄▄▄▄· ▄• ▄▌▄▄▄   ▄ .▄ ▄▄▄·  ▐ ▄ .▄▄▄  ▄• ▄▌▄▄▄ ..▄▄ · ▄▄▄▄▄
▐█ ▀█▪█▪██▌▀▄ █·██▪▐█▐█ ▀█ •█▌▐█▐▀•▀█ █▪██▌▀▄.▀·▐█ ▀. •██  
▐█▀▀█▄█▌▐█▌▐▀▀▄ ██▀▐█▄█▀▀█ ▐█▐▐▌█▌·.█▌█▌▐█▌▐▀▀▪▄▄▀▀▀█▄ ▐█.▪
██▄▪▐█▐█▄█▌▐█•█▌██▌▐▀▐█ ▪▐▌██▐█▌▐█▪▄█·▐█▄█▌▐█▄▄▌▐█▄▪▐█ ▐█▌·
·▀▀▀▀  ▀▀▀ .▀  ▀▀▀▀ · ▀  ▀ ▀▀ █▪·▀▀█.  ▀▀▀  ▀▀▀  ▀▀▀▀  ▀▀▀ 
""";

        String developer = "Dibuat oleh: Nita Pasaribu - 2406436890";
        
        System.out.println(ascii);
        System.out.println("Selamat datang di BurhanQuest!");
        System.out.println(developer);

        System.out.println("Mari kita mulai dengan membuat sejumlah data quest dan pengembara.");
        System.out.print("Silakan masukkan banyak quest yang ingin didaftarkan: ");
        int inputQuest = scanner.nextInt();

        if (inputQuest < 0) {

        }

        System.out.println(ascii);
        System.out.println("Terima kasih telah menggunakan BurhanQuest!");
        System.out.println(developer);

        scanner.close();
    }
}