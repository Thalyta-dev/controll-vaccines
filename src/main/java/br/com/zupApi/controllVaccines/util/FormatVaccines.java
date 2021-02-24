package br.com.zupApi.controllVaccines.util;

import br.com.zupApi.controllVaccines.entity.People;
import br.com.zupApi.controllVaccines.entity.Vaccines;
import br.com.zupApi.controllVaccines.dto.VaccinesDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class FormatVaccines {
    @Autowired
    private FormatPeople formatPeople;

    public Vaccines toEntity(VaccinesDTO vaccinesDTO){

        Vaccines vaccines = new Vaccines();

        if(vaccinesDTO != null) {

            vaccines.setNameVaccines(vaccinesDTO.getNameVaccines());
            vaccines.setVaccinesDate(vaccinesDTO.getVaccinesDate());
            People people = formatPeople.dataToPeople(vaccinesDTO.getPeople());
            vaccines.setPeople(people);
        }
        return  vaccines;
    }

    public VaccinesDTO toDTO(Vaccines vaccines){

        VaccinesDTO vaccinesDTO = new VaccinesDTO();

        if(vaccines!= null) {

            vaccinesDTO.setId(vaccines.getId());
            vaccinesDTO.setNameVaccines(vaccines.getNameVaccines());
            vaccinesDTO.setVaccinesDate(vaccines.getVaccinesDate());
            PeopleDATA people = formatPeople.toDATA(vaccines.getPeople());
            vaccinesDTO.setPeople(people);
        }
        return vaccinesDTO;
    }

}
