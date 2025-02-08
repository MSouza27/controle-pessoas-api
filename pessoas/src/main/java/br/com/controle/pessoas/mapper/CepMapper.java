package br.com.controle.pessoas.mapper;

import br.com.controle.pessoas.dto.EnderecoDTO;
import br.com.controle.pessoas.model.Cep;

public class CepMapper {
    public static Cep toCep(EnderecoDTO dto){
        if (dto == null){
            return null;
        }
        return new Cep(
                dto.getCep(),
                dto.getLogradouro(),
                dto.getComplemento(),
                dto.getBairro(),
                dto.getLocalidade(),
                dto.getUf(),
                dto.getEstado(),
                dto.getRegiao(),
                dto.getDdd(),
                ""
        );
    }
}
