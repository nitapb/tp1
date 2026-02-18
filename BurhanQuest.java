import java.util.Scanner;

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
        
        int inputQuest;
        while (true) {
            System.out.print("Silakan masukkan banyak quest yang ingin didaftarkan: ");
            
            if (scanner.hasNextInt()) {
                inputQuest = scanner.nextInt();
                scanner.nextLine();
                if (inputQuest >= 0) {
                    break;
                }
            } else {
                scanner.nextLine();
            }
            System.out.println("Input tidak valid. Harap masukkan bilang bulat nonnegatif.");
        }

        int inputPengembara;
        while (true) {
            System.out.print("Silakan masukkan banyak pengembara yang ingin didaftarkan: ");
            
            if (scanner.hasNextInt()) {
                inputPengembara = scanner.nextInt();
                scanner.nextLine();
                if (inputPengembara >= 0) {
                    break;
                }
            } else {
                scanner.nextLine();
            }
            System.out.println("Input tidak valid. Harap masukkan bilang bulat nonnegatif.");
        }

        // INPUT DATA QUEST
        String dataQuest = "";
        if (inputQuest > 0) {
            System.out.println("Mulai memasukkan data quest.");
        }
        for (int i = 1; i <= inputQuest; i++) {
            while (true) { 
                System.out.println("Quest " + i);

                System.out.print("Masukkan nama quest: ");
                String namaQuest = scanner.nextLine().trim();

                System.out.print("Masukkan deskripsi quest: ");
                String deskripsiQuest = scanner.nextLine().trim();

                System.out.print("Masukkan reward quest berupa bilangan bulat nonnegatif: ");
                int reward;
                if (scanner.hasNextInt()) {
                    reward = scanner.nextInt();
                    scanner.nextLine();
                } else {
                    scanner.nextLine();
                    reward = -1;
                }

                System.out.print("Masukkan bonus exp quest berupa bilangan bulat nonnegatif: ");
                int bonus;
                if (scanner.hasNextInt()) {
                    bonus = scanner.nextInt();
                    scanner.nextLine();
                } else {
                    scanner.nextLine();
                    bonus = -1;
                }

                System.out.print("Masukkan tingkat kesulitan quest (opsi: mudah, menengah, sulit): ");
                String tingkatKesulitan = scanner.nextLine().trim();

                int errorCode = 0;

                if (namaQuest.equals("") || deskripsiQuest.equals("")) {
                    errorCode = 1;
                } else if ( reward < 0 || bonus < 0) {
                    errorCode = 2;
                } else if (!(tingkatKesulitan.equalsIgnoreCase("mudah") ||
                            tingkatKesulitan.equalsIgnoreCase("menengah") ||
                            tingkatKesulitan.equalsIgnoreCase("sulit"))) {
                    errorCode = 3;
                }

                // Validasi karakter nama
                for (int j = 0; j < namaQuest.length(); j++) {
                    char c = namaQuest.charAt(j);
                    if (!(Character.isLetterOrDigit(c) || c == ' ')) {
                        errorCode = 1;
                    }
                }

                // Validasi karakter deskripsi
                for (int k = 0; k < deskripsiQuest.length(); k++) {
                    char c = deskripsiQuest.charAt(k);
                    if (!(Character.isLetterOrDigit(c) || c == ' ')) {
                        errorCode = 1;
                    }
                }

                switch (errorCode) {
                    case 0:
                        System.out.println("Quest berhasil ditambahkan.");
                        String idQuest = "Q" + i;
                        String statusQuest = "tersedia";

                        if (!dataQuest.equals("")) {
                            dataQuest += "\n";
                        }
                        
                        dataQuest += idQuest + "|" + namaQuest + "|" + deskripsiQuest + "|" +
                                    reward + "|" + bonus + "|" + tingkatKesulitan.toLowerCase() + "|" + statusQuest;
                        break;

                    default:
                        System.out.println("Input tidak valid. Harap masukkan data dengan benar.");
                }

                if (errorCode == 0) {
                    break;
                }
            }
        }

        // INPUT DATA PENGEMBARA
        String dataPengembara = "";
        if (inputPengembara > 0) {
            System.out.println("Mulai memasukkan data pengembara.");
        }
        for (int i = 1; i <= inputPengembara; i++) {
            while (true) { 
                System.out.println("Pengembara " + i);

                System.out.print("Masukkan nama pengembara: ");
                String namaPengembara = scanner.nextLine().trim();

                System.out.print("Masukkan level pengembara berupa bilangan bulat [1, 20]: ");

                int levelPengembara;
                if (scanner.hasNextInt()) {
                    levelPengembara = scanner.nextInt();
                    scanner.nextLine();
                } else {
                    scanner.nextLine();
                    levelPengembara = -1;
                }

                int errorCode = 0;

                if (namaPengembara.equals("")) {
                    errorCode = 1;
                }

                for (int j = 0; j < namaPengembara.length(); j++) {
                    char c = namaPengembara.charAt(j);
                    if (!(Character.isLetterOrDigit(c) || c == ' ')) {
                        errorCode = 1;
                    }
                }

                if (levelPengembara < 1 || levelPengembara > 20) {
                    errorCode = 2;
                }

                switch (errorCode) {
                    case 0: 

                        int exp;
                        if (levelPengembara == 1) {
                            exp = 0;
                        } else {
                            exp = 5000;
                            for (int k = 0; k < levelPengembara - 2; k++) {
                                exp = exp * 2;
                            }
                        }

                        String idPengembara = "P" + i;
                        String statusPengembara = "kosong";
                        if (!dataPengembara.equals("")) {
                            dataPengembara += "\n";
                        }

                        dataPengembara += idPengembara + "|" + namaPengembara + "|" + levelPengembara + "|" +
                                        exp + "|" + statusPengembara;
                        
                        System.out.println("Pengembara berhasil ditambahkan.");
                        break;
                    default: 
                        System.out.println("Input tidak valid. Harap masukkan data dengan benar.");
                }

                if (errorCode == 0) {
                    break;
                }
            }
        }
        System.out.println("Data berhasil dimasukkan.");

        while (true) { 
            String menuUtama = """
                    Menu:
                    1. Lihat daftar quest
                    2. Lihat daftar pengembara
                    3. Tambah quest
                    4. Tambah pengembara
                    5. Menjalankan quest
                    6. Menyelesaikan quest
                    7. Filter daftar quest
                    8. Filter daftar pengembara
                    9. Tampilkan daftar quest terurut
                    10. Tampilkan daftar pengembara terurut
                    11. Keluar
                    """;
            System.out.print(menuUtama);
            System.out.print("Masukkan pilihan: ");
            String pilihan = scanner.nextLine();

            if (pilihan.equals("1")) {
                System.out.println("Quest yang terdaftar: ");
                Scanner questScanner = new Scanner(dataQuest);

                while (questScanner.hasNextLine()) {
                    String line = questScanner.nextLine();
                    int idx;

                    idx = line.indexOf("|");
                    String id = line.substring(0, idx);
                    line = line.substring(idx + 1);

                    idx = line.indexOf("|");
                    String nama = line.substring(0, idx);
                    line = line.substring(idx + 1);

                    idx = line.indexOf("|");
                    String deskripi = line.substring(0, idx);
                    line = line.substring(idx + 1);

                    idx = line.indexOf("|");
                    String reward = line.substring(0, idx);
                    line = line.substring(idx + 1);

                    idx = line.indexOf("|");
                    String bonusExp = line.substring(0, idx);
                    line = line.substring(idx + 1);

                    idx = line.indexOf("|");
                    String kesulitan = line.substring(0, idx);
                    line = line.substring(idx + 1);

                    String status = line;

                    System.out.println("ID Quest: " + id);
                    System.out.println("Nama Quest: " + nama);
                    System.out.println("Deskripsi Quest: " + deskripi);
                    System.out.println("Reward Quest: " + reward + " koin");
                    System.out.println("Bonus Exp Quest: " + bonusExp + " poin exp");

                    String bintang = "";
                    if (kesulitan.equals("mudah")) {
                        bintang = "\u2605";
                    } else if (kesulitan.equals("menengah")) {
                        bintang = "\u2605\u2605";
                    } else if (kesulitan.equals("sulit")) {
                        bintang = "\u2605\u2605\u2605";
                    }

                    System.out.println("Tingkat Kesulitan Quest: " + bintang);

                    String statusTampil = "";
                    if (status.equals("tersedia")) {
                        statusTampil = "tersedia \ud83d\udfe2";
                    } else if (status.startsWith("diambil")) {
                        statusTampil = status + " \u231b";
                    } else if (status.equals("selesai")) {
                        statusTampil = "selesai \ud83c\udfc6";
                    }
                    System.out.println("Status Quest: " + statusTampil);
                    System.out.println();
                }
                questScanner.close();
            } else if (pilihan.equals("2")) {
                System.out.println("Pengembara yang terdaftar: ");
                Scanner pengembaraScanner = new Scanner(dataPengembara);

                while (pengembaraScanner.hasNextLine()) {
                    String line = pengembaraScanner.nextLine();
                    int idx;

                    idx = line.indexOf("|");
                    String id = line.substring(0, idx);
                    line = line.substring(idx + 1);

                    idx = line.indexOf("|");
                    String nama = line.substring(0, idx);
                    line = line.substring(idx + 1);

                    idx = line.indexOf("|");
                    String level = line.substring(0, idx);
                    line = line.substring(idx + 1);

                    idx = line.indexOf("|");
                    String exp = line.substring(0, idx);
                    line = line.substring(idx + 1);

                    String status = line;

                    System.out.println("ID Pengembara: " + id);
                    System.out.println("Nama Pengembara: " + nama);
                    System.out.println("Level Pengembara: " + level);
                    System.out.println("Exp Pengembara: " + exp + " poin exp");

                    String statusTampil = "";
                    if (status.equals("kosong")) {
                        statusTampil = "kosong \u2705";
                    } else if (status.equals("dalam quest")) {
                        statusTampil = "dalam quest \u274c";
                    }

                    System.out.println("Status Pengembara: " + statusTampil);
                    System.out.println();
                }
                pengembaraScanner.close();
            } else if (pilihan.equals("3")) {

            } else if (pilihan.equals("4")) {

            } else if (pilihan.equals("5")) {

            } else if (pilihan.equals("6")) {

            } else if (pilihan.equals("7")) {

            } else if (pilihan.equals("8")) {

            } else if (pilihan.equals("9")) {

            } else if (pilihan.equals("10")) {

            } else if (pilihan.equals("11")) {
                break;
            } else {
                System.out.println("Pilihan tidak valid. Harap masukkan pilihan dengan benar.");
            }
        }

        System.out.println(ascii);
        System.out.println("Terima kasih telah menggunakan BurhanQuest!");
        System.out.println(developer);

        scanner.close();
    }
}