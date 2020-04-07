package client;

import static io.restassured.RestAssured.given;

import io.restassured.response.ValidatableResponse;
import org.apache.http.HttpStatus;
import commons.Base;

public class RestricoesClient {

    public RestricoesClient() {
        Base.initConfig();;
    }

    public ValidatableResponse retornaCPFComRestricao(String cpf) {
        return
            given().
                pathParam("cpf", "97093236014").
            when().
                get("/v1/restricoes/{cpf}").
            then().
                statusCode(HttpStatus.SC_OK);
    }


    public void consultaCPFSemRestricao(String cpf) {
        given().
            pathParam("cpf", cpf).
        when().
            get("/v1/restricoes/{cpf}").
        then().
            statusCode(HttpStatus.SC_NOT_FOUND);
    }


}
