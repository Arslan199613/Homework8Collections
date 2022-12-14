import java.lang.reflect.Array;
import java.nio.channels.ScatteringByteChannel;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 2");

        Product bananas = new Product("Бананы", 12500, 6);
        Product lemon = new Product("Лимоны", 17000, 15);
        Product apple = new Product("Яблоки", 5600, 10);
        Product orange = new Product("Апельсины", 2000, 9);

        Map<Product, Integer> products = new HashMap<>();
        products.put(bananas, bananas.getAmountOfProduct());
        products.put(lemon, lemon.getAmountOfProduct());
        products.put(apple, apple.getAmountOfProduct());
        products.put(orange, orange.getAmountOfProduct());

        for (Map.Entry<Product, Integer> productStringEntry : products.entrySet()) {
            System.out.println(productStringEntry);
        }
        double multiplication = bananas.getAmountOfProduct() * bananas.getPrice();
        System.out.println(multiplication);
        double multiplication2 = lemon.getAmountOfProduct() * lemon.getPrice();
        System.out.println(multiplication2);
        double multiplication3 = apple.getAmountOfProduct() * apple.getPrice();
        System.out.println(multiplication3);
        double multiplication4 = orange.getAmountOfProduct() * orange.getPrice();
        System.out.println(multiplication4);

        System.out.println("");


        Map<String, Integer> humans = new HashMap<>();
        humans.put("Иван Петров", 1996);

        System.out.println("Добавление еще одного в список");
        if (humans.containsKey("Иван Петров")) {
            humans.put("Васильев Иван", 1998);
            System.out.println(humans);

            System.out.println("Смена значения,но ключ всегда уникален");
        }
        if (humans.containsKey("Иван Петров")) {
            humans.put("Иван Петров", 2000);
        }
        System.out.println("Проверка такого ключа и значения");
        if (humans.containsKey("Иван Петров") && humans.containsValue(2000)) {
            System.out.println("Такой в списке есть уже");

            System.out.println("Вывод имен и значений");
            for (Map.Entry<String, Integer> human : humans.entrySet()) {
                System.out.println("Имя " + human.getKey() + ": " + human.getValue());
            }
        }
    }
}






