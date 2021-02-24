package br.com.zupApi.controllVaccines.dto;

import br.com.zupApi.controllVaccines.util.PeopleDATA;
import com.fasterxml.jackson.annotation.JsonFormat;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;


    public class VaccinesDTO {

        private Long id;

        @NotEmpty(message = "Vaccine name cannot be blank")
        private String nameVaccines;

        @NotNull(message = "Vaccine date cannot be blank")
        @JsonFormat(pattern = "yyyy-MM-dd" )
        private LocalDate vaccinesDate;

        @NotNull(message = "Inform the person being vaccinated")
        private PeopleDATA people;

        public VaccinesDTO(Long id, String nameVaccines, LocalDate vaccinesDay, PeopleDATA people) {
            this.id = id;
            this.nameVaccines = nameVaccines;
            this.vaccinesDate= vaccinesDay;
            this.people = people;
        }

        public VaccinesDTO() {}

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getNameVaccines() {
            return nameVaccines;
        }

        public void setNameVaccines(String nameVaccines) {
            this.nameVaccines = nameVaccines;
        }

        public LocalDate getVaccinesDate() {
            return vaccinesDate;
        }

        public void setVaccinesDate(LocalDate vaccinesDate) {
            this.vaccinesDate = vaccinesDate;
        }

        public PeopleDATA getPeople() {
            return people;
        }

        public void setPeople(PeopleDATA people) {
            this.people = people;
        }
    }


