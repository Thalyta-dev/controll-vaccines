package br.com.zupApi.controllVaccines.repository;

import br.com.zupApi.controllVaccines.entity.People;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeopleRepository extends JpaRepository<People, Long> {}
