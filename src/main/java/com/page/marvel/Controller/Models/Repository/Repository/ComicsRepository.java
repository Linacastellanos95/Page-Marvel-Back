package com.page.marvel.Controller.Models.Repository.Repository;

import com.page.marvel.Controller.Models.Repository.Models.Comics;
import org.springframework.data.repository.CrudRepository;

public interface ComicsRepository extends CrudRepository<Comics, Integer> {
}
