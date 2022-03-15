package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    ArrayList<Book> storeBooks = new ArrayList<Book>();

    public void getStoreBooks() {
        for (int i = 0; i < storeBooks.size(); i++) {
            int position = i + 1;
            System.out.println( "Pozycja: " + position +" " + "\n" +
                    "Autor: " + storeBooks.get(i).getAuthor() + "\n" +
            " Tytuł: " + storeBooks.get(i).getTitle() + "\n" +
            "---------------------------------------------");
        }
    }

    public ArrayList<Book> returArray(){
        return this.storeBooks;
    }


    public void bookBorrowOrSold(int position){
            int choice = position - 1;
            System.out.println("Książka została kupiona/wypożyczona: " + storeBooks.get(choice).getTitle());
            storeBooks.remove(choice);
        }


    public void setStoreBooks(ArrayList<Book> storeBooks) {
        this.storeBooks = storeBooks;
    }

    public void addBook(Book book) {
        this.storeBooks.add(book);
    }

}
