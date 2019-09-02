package com.jsk.joska.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

// @Document
// @Data
@Getter
@Setter
@Document(collection= "user")
public class Aluno extends User{

    private Integer ra;
    private Integer faltas;
    private Double mediaNotas;

}