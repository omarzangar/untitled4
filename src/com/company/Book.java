package com.company;

abstract class Book implements com.company.Publication {
    @Override public void publication_name() {
        System.out.println("Black and White");
    }
    @Override public void publication_year() {
        System.out.println("2000");
    }
}