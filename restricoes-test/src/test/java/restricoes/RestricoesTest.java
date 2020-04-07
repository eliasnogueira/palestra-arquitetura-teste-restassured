package restricoes;

import static org.hamcrest.CoreMatchers.is;

import client.RestricoesClient;
import io.restassured.response.ValidatableResponse;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RestricoesTest {

    RestricoesClient restricoesClient;

    @BeforeMethod
    public void preCondicao() {
        restricoesClient = new RestricoesClient();
    }

    @Test
    public void pessoaComRestricao() {
        ValidatableResponse response = restricoesClient.retornaCPFComRestricao("97093236014");
        response.body("mensagem", is("O CPF 97093236014 possui restrição"));
    }

    @Test
    public void pessoaSemRestricao() {
        restricoesClient.consultaCPFSemRestricao("85893827200");
    }

}
