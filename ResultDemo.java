import java.util.Scanner;

class Student {
    int marks;
}

class Sports {
    int score;
}

class Result extends Student {
    Sports s = new Sports();

    void display() {
        System.out.println("Academic Marks: " + marks);
        System.out.println("Sports Score: " + s.score);
    }
}

public class ResultDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Result r = new Result();

        System.out.print("Enter Academic Marks: ");
        r.marks = sc.nextInt();

        System.out.print("Enter Sports Score: ");
        r.s.score = sc.nextInt();

        r.display();

        sc.close();
    }
}