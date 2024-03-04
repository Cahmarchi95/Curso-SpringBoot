package io.caroline.h2demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import io.caroline.h2demo.entity.Aluno;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

//public interface AlunoRepository extends JpaRepository <Aluno, Long>{
////Aluno findByName(String name);
//
//    //@Query("select u from Aluno u where u.name = ?1")
//    //@Query("select u from Aluno u where u.name like %?1%")
//    //Aluno findByNameExemplo(String name);
//    //Aluno findByEmail(String email);
//
//    Aluno findByNameIgnoreCase(String name);
//
//}

@Repository
public interface AlunoRepository extends MongoRepository<Aluno, Long> {
    //Aluno findByEmail(String email);
   //Aluno findByNameIgnoreCase(String name);

    @Query("{'email' :?0}")
    Aluno findByEmailQualquerCoisa(String email);

    Aluno findByNameIgnoreCaseLike(String name);


}
