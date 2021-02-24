package br.com.zupApi.controllVaccines.service;

import br.com.zupApi.controllVaccines.entity.Vaccines;
import br.com.zupApi.controllVaccines.repository.VaccinesRepository;
import br.com.zupApi.controllVaccines.dto.VaccinesDTO;
import br.com.zupApi.controllVaccines.util.FormatVaccines;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class VaccinesService {
    private FormatVaccines formatVaccines;
    private VaccinesRepository vaccinesRepository;

    @Autowired
    public VaccinesService(FormatVaccines formatVaccines, VaccinesRepository vaccinesRepository) {
        this.formatVaccines = formatVaccines;
        this.vaccinesRepository = vaccinesRepository;
    }


    public VaccinesDTO createVaccines(VaccinesDTO vaccinesDTO) {
        Vaccines vaccines =  formatVaccines.toEntity(vaccinesDTO);
        return  formatVaccines.toDTO(vaccinesRepository.save(vaccines));
    }

    public List<VaccinesDTO> findAll(){
        return vaccinesRepository.findAll().stream().map(formatVaccines::toDTO).collect(Collectors.toList());
    }
}
