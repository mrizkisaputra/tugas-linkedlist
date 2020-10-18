package com.belajarJava.singleLinkedlist;

public class LinearSingleLinkedList {
    private Node head, tail;
    int size = 0;


    public boolean isEmpty() {
        return head == null;
    }

    // method untuk menambahkan data didepan linkedlist
    public void addFrist(String dataNama, String dataNpm, int dataNilai) {
        Node node = new Node(dataNama, dataNpm, dataNilai);

        if ( isEmpty() ) {
            head = node;
            tail = node;
        } else {
            Node temp = head;
            head = node;
            head.field_next = temp;
        }

        size++;
    }

    // method untuk menambahkan data diakhir linkedlist
    public void addLast(String dataNama, String dataNpm, int dataNilai) {
        Node node = new Node(dataNama, dataNpm, dataNilai);

        if ( isEmpty() ) {
            head = node;
            tail = node;
        } else {
            tail.field_next = node;
            tail = node;
        }

        size++;
    }

    // method untuk menambah data ditengah linkedlist
    public void addMid(String dataNama, String dataNpm, int dataNilai) {
        Node node = new Node(dataNama, dataNpm, dataNilai);

        if ( isEmpty() ) {
            head = node;
            tail = node;
        } else {
            Node temp, curr;
            int count = (size % 2 == 0) ? (size /2) : ((size+1)/2);
            
            temp = head;
            curr = null;
            
            for ( int i = 0; i < count; i++ ) {
                curr = temp;
                
                temp = temp.field_next;
            }
            
            curr.field_next = node;
            node.field_next = temp;
        }
        
        size++;
    }

    // method untuk menghapus data didepan linkedlist
    public void deleteFrist() {
        if ( isEmpty() ) {
            System.out.println("data kosong!");
        } else {
            if ( head != tail ) {
                head = head.field_next;
            } else {
                head = tail = null;
            }
        }

        size--;
    }

    // method unutk menghapus data diakhir linkedlist
    public void deleteLast() {
        if ( isEmpty() ) {
            System.out.println("data kosong!");
        } else {
            if ( head != tail ) {
                Node temp = head;

                while ( temp.field_next != tail ) {
                    temp = temp.field_next;
                }

                tail = temp;
                tail.field_next = null;
            } else {
                head = tail = null;
            }
        }

        size--;
    }

    // method untuk menghapus data di tengah linkedlist
    public void deleteMid() {
        Node temp, curr;

        if ( isEmpty() ) {
            System.out.println("data kosong!");
        } else {
            int count = (size % 2 == 0) ? (size/2) : ((size+1)/2);

            if ( head != tail ) {
                temp = head;
                curr = null;

                for ( int i = 0; i < count-1; i++ ) {
                    curr = temp;
                    temp = temp.field_next;
                }

                if ( curr !=null ) {
                    curr.field_next = temp.field_next;
                    temp = null;
                } else {
                    head = tail = temp.field_next;
                    temp = null;
                }
            } else {
                head = tail = null;
            }
        }

        size--;
    }

    // method untuk mencari data linkedlist
    public boolean search(String cariData) {
        Node curr = head;

        int i = 1;
        boolean ketemu = false;

        if ( isEmpty() ) {
            System.out.println("data kosong!");
        } else {
            while ( curr != null ) {
                if (curr.data_nama_mahasiswa.equals(cariData)) {
                    ketemu = true; break;
                }

                i++;
                curr = curr.field_next;
            }
        }

//        if ( ketemu ) {
//            System.out.println("Data "+cariData+" ditemukan.");
//        } else {
//            System.out.println("Data "+cariData+" not found!");
//        }
        return ketemu;
    }

    // method untuk menampilkan semua data linkedlist
    public void display() {
        Node curr = head;

        if ( head != null ) {
            System.out.println("-----------------------------------------------------");
            System.out.println("|\t\t NAMA \t\t|\t\t NPM \t\t|\t NILAI \t|");
            System.out.println("-----------------------------------------------------");
            while ( curr != null ) {
                curr.display();
                curr = curr.field_next;
            }
        } else {
            System.out.println("Data masih kosong");
        }

        System.out.print("\n");
    }
}