package client;

import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import model.Simulacao;
import org.apache.http.HttpStatus;
import commons.Base;

public class SimulacoesClient extends Base {

    public SimulacoesClient() {
        Base.initConfig();
    }

    public void criarNovaSimulacaoComSucesso(Simulacao simulacao) {
        given().
            contentType(ContentType.JSON).
            body(simulacao).
        when().
            post("/v1/simulacoes").
        then().
            statusCode(HttpStatus.SC_CREATED);
    }

    public Simulacao retornaSimulacaoPeloCPF(String cpf) {
        return
            given().
                pathParam("cpf", cpf).
            when().
                get("/v1/simulacoes/{cpf}").
            then().
                statusCode(HttpStatus.SC_OK).
                extract().
                    body().
                        as(Simulacao.class);
    }
}
