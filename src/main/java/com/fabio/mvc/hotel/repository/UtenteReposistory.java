package com.fabio.mvc.hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fabio.mvc.hotel.model.UtenteEntity;

@Repository
public interface UtenteReposistory extends JpaRepository<UtenteEntity, String>{

}
