package br.com.zupApi.controllVaccines.entity;

import org.springframework.data.repository.cdi.Eager;

import javax.persistence.*;
import java.time.LocalDate;

@Entity(name = "vaccines")
public class Vaccines {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nameVaccines;

    @Column(nullable = false)
    private LocalDate vaccinesDate;

    @JoinColumn(nullable = false, name = "people_id")
    @ManyToOne(targetEntity = People.class,fetch = FetchType.EAGER)
    private People people;

    public Vaccines(Long id, String nameVaccines, LocalDate vaccinesDay, People people) {
        this.id = id;
        this.nameVaccines = nameVaccines;
        this.vaccinesDate = vaccinesDay;
        this.people = people;
    }

    public Vaccines() {}

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

    public People getPeople() {
        return people;
    }

    public void setPeople(People people) {
        this.people = people;
    }
}
