package de.hsos.swa.mocktail.ECB.boundry;

import org.junit.jupiter.api.Test;
import io.quarkus.test.junit.QuarkusTest;

import static org.hamcrest.CoreMatchers.*;

import javax.ws.rs.core.MediaType;

import static io.restassured.RestAssured.given;

@QuarkusTest
public class IngredientResourceTest {
    @Test
    void testAddIngredientToMocktail() {

        //TO DO

        //given()
        //.when().post("/ingredients/{ingredient}/1?mocktailID=0", 1)
        //.then()
        //.statusCode(200)
        //.body(is("Ingredient has been added to Mocktail successfully"));
    }

    @Test
    void testCreateIngredient() {
        given()
        .contentType(MediaType.APPLICATION_JSON)
        .when().post("/ingredients/Schweps}")
        .then()
        .statusCode(200)
        .body(is("Ingredient has been added successfully"));
    }

    @Test
    void testDeleteIngredient() {
        given()
        .contentType(MediaType.APPLICATION_JSON)
        .when().delete("/ingredients/0")
        .then()
        .statusCode(200)
        .body(is("Ingredient has been deleted successfully"));
    }

    @Test
    void testGetIngredientById() {
        given()
        .when().get("/ingredients/{id}", 1)
        .then()
        .statusCode(200)
        .body("id", equalTo(1));
    }

    @Test
    void testGetIngredients() {
        given()
        .when()
        .get("/ingredients")
        .then()
        .statusCode(200);
    }

    @Test
    void testUpdateIngredient() {
        given()
        .contentType(MediaType.APPLICATION_JSON)
        .when().put("ingredients/1?name=Moooh")
        .then()
        .statusCode(200)
        .body(is("Ingredient has been updated successfully"));
    }
}
