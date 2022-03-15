package com.company;

public class Book {

    private String title;
    private String author;
    private int serialNumber;
    private float price;

    public Book(String title, String author, int serialNumber, float price) {
        this.title = title;
        this.author = author;
        this.serialNumber = serialNumber;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
