package br.com.zupApi.controllVaccines.controller;

import br.com.zupApi.controllVaccines.dto.PeopleDTO;
import br.com.zupApi.controllVaccines.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController // transform todo retorno em json e as entradas em objeto java (Servico gerenciavel pelo Been)
@RequestMapping(value = "/api/1/people")

public class PeopleController {

    @Autowired //para conseguir fazer injeção e inversão de controle
    private PeopleService peopleService;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public PeopleDTO createPeople(@RequestBody @Valid PeopleDTO requestPeople){
        return  peopleService.createPeople(requestPeople);
    }

}
