package br.com.controle.pessoas.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;

public class HumanoRequestDTO {

    private static final String CAMPO_OBRIGATORIO = "O campo precisa ser preenchido.";
    private static final String TAMANHO_MENSSAGEM = "O campo precisa ser entre 3 e 30 caracteres";
    private static final String VALOR_PESSOAS_NA_CASA = "Valor mínimo 1 e é permitido no máximo 10 pessoas.";

    @NotBlank(message = CAMPO_OBRIGATORIO)
    @Size(min = 3, max = 30, message = TAMANHO_MENSSAGEM)
    private String name;

    @NotBlank(message = CAMPO_OBRIGATORIO)
    @Size(min = 3, max = 30, message = TAMANHO_MENSSAGEM)
    private String sexo;

    @NotNull(message = CAMPO_OBRIGATORIO)
    @Min(value = 1, message = VALOR_PESSOAS_NA_CASA)
    @Max(value = 10, message = VALOR_PESSOAS_NA_CASA)
    private BigDecimal quantidadeDePessoasMorando;

    @NotBlank(message = "O número precisa ser preenchido.")
    private String numero;

    private String cep;

    public HumanoRequestDTO() {
    }

    public HumanoRequestDTO(String name, String sexo, BigDecimal quantidadeDePessoasMorando, String cep, String numero) {
        this.name = name;
        this.sexo = sexo;
        this.quantidadeDePessoasMorando = quantidadeDePessoasMorando;
        this.cep = cep;
        this.numero = numero;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public BigDecimal getQuantidadeDePessoasMorando() {
        return quantidadeDePessoasMorando;
    }

    public void setQuantidadeDePessoasMorando(BigDecimal quantidadeDePessoasMorando) {
        this.quantidadeDePessoasMorando = quantidadeDePessoasMorando;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
