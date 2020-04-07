package restricoes;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

import org.apache.http.HttpStatus;
import org.testng.annotations.Test;
import test.BaseAPI;

public class RestricoesTest extends BaseAPI {

    @Test
    public void pessoaComRestricao() {
        given().
            pathParam("cpf", "97093236014").
        when().
            get("/v1/restricoes/{cpf}").
        then().
            statusCode(HttpStatus.SC_OK).
            body("mensagem", is("O CPF 97093236014 possui restrição"));
    }

    @Test
    public void pessoaSemRestricao() {
        given().
            pathParam("cpf", "87365927062").
        when().
            get("/v1/restricoes/{cpf}").
        then().
            statusCode(HttpStatus.SC_NOT_FOUND);
    }
}
