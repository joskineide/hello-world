package com.jsk.joska.model;

import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

@Getter
@Setter
abstract class User{
    @Id
    private ObjectId _id;
    private String name;    
}