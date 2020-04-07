package test;

import static io.restassured.RestAssured.basePath;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.config;
import static io.restassured.RestAssured.enableLoggingOfRequestAndResponseIfValidationFails;
import static io.restassured.RestAssured.port;
import static io.restassured.config.JsonConfig.jsonConfig;
import static io.restassured.path.json.config.JsonPathConfig.NumberReturnType.BIG_DECIMAL;

import io.restassured.config.RestAssuredConfig;
import org.testng.annotations.BeforeMethod;

public class BaseAPI {

    @BeforeMethod
    public void preCondition() {
        baseURI = "http://localhost";
        basePath = "/api";
        port = 8088;

        config = RestAssuredConfig.newConfig().
            jsonConfig(jsonConfig().numberReturnType(BIG_DECIMAL));

        enableLoggingOfRequestAndResponseIfValidationFails();
    }
}
