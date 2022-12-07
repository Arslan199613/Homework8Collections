import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Recipes {
    private double sum;
    private String nameOfRecipes;
    private Set<Product> products;
    Set<String> recipes;

    public Recipes(double sum, String nameOfRecipes) {
        this.sum = sum;
        this.nameOfRecipes = nameOfRecipes;
        recipes = new HashSet<>();
        products = new HashSet<>();
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public String getNameOfRecipes() {
        return nameOfRecipes;
    }

    public void setNameOfRecipes(String nameOfRecipes) {
        this.nameOfRecipes = nameOfRecipes;
    }

    public Set<String> getRecipes() {
        return recipes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipes recipes = (Recipes) o;
        return Double.compare(recipes.sum, sum) == 0 && Objects.equals(nameOfRecipes, recipes.nameOfRecipes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sum, nameOfRecipes);
    }

    @Override
    public String toString() {
        return "Стоимость всех продуктов данного рецепта-" + sum + ", название рецепта" + nameOfRecipes;
    }

    public void addRecipes() {
        if (recipes.contains("Рецепт 1")) {
        }
        throw new RuntimeException("В списке уже есть бананы,второй раз положить нельзя!");
    }
}
