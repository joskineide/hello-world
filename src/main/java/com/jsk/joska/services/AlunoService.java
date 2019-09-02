package com.jsk.joska.services;

import java.util.Optional;

import com.jsk.joska.model.Aluno;
import com.jsk.joska.repository.AlunoRepository;

import org.bson.types.ObjectId;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;

public interface AlunoService extends GenericService<Aluno, ObjectId>, AlunoRepository{

    Optional<Aluno> read(ObjectId id);

    Aluno update(Aluno aluno);

    void delete(Aluno id);

    Page<Aluno> list(Integer pageNumber, Integer pageSize, Sort.Direction direction, String orderBy);

    Page<Aluno> search(Aluno aluno, Integer pageNumber, Integer pageSize, Sort.Direction direction, String orderBy);

    Page<Aluno> find(Aluno aluno, Integer pageNumber, Integer pageSizer, Sort.Direction direction, String orderBy);
    
}