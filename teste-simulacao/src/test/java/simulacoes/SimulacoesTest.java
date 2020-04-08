package simulacoes;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

import java.math.BigDecimal;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;
import test.BaseAPI;

public class SimulacoesTest extends BaseAPI {

    @Test
    public void encontrarUmaSimulacaoExistente() {
        given().
            pathParam("cpf", "66414919004").
        when().
            get("/v1/simulacoes/{cpf}").
        then().
            statusCode(HttpStatus.SC_OK).
            body(
                "nome", equalTo("Fulano"),
                "email", equalTo("fulano@gmail.com"),
                "valor", equalTo(new BigDecimal("11000.00")),
                "parcelas", equalTo(3),
                "seguro", equalTo(true)
            );
    }

    @Test
    public void simulacaoNaoEncontrada() {
        given().
            queryParam("cpf", "45320342055").
        when().
            get("/v1/simulacoes/{cpf}").
        then().
            statusCode(HttpStatus.SC_NOT_FOUND);
    }



}
