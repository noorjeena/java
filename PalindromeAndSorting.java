import java.util.Scanner;
import java.util.Arrays;
public class PalindromeAndSorting 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to check palindrome: ");
        String str = sc.nextLine();
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) 
            {
            reverse = reverse + str.charAt(i);
        }
        if (str.equals(reverse)) 
            {
            System.out.println("The given string is a Palindrome");
        } else {
            System.out.println("The given string is NOT a Palindrome");
        }
        System.out.print("\nEnter number of names: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] names = new String[n];
        System.out.println("Enter the names:");
        for (int i = 0; i < n; i++) 
            {
            names[i] = sc.nextLine();
        }
        Arrays.sort(names);
        System.out.println("Names in ascending order:");
        for (int i = 0; i < n; i++) 
            {
            System.out.println(names[i]);
        }
        sc.close();
    }
}
