// 4. Declare a class called book having author_name as private data member. Extend book 
// class to have two sub classes called book_publication & paper_publication. Each of 
// these classes have private member called title. Write a complete program to show 
// usage of dynamic method dispatch (dynamic polymorphism) to display book or paper 
// publications of given author. [B]

import java.util.Scanner;

class Book {
    private String author_name;

    Book(String author_name) {
        this.author_name = author_name;
    }

    public String getAuthor_Name() {
        return this.author_name;
    }

    public void display() {
        System.out.println("Main Book Class");
        System.out.println("Author Name : " + this.author_name);
    }
}

class Book_publication extends Book {
    private String title;

    Book_publication(String author_name, String title) {
        super(author_name);
        this.title = title;

    }

    @Override
    public void display() {
        System.out.println("Book Publication");
        System.out.println("Author Name : " + getAuthor_Name());
        System.out.println("Title       : " + this.title);
    }
}

class Paper_publication extends Book {
    private String title;

    Paper_publication(String author_name, String title) {
        super(author_name);
        this.title = title;
    }

    @Override
    public void display() {
        System.out.println("Paper Publication");
        System.out.println("Author Name : " + getAuthor_Name());
        System.out.println("Title       : " + this.title);
    }
}

public class B4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter author name: ");
        String author = sc.nextLine().trim();

        System.out.print("Enter publication type (Book/Paper): ");
        String type = sc.nextLine().trim();

        System.out.print("Enter title: ");
        String title = sc.nextLine().trim();

        Book b;

        if (type.equalsIgnoreCase("Book")) {
            b = new Book_publication(author, title);
        } 

        else if (type.equalsIgnoreCase("Paper")) {
            b = new Paper_publication(author, title);
        }
        
        else {
            System.out.println("Invalid Input (type must be 'Book' or 'Paper').");
            sc.close();
            return;
        }

        // Dynamic method dispatch: runtime decides which display() runs

        b.display();

        sc.close();
    }
}
