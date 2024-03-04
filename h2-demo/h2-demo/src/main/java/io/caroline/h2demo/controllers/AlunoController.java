package io.caroline.h2demo.controllers;

import io.caroline.h2demo.repository.AlunoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class AlunoController {
    private AlunoRepository alunoRepository;

    public AlunoController(AlunoRepository alunoRepository){
        this.alunoRepository = alunoRepository;
    }

    @RequestMapping("/aluno")
    public String getAlunos(Model model){
        model.addAttribute("alunosList", this.alunoRepository.findAll());

        return "aluno";
    }
}
