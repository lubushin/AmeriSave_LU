package com.API;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;


public class NegativeTest_Validation {
    @Before
    public void setup() {
        RestAssured.baseURI = "https://hostname:port";
        RestAssured.basePath = "api/items";
    }

    @After
    public static void cleanUp() {
        RestAssured.reset();
    }


    @DisplayName("POST request without content type expect 415")
    @Test
    public void test1() {
        Pojo pj = new Pojo();


        given()
                .log().body()
                .body(pj)
                .when()
                .post("/items").
                then()
                .statusCode(415);

    }

    @DisplayName("POST request without valid json expect 400")
    @Test
    public void test2() {

        given()
                .log().all()
                .contentType(ContentType.JSON)
                .body("Bad Json structure here").
                when()
                .post("/items").
                then()
                .statusCode(400);

    }

    @DisplayName("POST request with valid json , bad name - expect 400 with detailed name error message")
    @Test
    public void test3() {
        Pojo pj = new Pojo();
        given()
                .log().body()
                .contentType(ContentType.JSON)
                .body(pj).
                when()
                .post("/items").
                then()
                .statusCode(400)
                .body("message", is("Invalid Input!"))
                .body("errorCount", equalTo(1))
                .body("errors[0].reason", is("name should be at least 2 character and max 15 character"));
    }
}
