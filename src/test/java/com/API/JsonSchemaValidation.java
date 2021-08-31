package com.API;

import io.restassured.RestAssured;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.io.File;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class JsonSchemaValidation {

  @Before
  public void setup() {
    RestAssured.baseURI = "https://hostname:port";
    RestAssured.basePath = "api/items";
  }

  @After
  public static void cleanUp() {
    RestAssured.reset();
  }

  @DisplayName("Check GET /Objects")
  @Test
  public void testAllObjectSchema() {

    when()
            .get("/items").
            then()
            .body(matchesJsonSchemaInClasspath("ObjectsSchema.json"))
            .body(matchesJsonSchema(new File("src/test/resources/ObjectsSchema.json")));

  }

  @DisplayName("Check GET /Objects")
  @Test
  public void test1() {

    given()
            .pathParam("id", "60c6483a3837ce6ec31fd556")
            .when()
            .get("/items/{id}")
            .then()
            .log().body()
            .statusCode(200)
            .body(matchesJsonSchemaInClasspath("ObjectsSchema.json"));

  }
}


