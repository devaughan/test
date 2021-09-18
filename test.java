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
        System.out.println("");
    }

    public static int scannerInt() {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        return x;
    }

    public static int checkValue(int a) {
        outer:
            for (;;) {
                int isValid = (a >= 1) && (a <= 150) ? 1 : 0;
                switch(isValid) {
                    case 1:
                        break outer;
                }
                a = scannerInput(a);
            }
        return a;        
    }
    public static int scannerInput(int i) {
        System.out.println("Error");
        System.out.print("Re-enter number: ");
        i = scannerInt();

        return i;
    }
}