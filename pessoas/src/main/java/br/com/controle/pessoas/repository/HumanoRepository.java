package br.com.controle.pessoas.repository;

import br.com.controle.pessoas.model.Humano;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HumanoRepository extends JpaRepository<Humano, Long> {

}
