package com.fiap.EmpresaProjeto;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configuracao {
    @Bean(name="applicationName")
    //Esse bean é muito usado pra configuração de banco de dados por exemplo
    //Posso ter mais de um Bean!
    // Nome para que a aplicação seja chamada na class EmpresaProjetoApplication
    public String applicationName(){
        return "Sistema de vendas";
    }
    //O bean é pra connseguir ser usado em todos os lugares da minha aplicação
}
