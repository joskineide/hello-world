package com.jsk.joska.controller;

import org.bson.types.ObjectId;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;

import com.jsk.joska.services.GenericService;
import com.jsk.joska.services.impl.GenericServiceImpl;
import com.jsk.joska.services.AlunoService;
import com.jsk.joska.model.Aluno;

@Api(tags = "Aluno")
@RestController
@RequestMapping("/aluno")
public class AlunoController extends GenericController<Aluno, ObjectId> {

    AlunoController(AlunoService service) {
        super(service);
    }
}
