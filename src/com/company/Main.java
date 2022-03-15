package com.company;

import java.util.Scanner;

public class Main {

    public static void menu(){
        System.out.println("Jeśli chcesz wypożczyć ksiązkę - wybierz 1, " +
                "jeśli pragniesz kupić wybierz - 2. " + "\n" +
                " Zwrot ksiązki wybierz - 3." + "\n" +
                " Wyjście - 0");
    }

    public static void main(String[] args) {

        Book book1 = new Book("Rok 1984", "George Orwell", 1283293238, 4.69f);
        Book book2 = new Book("W pustyni i puszczy", "Adam Mickiewicz", 7363843, 74.89f);

        App myApp = new App();
        myApp.addBook(book1);
        myApp.addBook(book2);

        System.out.println("Witamy!!");

        Scanner userInput = new Scanner(System.in);

        menu();

        int input = userInput.nextInt();


        while (input != 0){

            if(input == 1){

                if (myApp.returArray().isEmpty()){
                    System.out.println("Przepraszamy brak pozycji.");
                    menu();
                    input = userInput.nextInt();

                } else {

                    myApp.getStoreBooks();
                    System.out.println("Którą pozycję wybierasz?");
                    int choice = userInput.nextInt();
                    myApp.bookBorrowOrSold(choice);
                    menu();
                    input = userInput.nextInt();
               }

            } else if(input == 2){

                myApp.getStoreBooks();
                System.out.println("Którą pozycję wybierasz?");
                int choice = userInput.nextInt();
                myApp.bookBorrowOrSold(choice - 1);
                menu();
                input = userInput.nextInt();

            } else if(input == 3){

                String title;
                String author;
                int serialNumber;
                float price;


                System.out.println("Autor: ");
                author = userInput.next();
                System.out.println("Tytuł: ");
                title = userInput.next();
                System.out.println("Numer seryjny: ");
                serialNumber = userInput.nextInt();
                System.out.println("Cena: ");
                price = userInput.nextFloat();

                Book userBook = new Book(title,author,serialNumber,price);
                myApp.addBook(userBook);
                System.out.println("Książka została dodana.");

                menu();
                 input = userInput.nextInt();

            } else {
                System.out.println("Błędna pozycja.");
                menu();
                input = userInput.nextInt();
            }
        }

        }

    }

