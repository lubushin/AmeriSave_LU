package com.API;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class PositiveTest_Validation {
    @Before
    public void setup() {
        RestAssured.baseURI = "https://hostname:port";
        RestAssured.basePath = "api/items";
    }

    @After
    public static void cleanUp() {
        RestAssured.reset();
    }

    @DisplayName("POST/ Object with Random Data")
    @Test
    public void PostRandomJsonObject() {

        Map<String, Object> randomObject = Utilities.getRandomObjectMap();
        given()
                .log().all()
                .contentType(ContentType.JSON)
                .body(randomObject)
                .when().post("/items")
                .then().log().all()
                .statusCode(is(201));

    }

    @DisplayName("PUT / objects/{id} body type")
    @Test
    public void ObjectUpdatingData() {
        Map<String, Object> bodyMap = Utilities.getRandomObjectMap();

        given()
                .log().all()
                .pathParam("id", "60c6483a6b4bb9d93a38fb5a")
                .contentType(ContentType.JSON)
                .body(bodyMap).
                when()
                .put("/items/{id}").
                then()
                .log().all()
                .statusCode(204);

    }


    @DisplayName("Delete/ items/{id} ")
    @Test
    public void testDeleteObject() {
        given()
                .log().uri()
                .pathParam("id", "60c6483a6b4bb9d93a38fb5a").
                when()
                .delete("/items/{id}").
                then()
                .statusCode(equalTo(204));
    }

}


