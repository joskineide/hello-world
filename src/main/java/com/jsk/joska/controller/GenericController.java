package com.jsk.joska.controller;

import java.util.Optional;

import javax.validation.Valid;

import com.jsk.joska.services.GenericService;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Page;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/**
 * The type Generic controller.
 *
 * @param <E> Generic Entity
 * @param <U> Generic Entity ObjectId
 */

public abstract class GenericController<E, U> {
    private final GenericService<E, U> service;

    GenericController(GenericService service) {
        this.service = service;
    }

    @ApiOperation(value = "create")
    @RequestMapping(method = RequestMethod.POST)
    public E create(@ApiParam(value = "entity", required = true) @RequestBody E entity) {
        return service.create(entity);
    }

    @ApiOperation(value = "read")
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public Optional<E> read(@ApiParam(value = "id", required = true) @PathVariable U id) {
        return service.read(id);
    }

    @ApiOperation(value = "update")
    @RequestMapping(method = RequestMethod.PUT)
    public E update(@ApiParam(value = "entity", required = true) @RequestBody @Valid E entity) {
        return service.update(entity);
    }

    @ApiOperation(value = "delete")
    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void delete(@ApiParam(value = "id", required = true) @PathVariable U id) {
        service.deleteById(id);
    }

    @ApiOperation(value = "Show a pageble list of all items")
    @RequestMapping(method = RequestMethod.GET, value = "/list")
    public Page<E> list(@RequestParam(value = "pageNumber", defaultValue = "0") Integer pageNumber,
            @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize,
            @RequestParam(value = "direction", defaultValue = "ASC") Sort.Direction direction,
            @RequestParam(value = "orderBy", defaultValue = "id") String orderBy) {
        return service.list(pageNumber, pageSize, direction, orderBy);
    }

    @ApiOperation(value = "Show a pageble list of a filter of items (like)")
    @RequestMapping(method = RequestMethod.GET, value = "/search")
    public Page<E> search(@ApiParam(value = "aluno", required = true) E entity,
            @RequestParam(value = "pageNumber", defaultValue = "0") Integer pageNumber,
            @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize,
            @RequestParam(value = "direction", defaultValue = "ASC") Sort.Direction direction,
            @RequestParam(value = "orderBy", defaultValue = "id") String orderBy) {
        return service.search(entity, pageNumber, pageSize, direction, orderBy);
    }

    @ApiOperation(value = "Sho a pageble list of a filter of items (exact)")
    @RequestMapping(method = RequestMethod.GET, value = "/find")
    public Page<E> find(@ApiParam(value = "aluno", required = true) E entity,
            @RequestParam(value = "pageNumber", defaultValue = "0") Integer pageNumber,
            @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize,
            @RequestParam(value = "direction", defaultValue = "ASC") Sort.Direction direction,
            @RequestParam(value = "orderBy", defaultValue = "id") String orderBy) {
        return service.find(entity, pageNumber, pageSize, direction, orderBy);
    }
}
