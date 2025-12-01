package basicsHW;

import java.util.Scanner;

public class ContactsAccounting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contactCount = 0;

        while (true) {
            System.out.println("\nМеню:");
            System.out.println("1. Добавить контакт");
            System.out.println("2. Посмотреть контакты");
            System.out.println("3. Найти контакт");
            System.out.println("4. Удалить контакт");
            System.out.println("5. Выйти");
            System.out.print("Выберите действие: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // очистка буфера


        }
    }
}
