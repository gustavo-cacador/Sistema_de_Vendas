package com.projeto.sistema.controle;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PrincipalControle {
    
    @GetMapping("/administrativo")
    public String acessarPrincipal(){
        return "administrativo/home"; // Aqui é onde vamos navegar no nosso FrontEnd (localhost:8080/administrativo)
    }

}
