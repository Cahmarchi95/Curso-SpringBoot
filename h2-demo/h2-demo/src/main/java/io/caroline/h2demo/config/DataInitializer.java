package io.caroline.h2demo.config;

import io.caroline.h2demo.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import io.caroline.h2demo.entity.Aluno;

import java.util.List;


@Component
public class DataInitializer implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    AlunoRepository alunoRepository;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {

        List<Aluno> alunos = alunoRepository.findAll();

        if(alunos.isEmpty()){

            createAluno("Maria", "maria@email.com");
            createAluno("Pedro", "pedro@email.com");
            createAluno("Tomaz", "tomaz@email.com");


        }

        //Aluno aluno = alunoRepository.getOne(1L);
        //System.out.println(aluno.getName());
        //alunoRepository.deleteById(2L);
        //aluno.setName("Maria José");
        //alunoRepository.save(aluno);

        //Aluno aluno = alunoRepository.findByNameExemplo("Maria");
        //Aluno aluno = alunoRepository.findByNameExemplo("Mar");

        //Aluno aluno = alunoRepository.findByEmail("tomaz@email.com");

        //Aluno aluno = alunoRepository.findByNameIgnoreCase("maria");

       //Aluno aluno = alunoRepository.findByNameIgnoreCaseLike("mari");

        Aluno aluno = alunoRepository.findByEmailQualquerCoisa("tomaz@email.com");

        System.out.println(aluno.getName());

    }

    public void createAluno(String name, String email){
        Aluno aluno = new Aluno(name, email);
        alunoRepository.save(aluno);
    }

}
