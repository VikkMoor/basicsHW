package basicsHW;

import java.util.Scanner;

public class ContactsAccounting {
    private static int capacity = 50;
    private static int contactCount = 0;
    private static  String[] names = new String[capacity];
    private static  String[] phoneNumbers = new String[capacity];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

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
                case 1 -> addContact();
                case 2 -> listContacts();
                case 3 -> searchContact();
                case 4 -> removeContact();
                case 5 -> {
                    System.out.println("Завершение работы.");
                    return;
                }
                default -> System.out.println("Выберите вариант из предложенных");
            }
        }
    }

    public static void addContact() {
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
    public static void listContacts() {
        if (contactCount == 0) {
            System.out.println("Список контактов пуст.");
        } else {
            System.out.println("Список контактов:");
            for (int i = 0; i < contactCount; i++) {
                System.out.println(names[i] + " - " + phoneNumbers[i]);
            }
        }
    }
    public static void searchContact() {
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

    private static void removeContact() {
        System.out.print("Введите имя контакта для удаления: ");
        String nameToRemove = scanner.nextLine();
        for (int i = 0; i < contactCount; i++) {
            if (names[i].equalsIgnoreCase(nameToRemove)) {
                // Сдвигаем элементы влево, чтобы избавиться от удаляемого контакта
                for (int j = i; j < contactCount - 1; j++) {
                    names[j] = names[j + 1];
                    phoneNumbers[j] = phoneNumbers[j + 1];
                }
                contactCount--;
                names[contactCount] = null; // Очистка последнего элемента
                phoneNumbers[contactCount] = null;
                System.out.println("Контакт удален.");
                return;
            }
        }
        System.out.println("Контакт не найден.");
    }
}

