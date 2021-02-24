package br.com.zupApi.controllVaccines.util;

import br.com.zupApi.controllVaccines.entity.People;
import br.com.zupApi.controllVaccines.dto.PeopleDTO;
import org.springframework.stereotype.Component;

// nesta classe, irei fazer dois metódos um para transformar os dados  para fazer a requisição e mandar para o banco de dados
// E outro para dar a resposta para o cliente

@Component // transforma em serviço been
public class FormatPeople {

    public People toEntity(PeopleDTO requestPeople){

        People people = new People();
        if(requestPeople != null) {
            people.setName(requestPeople.getName());
            people.setCpf(requestPeople.getCpf());
            people.setEmail(requestPeople.getEmail());
            people.setBirthDate(requestPeople.getBirthDate());
        }
        return  people;
    }

    public PeopleDTO toDTO(People people){

        PeopleDTO requestPeople = new PeopleDTO();
        if(people != null) {
            requestPeople.setId(people.getId());
            requestPeople.setName(people.getName());
            requestPeople.setCpf(people.getCpf());
            requestPeople.setEmail(people.getEmail());
            requestPeople.setBirthDate(people.getBirthDate());


        }
        return  requestPeople;
    }

    public PeopleDATA toDATA(People people){

        PeopleDATA peopleDATA = new PeopleDATA();
        if(people != null) {
            peopleDATA.setId(people.getId());
            peopleDATA.setName(people.getName());

        }
        return peopleDATA;
    }

    public People dataToPeople(PeopleDATA peopleDATA){

        People people = new People();
        if(peopleDATA != null) {
            people.setId(peopleDATA.getId());
        }
        return  people;
    }
}
