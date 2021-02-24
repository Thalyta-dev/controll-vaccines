package br.com.zupApi.controllVaccines.service;

import br.com.zupApi.controllVaccines.entity.People;
import br.com.zupApi.controllVaccines.repository.PeopleRepository;
import br.com.zupApi.controllVaccines.dto.PeopleDTO;
import br.com.zupApi.controllVaccines.util.FormatPeople;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PeopleService {

    private PeopleRepository peopleRepository;
    private FormatPeople formatPeople;

    @Autowired
    public PeopleService(PeopleRepository peopleRepository, FormatPeople formatPeople) {
        this.peopleRepository = peopleRepository;
        this.formatPeople = formatPeople;
    }
     public PeopleDTO createPeople(PeopleDTO peopleDTO){
         People people = this.formatPeople.toEntity(peopleDTO);
        return this.formatPeople.toDTO(this.peopleRepository.save(people));
     }
}
