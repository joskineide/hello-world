package main.java.com.jsk.joska.services.impl;

import com.jsk.joska.services.AlunoService;
import main.java.com.jsk.joska.services.impl.GenericServiceImpl;
import com.jsk.joska.repository.GenericRepository;
import com.jsk.joska.repository.AlunoRepository;
import com.jsk.joska.model.Aluno;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("alunoService")
public class AlunoServiceImpl extends GenericServiceImpl<Aluno, ObjectId> implements AlunoService{
    @Autowired
    private AlunoRepository repository;

    public AlunoServiceImpl(GenericRepository<Aluno, ObjectId> genericRepository){
        super(genericRepository);
    }
}