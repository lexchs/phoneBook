
public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.addContact("Алексей", "89113456543");
        phoneBook.addContact("Дмитрий", "89113451834");
        phoneBook.addContact("Максим", "89113452759");
        phoneBook.addContact("Максим", "89113453677");
        phoneBook.addContact("Ирина", "89113454081");

        phoneBook.displayPhoneBook();
    }
}