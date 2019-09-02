package com.jsk.joska.repository;

import com.jsk.joska.model.Aluno;

import org.bson.types.ObjectId;
import org.springframework.stereotype.Repository;
// import org.springframework.data.mongodb.repository.MongoRepository;

@Repository
public interface AlunoRepository extends GenericRepository<Aluno, ObjectId>{
    
}