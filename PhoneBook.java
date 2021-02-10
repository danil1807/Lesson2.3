//2. Написать простой класс ТелефонныйСправочник, который хранит в себе
// список фамилий и телефонных номеров. В этот телефонный справочник
// с помощью метода add() можно добавлять записи.
// С помощью метода get() искать номер телефона по фамилии.
// Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
// тогда при запросе такой фамилии должны выводиться все телефоны.

import java.util.ArrayList;
import java.util.List;



public class PhoneBook {

    List<String> names = new ArrayList<>();
    List<String> numbers = new ArrayList<>();

    public void addNewContact(String name, String number) {
        names.add(name);
        numbers.add(number);
    }

    public void showContactBook() {
        System.out.println("My contacts: ");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i) + " - " + numbers.get(i));
        }
        System.out.println("********************");
    }

    public void getContactInfo(String name) {
        System.out.println("Search result for " + name + ":");
        for (int i = 0; i < names.size(); i++) {
            if (names.get(i) == name) {
                System.out.println(name + " - " + numbers.get(i));
            }
        }
        System.out.println("********************");
    }
}

