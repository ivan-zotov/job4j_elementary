package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book javaCompleteReference = new Book("Java Complete Reference", 1860);
        Book warAndPeace = new Book("War and Peace", 1700);
        Book cleanCode = new Book("Clean code", 800);
        Book idiot = new Book("Idiot", 900);
        Book[] libs = new Book[4];
        libs[0] = javaCompleteReference;
        libs[1] = warAndPeace;
        libs[2] = cleanCode;
        libs[3] = idiot;
        for (Book lb : libs) {
            System.out.println(lb.getName() + " - " + lb.getPages() + " pages");
        }
        System.out.println("Books equals \"Clean code\"");
        for (Book lb : libs) {
            if (lb.getName().equals("Clean code")) {
                System.out.println(lb.getName() + " - " + lb.getPages() + " pages");
            }
        }
    }
}
