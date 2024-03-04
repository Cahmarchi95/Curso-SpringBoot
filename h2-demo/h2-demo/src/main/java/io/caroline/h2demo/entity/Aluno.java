package io.caroline.h2demo.entity;

import java.util.Set;

import jakarta.persistence.*;
import org.springframework.data.mongodb.core.mapping.Document;

//@Entity
@Document
public class Aluno {
    public Aluno() {
    }

    public Aluno(String name, String email) {
        super();
        this.name = name;
        this.email = email;
    }

    @Id
    private String id;
    //@GeneratedValue(strategy = GenerationType.AUTO)
    //private Long id;
    private String name;
    private String email;


    //@ManyToMany
    private Set<Livro> livros;

//    public Long getId() {
//        return id;
//    }
//    public void setId(Long id) {
//        this.id = id;
//    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
