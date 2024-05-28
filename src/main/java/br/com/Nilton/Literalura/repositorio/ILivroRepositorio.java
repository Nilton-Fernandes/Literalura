package br.com.Nilton.Literalura.repositorio;

import br.com.Nilton.Literalura.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ILivroRepositorio extends JpaRepository<Book,Long> {

    boolean existsByNome(String nome);

    @Query("SELECT DISTINCT b.idioma FROM Book b ORDER BY b.idioma")
    List<String> bucasidiomas();

    @Query("SELECT b FROM Book b WHERE idioma = :idiomaSelecionado")
    List<Book> buscarPorIdioma(String idiomaSelecionado);

    Book findByNome(String nome);
}
