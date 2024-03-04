package io.caroline.h2demo.controllers;

import io.caroline.h2demo.repository.AlunoRepository;
import io.caroline.h2demo.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class AlunoController {

    @Autowired
    private AlunoService alunoService;

    @RequestMapping("/aluno")
    public String getAlunos(Model model){
        model.addAttribute("alunosList", this.alunoService.findAll());

        return "aluno";
    }
}
