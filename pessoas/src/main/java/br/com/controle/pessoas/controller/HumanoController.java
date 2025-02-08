package br.com.controle.pessoas.controller;

import br.com.controle.pessoas.dto.HumanoRequestDTO;
import br.com.controle.pessoas.model.Humano;
import br.com.controle.pessoas.service.PessoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pessoas")
public class HumanoController {

    private final PessoService pessoService;

    @Autowired
    public HumanoController(PessoService pessoService) {
        this.pessoService = pessoService;
    }

    @PostMapping
    public ResponseEntity<Humano> criarPessoa(@RequestBody @Valid HumanoRequestDTO humanoRequestDTO){
        Humano humano = new Humano();
        humano.setName(humanoRequestDTO.getName());
        humano.setSexo(humanoRequestDTO.getSexo());
        humano.setQuantidadeDePessoasMorando(humanoRequestDTO.getQuantidadeDePessoasMorando());

        Humano humanoSalvo = pessoService.salvarPessoa(
                humano,
                humanoRequestDTO.getCep(),
                humanoRequestDTO.getNumero()
        );

        return ResponseEntity.ok(humanoSalvo);
    }
}
