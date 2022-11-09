package de.hsos.swa.mocktail.ECB.boundry;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

import static org.hamcrest.CoreMatchers.*;

import javax.ws.rs.core.MediaType;

import static io.restassured.RestAssured.given;

@QuarkusTest
public class MocktailResourceTest {
    @Test
    void testAddMocktail() {
        given()
        .contentType(MediaType.APPLICATION_JSON)
        .when().post("/mocktails/Mochito}")
        .then()
        .statusCode(200)
        .body(is("Mocktail has been added successfully"));
    }

    @Test
    void testDeleteMocktail() {
        given()
        .contentType(MediaType.APPLICATION_JSON)
        .when().delete("/mocktails/1")
        .then()
        .statusCode(200)
        .body(is("Mocktail has been deleted successfully"));
    }

    @Test
    void testGetMocktailById() {
        given()
        .when().get("/mocktails/{id}", 0)
        .then()
        .statusCode(200)
        .body("id", equalTo(0));
    }

    @Test
    void testGetMocktails() {
        given()
        .when()
        .get("/mocktails")
        .then()
        .statusCode(200);
    }

    @Test
    void testUpdateMocktail() {
        given()
        .contentType(MediaType.APPLICATION_JSON)
        .when().put("mocktails/0?mocktail=StarkVodka")
        .then()
        .statusCode(200)
        .body(is("Mocktail has been updated successfully"));
    }
}
