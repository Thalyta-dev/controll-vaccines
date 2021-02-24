package br.com.zupApi.controllVaccines.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

    public class PeopleDTO {


        private Long id;

        @NotEmpty(message = "the name cannot be blank")
        private String name;

        @NotEmpty(message = "the cpf cannot be blank")
        @CPF(message = "the invalid cpf")
        private String cpf;

        @NotEmpty(message = "the invalid cpf")
        @Email(message = "Invalid e-mail address")
        private String email;

        @NotNull(message = "Birth date cannot be blank")
        @JsonFormat(pattern = "yyyy-MM-dd")
        private LocalDate birthDate;

        public PeopleDTO(Long id, String name, String cpf, String email, LocalDate birthDate) {
            this.id = id;
            this.name = name;
            this.cpf = cpf;
            this.email = email;
            this.birthDate = birthDate;
        }

        public PeopleDTO(){}

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCpf() {
            return cpf;
        }

        public void setCpf(String cpf) {
            this.cpf = cpf;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public LocalDate getBirthDate() {
            return birthDate;
        }

        public void setBirthDate(LocalDate birthDate) {
            this.birthDate = birthDate;
        }
    }

