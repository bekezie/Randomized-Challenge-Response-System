import java.util.Random;
import java.util.Scanner;

public class Password {
    public Password() {
    }

    public static void main(String[] args) {
        int i = 0;
        Scanner keyboard = new Scanner(System.in);
        Random rnd = new Random();
        boolean found = true;
        // default password
        int[] pin = new int[]{8, 8, 7, 4, 9};
        // random values
        int[] random = new int[10];
        int[] user = new int[5];
        int r;
        System.out.println("Enter password");

        while(found) {
            System.out.printf("PIN: 0 1 2 3 4 5 6 7 8 9");
            System.out.println();

            System.out.printf("NUM: ");

            do {
                r = 1 + rnd.nextInt(3);
                random[i] = r;
                System.out.printf("%d ", random[i]);
                ++i;
            } while(i < random.length);

            i = 0;

            do {
                user[i] = keyboard.nextInt();
                ++i;
            } while(i < user.length);

            i = 0;

            do {
                if (random[pin[i]] == user[i]) {
                    ++i;
                } else if (random[pin[i]] != user[i]) {
                    System.out.println("Error password incorrect.");
                    found = false;
                    System.exit(0);
                }
            } while(i < user.length);

            if (found) {
                System.out.println("Access granted.");
            }
        }

    }
}
