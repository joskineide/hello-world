package com.jsk.joska.services;

import com.jsk.joska.repository.GenericRepository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;

import java.util.Optional;

public interface GenericService<E, D> extends GenericRepository<E, D>{

    E create(E entity);

    Optional<E> read(D id);

    E update(E entity);

    void deleteById(D id);

    Page<E> list(Integer pageNumber, Integer pageSize, Sort.Direction direction, String orderBy);

    Page<E> search(E entity, Integer pageNumber, Integer pageSize, Sort.Direction direction, String orderBy);

    Page<E> find(E entity, Integer pageNumber, Integer pageSize, Sort.Direction direction, String orderBy);

}