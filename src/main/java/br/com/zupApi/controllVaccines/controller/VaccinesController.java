package br.com.zupApi.controllVaccines.controller;

import br.com.zupApi.controllVaccines.dto.VaccinesDTO;
import br.com.zupApi.controllVaccines.service.VaccinesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/api/1/vaccines")
public class VaccinesController {

    @Autowired
    private VaccinesService vaccinesService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public VaccinesDTO createVaccines(@RequestBody @Valid VaccinesDTO vaccinesDTO){
        return vaccinesService.createVaccines(vaccinesDTO);
    }

    @GetMapping
    public List<VaccinesDTO> findAll(){
        return vaccinesService.findAll();
    }



}
