package basicsHW;

import java.util.Scanner;

public class ContactsAccounting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int capacity = 50;
        int contactCount = 0;
        String[] names = new String[capacity];
        String[] phoneNumbers = new String[capacity];

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

            switch (choice) {
                case 1:
                    addContact();
                    break;
                case 2:
                    listContacts();
                    break;
                case 3:
                    searchContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    System.out.println("Завершение работы.");
                    return;
                default:
                    System.out.println("Выберите вариант из предложенных");
            }
        }

        public void addContact() {
            if (contactCount >= capacity) {
                System.out.println("Достигнуто максимальное количество контактов.");
                return;
            }
            System.out.print("Введите имя контакта: ");
            names[contactCount] = scanner.nextLine();
            System.out.print("Введите телефонный номер: ");
            phoneNumbers[contactCount] = scanner.nextLine();
            contactCount++;
            System.out.println("Контакт добавлен.");
        }

        private static void listContacts() {
            if (contactCount == 0) {
                System.out.println("Список контактов пуст.");
            } else {
                System.out.println("Список контактов:");
                for (int i = 0; i < contactCount; i++) {
                    System.out.println(names[i] + " - " + phoneNumbers[i]);
                }
            }
        }

        private static void searchContact() {
            System.out.print("Введите имя для поиска: ");
            String nameToSearch = scanner.nextLine();
            for (int i = 0; i < contactCount; i++) {
                if (names[i].equalsIgnoreCase(nameToSearch)) {
                    System.out.println("Найден контакт: " + names[i] + " - " + phoneNumbers[i]);
                    return;
                }
            }
            System.out.println("Контакт не найден.");
        }

    }
}
