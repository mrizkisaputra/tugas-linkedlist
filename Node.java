package com.belajarJava.singleLinkedlist;

public class Node {
    protected String data_nama_mahasiswa;
    protected String data_npm_mahasiswa;
    protected int data_nilai_mahasiswa;
    protected Node field_next;

    public Node(String nama, String npm, int nilai) {
        this.data_nama_mahasiswa = nama;
        this.data_npm_mahasiswa = npm;
        this.data_nilai_mahasiswa = nilai;
    }

    protected void display() {
        System.out.println("|\t\t"+this.data_nama_mahasiswa+"\t\t|\t "+this.data_npm_mahasiswa+" \t|\t "+this.data_nilai_mahasiswa+" \t|");
    }
}
