import sun.jvm.hotspot.types.CIntegerField;

import java.util.*;

//1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
// Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
// Посчитать сколько раз встречается каждое слово.
//2. Написать простой класс ТелефонныйСправочник, который хранит в себе
// список фамилий и телефонных номеров. В этот телефонный справочник
// с помощью метода add() можно добавлять записи.
// С помощью метода get() искать номер телефона по фамилии.
// Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
// тогда при запросе такой фамилии должны выводиться все телефоны.

public class Main {
    public static void main(String[] args) {
        showUniqueFruitList();
        System.out.println("*****\n");

        showFruitListAndCount();
        System.out.println("*****\n");

        countFruitRepeats();
        System.out.println("*****\n");


        PhoneBook myBook = new PhoneBook();
        myBook.addNewContact("John", "891234441");
        myBook.addNewContact("John", "891234441");
        myBook.addNewContact("Vasilij", "891234433");
        myBook.addNewContact("Vasya", "891234553");
        myBook.addNewContact("Vasya", "891234543");

        myBook.showContactBook();

        myBook.getContactInfo("Vasya");
    }

    public static void showUniqueFruitList() {
        HashSet<String> fruitList = new HashSet<>();
        fruitList.add("Apple");
        fruitList.add("Pineapple");
        fruitList.add("Pear");
        fruitList.add("Meloun");
        fruitList.add("Watermeloun");
        fruitList.add("Kiwi");
        fruitList.add("Apple");
        fruitList.add("Banana");
        fruitList.add("Pear");
        fruitList.add("Mango");
        System.out.println(fruitList);
    }

    public static void showFruitListAndCount() {
        List<String> fruitList = new ArrayList<>();
        fruitList.add("Apple");
        fruitList.add("Pineapple");
        fruitList.add("Pear");
        fruitList.add("Meloun");
        fruitList.add("Watermeloun");
        fruitList.add("Kiwi");
        fruitList.add("Apple");
        fruitList.add("Banana");
        fruitList.add("Pear");
        fruitList.add("Mango");
        System.out.println(fruitList);
        System.out.println("Count Apple: " + Collections.frequency(fruitList, "Apple"));
        System.out.println("Count Pear: " + Collections.frequency(fruitList, "Pear"));
        System.out.println("Count Kiwi: " + Collections.frequency(fruitList, "Kiwi"));
        System.out.println("Count Meloun: " + Collections.frequency(fruitList, "Meloun"));
        System.out.println("Count Banana: " + Collections.frequency(fruitList, "Banana"));
        System.out.println("Count Mango: " + Collections.frequency(fruitList, "Mango"));
        System.out.println("Count Watermeloun: " + Collections.frequency(fruitList, "Watermeloun"));
        System.out.println("Count Pineapple: " + Collections.frequency(fruitList, "Pineapple"));

    }
//этот код мне подсказал интернет, и я не до конца в нем разобрался(дальше будут вопросы)
        public static void countFruitRepeats() {
            Map<String, Integer> fruits = new HashMap<>();

            ArrayList<String> fruitList = new ArrayList<>();
            fruitList.add("Apple");
            fruitList.add("Pear");
            fruitList.add("Meloun");
            fruitList.add("Watermeloun");
            fruitList.add("Apple");
            fruitList.add("Apple");
            fruitList.add("Pear");
            fruitList.add("Meloun");
            fruitList.add("Watermeloun");
            fruitList.add("Apple");
            fruitList.add("Apple");

            for (int i = 0; i < fruitList.size(); i++) {
                String f = fruitList.get(i);

                if (!fruits.containsKey(f)) {
                    fruits.put(f, 1);
                } else {
                    fruits.put(f, fruits.get(f) + 1);
                }
            }
// сверху вроде все понятно:
            //создаем переменную f и кладем в нее метод, который осуществляет доступ к индексу списка
            //если значение еще не встречалось, то кладем единицу в ключ карты, так? // хотя внизу ключом как раз является фрукт, а число - это значение.
            //если встречалось, то добавляем еще единицу.
// а вот снизу синтаксис мне до конца не понятен. Попробую прочитать, а ты мне скажи, прав я или нет.
            //используем конструкцию foreach, где мы шаримся в карте "Map.Entry<String, Integer> entry" по элементам fruits.entrySet()
            //и после прохождения мапы выводим ключ карты entry и значение карты entry.
            //получается, вопрос в том, что entry - это название карты? может ли быть другое название? 
            for (Map.Entry<String, Integer> entry : fruits.entrySet()) {
                System.out.println("Fruit " + entry.getKey() + " repeats " + entry.getValue() + " times.");
            }

        }

    }
