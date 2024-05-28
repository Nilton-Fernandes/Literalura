package br.com.Nilton.Literalura;

import br.com.Nilton.Literalura.principal.Main;
import br.com.Nilton.Literalura.repositorio.IAutorRepositorio;
import br.com.Nilton.Literalura.repositorio.ILivroRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiteraluraApplication implements CommandLineRunner {

	@Autowired
	IAutorRepositorio autorRepositorio;
	@Autowired
	ILivroRepositorio livroRepositorio;

	public static void main(String[] args) {
		SpringApplication.run(LiteraluraApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Main main = new Main(autorRepositorio,livroRepositorio);
		main.principal();
	}
}