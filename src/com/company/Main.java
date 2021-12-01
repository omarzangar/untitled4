package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Enciclopediya enc = new Enciclopediya();
        System.out.print("Publication year = ");
        enc.publication_year();
        System.out.print("Book author = ");
        enc.book_author();
        System.out.print("City = ");
        enc.publication_city();
        System.out.print("Name = ");
        enc.publication_name();

    }
}