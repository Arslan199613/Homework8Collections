import java.util.*;

public class Recipes {
    private Product product;
    private double sum;
    private String nameOfRecipes;

    public Recipes(double sum, String nameOfRecipes) {
        this.sum = sum;
        this.nameOfRecipes = nameOfRecipes;
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
}
