import java.util.Scanner;
public class PhoneNumberExample {
    public static void main(String[] args) {
        boolean flag;
        Scanner sc = new Scanner(System.in);
        do {
            String phonePattern = "[(]\\d{2}[)]-[(]\\d{10}[)]";
            System.out.print("Input your phone(xxx-xxxxxxxxx): ");
            String input = sc.next();
            flag = input.matches(phonePattern);
            if (!flag) System.out.println("Invalid data!");
        } while (!flag);
        System.out.println("Valid data");
    }
}
