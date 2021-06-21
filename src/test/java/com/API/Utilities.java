package com.API;

import com.github.javafaker.Faker;

import java.util.LinkedHashMap;
import java.util.Map;

public class Utilities {

    private static Pojo pojoObject = new Pojo();
    private static Faker faker = new Faker();

    public static Map<String, Object> getRandomObjectMap() {

        Map<String, Object> bodyMap = new LinkedHashMap<>();
        bodyMap.put("_id", faker.bothify("##?####?####??#??##?d###"));
        bodyMap.put("index", faker.number().randomDigit());
        bodyMap.put("guid", faker.bothify("?#?#?##?-????-##?#-####-##?###??###?"));
        bodyMap.put("isActive", faker.bool().bool());
        bodyMap.put("balance", faker.bothify("$#,###.##"));
        bodyMap.put("age", faker.number().numberBetween(20, 40));
        bodyMap.put("eyeColor", faker.color().name());
        bodyMap.put("name", faker.name().firstName());
        bodyMap.put("gender", faker.demographic().sex());
        bodyMap.put("email", faker.name().username() + "@gmail.com");
        bodyMap.put("phone", faker.bothify("+1 (###) ") + faker.number().numberBetween(1000000, 9999999));
        bodyMap.put("address", faker.number().numberBetween(100, 999) + " " + faker.address().streetName() + ", " + faker.address().cityName() + ", " + faker.address().state() + ", " + faker.number().numberBetween(100, 10000));
        bodyMap.put("tags", faker.lorem().words().toArray(new String[3]));
        bodyMap.put("id", faker.number().randomDigit());
        return bodyMap;
    }

    public static Pojo setRandomJsonObjectPojo() {

        pojoObject.set_id(faker.bothify("##?####?####??#??##?d###"));
        pojoObject.setIndex(faker.number().randomDigit());
        pojoObject.setGuid(faker.bothify("?#?#?##?-????-##?#-####-##?###??###?"));
        pojoObject.setActive(faker.bool().bool());
        pojoObject.setBalance("$" + faker.number().numberBetween(1, 4) + faker.bothify(",###.##"));
        pojoObject.setAge(faker.number().numberBetween(20, 40));
        pojoObject.setEyeColor(faker.color().name());
        pojoObject.setName(faker.name().firstName());
        pojoObject.setGender(faker.demographic().sex());
        pojoObject.setEmail(faker.name().username() + "@gmail.com");
        pojoObject.setPhone(faker.bothify("+1 (###) ") + faker.number().numberBetween(1000000, 9999999));
        pojoObject.setAddress(faker.number().numberBetween(100, 999) + " " + faker.address().streetName() + ", " + faker.address().cityName() + ", " + faker.address().state() + ", " + faker.number().numberBetween(100, 10000));
        pojoObject.setTags(faker.lorem().words().toArray(new String[3]));
        pojoObject.setId(faker.number().randomDigit());

        return pojoObject;

    }
}

