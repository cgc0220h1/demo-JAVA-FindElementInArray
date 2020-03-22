import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] studentList = {"Nam", "Khoai", "Bao", "Duong", "Phi", "Thanh"};
        System.out.print("Enter the name of student: ");
        String input = scanner.nextLine();
        boolean isExist = false;
        int position = 0;

        for (int index = 0; index < studentList.length; index++) {
            if (studentList[index].equals(input)) {
                isExist = true;
                position = index + 1;
                break;
            }
        }
        if (isExist) {
            System.out.printf("The student is at position %d in the list", position);
        } else {
            System.out.println("Sorry, that student is not in our list!");
        }
    }
}
