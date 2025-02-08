package br.com.controle.pessoas.service;

import br.com.controle.pessoas.dto.EnderecoDTO;
import br.com.controle.pessoas.mapper.CepMapper;
import br.com.controle.pessoas.model.Cep;
import br.com.controle.pessoas.model.Humano;
import br.com.controle.pessoas.repository.HumanoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PessoService {

    private final HumanoRepository humanoRepository;
    private final ViaCepService viaCepService;

    @Autowired
    public PessoService(HumanoRepository humanoRepository, ViaCepService viaCepService) {
        this.humanoRepository = humanoRepository;
        this.viaCepService = viaCepService;
    }

    public Humano salvarPessoa(Humano humano, String cep, String numero){
        EnderecoDTO dto = viaCepService.consultarCep(cep).block();
        Cep endereco = CepMapper.toCep(dto);
        endereco.setNumero(numero);
        humano.setCep(endereco);
        return humanoRepository.save(humano);
    }
}
