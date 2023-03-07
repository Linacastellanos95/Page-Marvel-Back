package com.page.marvel.Controller.Models.Repository.Repository;

import com.page.marvel.Controller.Models.Repository.Models.Personaje;
import org.springframework.data.repository.CrudRepository;

public interface PersonajeRepository  extends CrudRepository<Personaje, Integer> {
}
