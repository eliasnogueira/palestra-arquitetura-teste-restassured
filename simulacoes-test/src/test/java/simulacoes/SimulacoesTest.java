package simulacoes;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import client.SimulacoesClient;
import java.math.BigDecimal;
import model.Simulacao;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SimulacoesTest {

    SimulacoesClient simulacoesClient;

    @BeforeClass
    public void preCondicao() {
        simulacoesClient = new SimulacoesClient();
    }

    @Test
    public void retornaSimulacaoPeloCPF() {
        Simulacao simulacao = simulacoesClient.retornaSimulacaoPeloCPF("66414919004");
        assertThat(simulacao.getNome(), is("Fulano"));
        assertThat(simulacao.getEmail(), is("fulano@gmail.com"));
        assertThat(simulacao.getValor(), is(new BigDecimal("11000.00")));
        assertThat(simulacao.getParcelas(), is(3));
        assertThat(simulacao.getSeguro(), is(true));
    }

    @Test
    public void criarNovaSimulacaoComSucesso() {
        Simulacao simulacao = Simulacao.builder().
            nome("Elias").cpf("98765432109").email("elias@elias.com").valor(new BigDecimal("30000.00")).
            parcelas(5).seguro(true).build();

        simulacoesClient.criarNovaSimulacaoComSucesso(simulacao);
    }
}
