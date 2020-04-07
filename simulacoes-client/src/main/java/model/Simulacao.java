package model;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Simulacao {

    @JsonIgnore
    private Long id;
    private String nome;
    private String cpf;
    private String email;
    private BigDecimal valor;
    private Integer parcelas;
    private Boolean seguro;

}
