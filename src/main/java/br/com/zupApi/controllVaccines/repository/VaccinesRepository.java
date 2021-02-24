package br.com.zupApi.controllVaccines.repository;

import br.com.zupApi.controllVaccines.entity.Vaccines;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VaccinesRepository extends JpaRepository<Vaccines, Long> {}
