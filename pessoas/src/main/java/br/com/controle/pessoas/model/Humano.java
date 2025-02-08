package br.com.controle.pessoas.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "db_cadastro")
public class Humano {

    private static final String CAMPO_OBRIGATORIO ="O campo precisa ser preenchido.";
    private static final String TAMANHO_MENSSAGEM = "O tamanho da mensagem é no máximo 30 caracteres.";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome",length = 30)
    @NotBlank(message = CAMPO_OBRIGATORIO)
    @Size(min = 3, max = 30, message = TAMANHO_MENSSAGEM)
    private String name;

    @Column(name = "identidade_genero", length = 30)
    @NotBlank(message = CAMPO_OBRIGATORIO)
    @Size(min = 5, max = 30, message = TAMANHO_MENSSAGEM)
    private String sexo;

    @Column(name = "quantidade_pessoas", length = 30)
    @NotNull(message = CAMPO_OBRIGATORIO)
    @Min(value = 1, message = CAMPO_OBRIGATORIO)
    @Max(value = 10, message = CAMPO_OBRIGATORIO)
    private BigDecimal quantidadeDePessoasMorando;

    @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss")
    @Column(nullable = false, updatable = false)
    private LocalDateTime timeStamp;

    @Embedded
    private Cep cep;

    @PrePersist
    public void prePersist(){
        this.timeStamp = LocalDateTime.now();
    }

    public Humano() {
    }

    public Humano(Long id, String name, String sexo, BigDecimal quantidadeDePessoasMorando) {
        this.id = id;
        this.name = name;
        this.sexo = sexo;
        this.quantidadeDePessoasMorando = quantidadeDePessoasMorando;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(LocalDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }

    public Cep getCep() {
        return cep;
    }

    public void setCep(Cep cep) {
        this.cep = cep;
    }
}
