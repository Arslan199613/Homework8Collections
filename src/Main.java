import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание 1");
        Product product = new Product("12000 рублей", "10 килограмм");
        System.out.println(product);


        Set<String> products = new HashSet<>();
        products.add("Банан");
        products.add("Апельсин");
        products.add("Лимон");
        products.add("Дыня");
        products.add("Арбуз");
        System.out.println(products);
        System.out.println();
        product.addProduct();

        System.out.println("Домашнее задание 2");
        Recipes recipe = new Recipes(10000, "Борщ");

        Set<String> recipes = new HashSet<>();
        recipes.add("Рецепт 1");
        recipes.add("Рецепт 2");
        recipes.add("Рецепт 3");
        recipes.add("Рецепт 4");
        recipes.add("Рецепт 5");
        recipe.addRecipes();

        System.out.println("Домашнее задание по выводу четных чисел!");
        Set<Integer> numbers = new HashSet<>();

        numbers.add(18);
        numbers.add(299);
        numbers.add(245);
        numbers.add(4);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(14);
        numbers.add(16);
        numbers.add(13);
        numbers.add(23);
        numbers.add(110);
        numbers.add(122);
        numbers.add(112);
        numbers.add(111);
        numbers.add(114);
        numbers.add(221);
        numbers.add(316);
        numbers.add(314);
        numbers.add(998);
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);

            }
        }

    }
}