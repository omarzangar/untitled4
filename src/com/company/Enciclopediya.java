package com.company;

import java.util.Scanner;

class Enciclopediya extends Book{
    public void book_author() {
        System.out.println("Zangar");
    }
    public String book_author(Scanner name) {
        return name.nextLine();
    }
    @Override public void publication_city() {
        System.out.println("Shym qala");
    }
}