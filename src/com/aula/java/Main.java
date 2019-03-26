package com.aula.java;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.aula.java.model.Contato;
import com.aula.java.model.Pessoa;

public class Main {

	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa();
		
		pessoa1.setNome("Ian");
		pessoa1.setSobrenome("Natanael");
		
		Contato contato1 = new Contato();
		
		Contato contato2 = new Contato();
		
		contato1.setTelefone("998338358");
		contato1.setEmail("Ianatanael15@hotmal.com");
		
		contato2.setTelefone("991449956");
		contato2.setEmail("Ianatanael@hotmal.com");
		
		List<Contato> contatos = new ArrayList<Contato>();
		
		contatos.add(contato1);
		contatos.add(contato2);
		
		pessoa1.setContatos(contatos);
		
		LocalDate dataNascimento = LocalDate.of(1999, 4, 12);
		
		pessoa1.setDataNascimento(dataNascimento);
		
		System.out.println(pessoa1.toString());
		
		

	}

}
