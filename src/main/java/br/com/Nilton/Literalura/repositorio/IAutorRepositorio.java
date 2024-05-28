package br.com.Nilton.Literalura.repositorio;


import br.com.Nilton.Literalura.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface IAutorRepositorio extends JpaRepository<Autor, Long>{
    Boolean existsByNome(String nome);

    Autor findByNome(String nome);

    @Query("SELECT a FROM Autor a WHERE a.dataDeFalecimento >= :anoSelecionado AND :anoSelecionado >= a.dataDeNascimento")
    List<Autor> buscarPorAnoDeFalecimento(int anoSelecionado);
}
