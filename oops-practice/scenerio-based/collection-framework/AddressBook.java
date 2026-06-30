import java.util.*;

class Contact implements Comparable<Contact> {
    String name;
    String phone;
    String email;

    Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public int compareTo(Contact c) {
        return this.name.compareToIgnoreCase(c.name);
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Phone: " + phone + ", Email: " + email;
    }
}

public class AddressBook {

    ArrayList<Contact> contacts = new ArrayList<>();
    HashMap<String, Contact> map = new HashMap<>();
    HashSet<String> phones = new HashSet<>();

    void addContact(String name, String phone, String email) {
        if (phones.contains(phone)) {
            System.out.println("Duplicate phone number!");
            return;
        }

        Contact c = new Contact(name, phone, email);
        contacts.add(c);
        map.put(name, c);
        phones.add(phone);

        System.out.println("Contact Added.");
    }

    void search(String name) {
        if (map.containsKey(name))
            System.out.println(map.get(name));
        else
            System.out.println("Contact not found.");
    }

    void delete(String name) {
        Contact c = map.remove(name);

        if (c != null) {
            contacts.remove(c);
            phones.remove(c.phone);
            System.out.println("Contact Deleted.");
        } else {
            System.out.println("Contact not found.");
        }
    }

    void display() {
        Collections.sort(contacts);

        System.out.println("\nContacts:");
        for (Contact c : contacts)
            System.out.println(c);
    }

    public static void main(String[] args) {

        AddressBook obj = new AddressBook();

        obj.addContact("Anil", "9876543210", "anil@gmail.com");
        obj.addContact("Rahul", "9999999999", "rahul@gmail.com");
        obj.addContact("Amit", "9876543210", "amit@gmail.com");

        obj.search("Rahul");

        obj.delete("Rahul");

        obj.display();
    }
}