import java.util.Scanner;

public class ReverseNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numElements = scanner.nextInt();
        int[] userList = new int[numElements];

        //Read remaining integers and store in the userList array
        for (int i = 0; i < numElements; i++) {
            userList[i] = scanner.nextInt();
        }

        //Print the array contents in reverse
        for (int i = numElements - 1; i >= 0; i--) {
            System.out.print(userList[i] + " ");
        }

        System.out.println();

    }
}
