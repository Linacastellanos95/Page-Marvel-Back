package com.page.marvel.Controller.Models.Repository.Controller;

import com.page.marvel.Controller.Models.Repository.Models.Comics;
import com.page.marvel.Controller.Models.Repository.Models.Personaje;
import com.page.marvel.Controller.Models.Repository.Models.Registro;
import com.page.marvel.Controller.Models.Repository.Repository.ComicsRepository;
import com.page.marvel.Controller.Models.Repository.Repository.PersonajeRepository;
import com.page.marvel.Controller.Models.Repository.Repository.RegistroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "/page/marvel/")
public class MainController {

    @Autowired
    private RegistroRepository registroRepository;
    @Autowired
    private PersonajeRepository personajeRepository;
    @Autowired
    private ComicsRepository comicsRepository;

// CRUD Registro

@GetMapping(path = "/registro/all")
public @ResponseBody
Iterable<Registro> getAllRegistro() {
    return registroRepository.findAll();
}

    @GetMapping(path = "/registro/{id_registro}")
    public @ResponseBody
    Optional<Registro> getRegistroById(@PathVariable("id_registro") int id_r) {
        return registroRepository.findById(id_r);
    }

    @PostMapping(path = "/registro/create",
            consumes = "application/json", produces = "application/json")
    public Registro createRegistro(@RequestBody Registro newRegistro) {
        return registroRepository.save(newRegistro);
    }


    @PutMapping(path = "/registro/update",
            consumes = "application/json", produces = "application/json")
    public Registro updateRegistro(@RequestBody Registro updatedRegistro) {
        return registroRepository.save(updatedRegistro);
    }

    @DeleteMapping(path = "/registro/delete/{id_registro}")
    public @ResponseBody
    Iterable<Registro> deleteRegistroById(@PathVariable("id_registro") int id_r) {
        try {
            registroRepository.deleteById(id_r);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            return registroRepository.findAll();
        }

    }

    // CRUD Personaje

    @GetMapping(path = "/personaje/all")
    public @ResponseBody
    Iterable<Personaje> getAllPersonaje() {
        return personajeRepository.findAll();
    }

    @GetMapping(path = "/personaje/{id_personaje}")
    public @ResponseBody
    Optional<Personaje> getPersonajeById(@PathVariable("id_personaje") int id_p) {
        return personajeRepository.findById(id_p);
    }

    @PostMapping(path = "/personaje/create",
            consumes = "application/json", produces = "application/json")
    public Personaje createPersonaje(@RequestBody Personaje newPersonaje) {
        return personajeRepository.save(newPersonaje);
    }


    @PutMapping(path = "/personaje/update",
            consumes = "application/json", produces = "application/json")
    public Personaje updatePersonaje(@RequestBody Personaje updatedPersonaje) {
        return personajeRepository.save(updatedPersonaje);
    }

    @DeleteMapping(path = "/personaje/delete/{id_personaje}")
    public @ResponseBody
    Iterable<Personaje> deletePersonajeById(@PathVariable("id_personaje") int id_p) {
        try {
            personajeRepository.deleteById(id_p);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            return personajeRepository.findAll();
        }

    }

    // CRUD Comics

    @GetMapping(path = "/comics/all")
    public @ResponseBody
    Iterable<Comics> getAllComics() {
        return comicsRepository.findAll();
    }

    @GetMapping(path = "/comics/{id_comics}")
    public @ResponseBody
    Optional<Comics> getComicsById(@PathVariable("id_comics") int id_c) {
        return comicsRepository.findById(id_c);
    }

    @PostMapping(path = "/comics/create",
            consumes = "application/json", produces = "application/json")
    public Comics createComics(@RequestBody Comics newComics) {
        return comicsRepository.save(newComics);
    }

    @PutMapping(path = "/comics/update",
            consumes = "application/json", produces = "application/json")
    public Comics updateComics(@RequestBody Comics updatedComics) {
        return comicsRepository.save(updatedComics);
    }

    @DeleteMapping(path = "/comics/delete/{id_comics}")
    public @ResponseBody
    Iterable<Comics> deleteComicsById(@PathVariable("id_comics") int id_c) {
        try {
            comicsRepository.deleteById(id_c);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            return comicsRepository.findAll();
        }

    }
}
