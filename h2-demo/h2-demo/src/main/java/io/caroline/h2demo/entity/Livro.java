package io.caroline.h2demo.entity;

import jakarta.persistence.*;
import org.springframework.data.mongodb.core.mapping.Document;

//@Entity
@Document
public class Livro {
    @Id
    private String id;
    //@GeneratedValue(strategy = GenerationType.AUTO)
    //private Long id;
    private String titulo;
    private int paginas;
    private String autor;
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
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getPaginas() {
        return paginas;
    }
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
}


