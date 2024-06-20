package br.com.confidencecambio.javabasico;

import br.com.confidencecambio.javabasico.model.Cliente;
import br.com.confidencecambio.javabasico.model.Gerente;
import br.com.confidencecambio.javabasico.model.Robo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import static br.com.confidencecambio.javabasico.util.NameUtil.abbreviateName;
import static br.com.confidencecambio.javabasico.util.NameUtil.getFirstName;
import static br.com.confidencecambio.javabasico.util.NameUtil.getMiddleAndLastName;
import static br.com.confidencecambio.javabasico.util.ValidateUtil.validateEmptySpace;
import static br.com.confidencecambio.javabasico.util.ValidateUtil.validateValue;

@SpringBootApplication
public class JavaBasicoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaBasicoApplication.class, args);

		final var cliente = new Cliente("Pedro Soares da Silva");
		final var gerente = new Gerente("José Bernardo da Silva");
		final var robo = new Robo("Aquiles Moreira Miguel");

		new ArrayList<>(List.of(cliente, gerente, robo)).forEach(p -> {
			if (validateValue(p.getNome())) {
				System.out.println("----------------------------------");
				System.out.println("Nome vazio ou em branco");
				System.out.println("----------------------------------");
				return;
			}


			if (validateEmptySpace(p.getNome())) {
				System.out.println("----------------------------------");
				System.out.println("Nome com espaços em branco começo/fim, nome: ".concat(p.getNome()));
				System.out.println("----------------------------------");
				return;
			}

			p.setNome(p.getNome().toUpperCase());

			System.out.println("----------------------------------");
			System.out.println("O primeiro nome é: ".concat(getFirstName(p.getNome())));
			System.out.println("O último nome do é: ".concat(getMiddleAndLastName(p.getNome())));
			System.out.println("O nome completo abreviado do é: ".concat(abbreviateName(p.getNome())));
			System.out.println("----------------------------------");
		});
	}
}
