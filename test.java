import java.util.Scanner;
public class test {
    public static void main(String[] args) {

        System.out.print("Enter the start int (1-150): ");
        int start = scannerInt();
        start = checkValue(start);

        System.out.print("Enter the limit int (1-150): ");
        int limit = scannerInt();
        limit = checkValue(limit);

        System.out.print("Enter the increment: ");
        int increment = scannerInt();
        increment = checkValue(increment);
        for (; start <= limit; start += increment) {
            System.out.print(start + " ");
        }
    }

    public static int scannerInt() {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        return x;
    }

    public static int checkValue(int a) {
        int b = (a < 1) || (a > 150) ? 0 : 1;
        switch (b) {
            case 0:
                scannerInput(a);
                break;
        }
        return a;        
    }
    public static void scannerInput(int i) {
        System.out.println("Error");
        System.out.print("Re-enter number: ");
        i = scannerInt();
        checkValue(i);
    }
}