package com.belajarJava.singleLinkedlist;

public class LatihanLinkedList {
    private static String nama, npm;
    private static int nilai;
    private static final LinearSingleLinkedList list = new LinearSingleLinkedList();


    public LatihanLinkedList() {
        menu();
    }

    // method menu linkedlist
    private static void menu() {
        try {
            while (true) {
                System.out.println("--UNIVERSITAS INDO GLOBAL MANDIRI--");
                System.out.println("[1]. Tambahkan data didepan\n" +
                        "[2]. Tambahkan data dibelakang\n" +
                        "[3]. Tambahkan data ditengah\n" +
                        "[4]. Hapus data didepan\n" +
                        "[5]. Hapus data dibelakang\n" +
                        "[6]. Hapus data ditengah\n" +
                        "[7]. Tampilkan semua data\n" +
                        "[8]. Search data\n" +
                        "[9]. Exit\n");

                System.out.print("Pilih menu > ");
                String pilih_menu = ScanInput.scan().nextLine();

                switch (pilih_menu) {
                    case "1" -> tambahDataDidepan();
                    case "2" -> tambahDataDibelakang();
                    case "3" -> tambahDataDitengah();
                    case "4" -> hapusDataDidepan();
                    case "5" -> hapusDataDibelakang();
                    case "6" -> hapusDataDitengah();
                    case "7" -> tampilkanSemuaData();
                    case "8" -> cariData();
                    case "9" -> System.exit(0);
                    default -> {
                        System.out.println("menu "+pilih_menu+" tidak ditemukan");
                    }
                }

                System.out.print("\n");
            }
        } catch (Exception e) {
            System.err.println("Terjadi kesalahan pada "+e.getMessage());
        }
    }


    private static void read() {
        System.out.print("input nama mahasiswa : ");
        nama = ScanInput.scan().nextLine();
        System.out.print("input npm mahasiswa : ");
        npm = ScanInput.scan().nextLine();
        System.out.print("input nilai mahasiswa : ");
        nilai = ScanInput.scan().nextInt();
    }


    private static void tambahDataDidepan() {
        read();
        list.addFrist(nama, npm ,nilai);

        System.out.print("\n");
    }

    private static void tambahDataDibelakang() {
        read();
        list.addLast(nama, npm, nilai);

        System.out.print("\n");
    }

    private static void tambahDataDitengah() {
        read();
        list.addMid(nama, npm, nilai);

        System.out.print("\n");
    }

    private static void hapusDataDidepan() {
        if ( !list.isEmpty() ) {
            list.deleteFrist();
            System.out.println("data berhasil dihapus");
        } else {
            System.out.println("data kosong!");
        }
        System.out.print("\n");
    }

    private static void hapusDataDibelakang() {
        if ( !list.isEmpty() ) {
            list.deleteLast();
            System.out.println("data berhasil dihapus");
        } else {
            System.out.println("data kosong!");
        }
        System.out.print("\n");
    }

    private static void hapusDataDitengah() {
        if ( !list.isEmpty() ) {
            list.deleteMid();
            System.out.println("data berhasil dihapus");
        } else {
            System.out.println("data kosong!");
        }
        System.out.print("\n");
    }

    private static void tampilkanSemuaData() {
        if ( !list.isEmpty() ) {
            list.display();
        } else {
            System.out.println("data masih kosong!");
        }

        System.out.print("\n");
    }

    private static void cariData() {
        if ( !list.isEmpty() ) {
            System.out.print("input data nama yang dicari > ");
            String cariNama = ScanInput.scan().nextLine();

            if ( list.search(cariNama) ) {
                System.out.println("-----------------------------------------------------");
                System.out.println("|\t\t NAMA \t\t|\t\t NPM \t\t|\t NILAI \t|");
                System.out.println("-----------------------------------------------------");
                System.out.println("|\t\t"+cariNama+"\t\t|\t "+npm+" \t|\t "+nilai+" \t|");
            } else {
                System.out.println("data "+cariNama+" not found!");
            }
        } else {
            System.out.println("tidak bisa mencari data, karena data kosong!");
        }

        System.out.print("\n");
    }
}
