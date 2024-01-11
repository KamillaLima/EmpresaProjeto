package com.fiap.EmpresaProjeto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@ComponentScan(basePackages = {"com.fiap.EmpresaProjeto.repository","com.fiap.EmpresaProjeto.service"})
//É pra eu especificar as classes que eu preciso escanear,é mais util caso eu tenha uma pacote de uma biblioteca
//de terceiros,porque fora isso os pacotes que estiverem no caminho com.fiap.EmpresaProjeto já serão escaneados
//automaticamente

public class EmpresaProjetoApplication {

	@Autowired
	@Qualifier("applicationName")
	//Identificar que eu quero que ele chame o meu bean com o nome applicationName
	private String applicationName;


	@GetMapping("/hello")
	public String hello(){
		return applicationName;
	}

	public static void main(String[] args) {
		SpringApplication.run(EmpresaProjetoApplication.class, args);
	}

}
