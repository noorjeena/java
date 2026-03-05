import java.util.Scanner;

class Publisher {
    String pname;
}

class Book extends Publisher {
    String title;
    int price;
}

class Literature extends Book {
    void display() {
        System.out.println("Literature Book");
        System.out.println("Title: " + title);
        System.out.println("Publisher: " + pname);
        System.out.println("Price: " + price);
    }
}

class Fiction extends Book {
    void display() {
        System.out.println("Fiction Book");
        System.out.println("Title: " + title);
        System.out.println("Publisher: " + pname);
        System.out.println("Price: " + price);
    }
}

public class BookDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Literature");
        System.out.println("2. Fiction");
        System.out.print("Enter choice: ");
        int ch = sc.nextInt();
        sc.nextLine();

        if (ch == 1) {
            Literature l = new Literature();

            System.out.print("Enter Publisher Name: ");
            l.pname = sc.nextLine();

            System.out.print("Enter Title: ");
            l.title = sc.nextLine();

            System.out.print("Enter Price: ");
            l.price = sc.nextInt();

            l.display();
        }
        else if (ch == 2) {
            Fiction f = new Fiction();

            System.out.print("Enter Publisher Name: ");
            f.pname = sc.nextLine();

            System.out.print("Enter Title: ");
            f.title = sc.nextLine();

            System.out.print("Enter Price: ");
            f.price = sc.nextInt();

            f.display();
        }

        sc.close();
    }
}