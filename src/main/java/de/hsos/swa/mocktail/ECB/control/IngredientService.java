package de.hsos.swa.mocktail.ECB.control;

import java.util.List;

import de.hsos.swa.mocktail.ECB.entity.Ingredient;

public interface IngredientService {
    boolean createIngredient(String name);

    boolean addIngredientToMocktail(int ingredientID, int mocktailID);

    boolean deleteIngredient(int id);

    boolean removeIngredientFromMocktail(int ingredientID, int mocktailID);

    boolean updateIngredient(int id, String name);

    Ingredient getIngredientById(int id);

    List<Ingredient> getIngredients();
}