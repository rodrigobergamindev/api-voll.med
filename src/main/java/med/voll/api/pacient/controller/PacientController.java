package med.voll.api.pacient.controller;

import jakarta.validation.Valid;
import med.voll.api.pacient.dto.CreatePacientDTO;
import med.voll.api.pacient.entities.Pacient;
import med.voll.api.pacient.repository.PacientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pacients")
public class PacientController {

        @Autowired
        private PacientRepository repository;

        @PostMapping
        public void create(@RequestBody @Valid CreatePacientDTO data) {

            repository.save(new Pacient(data));
        }



}
