package med.voll.api.pacient;

import med.voll.api.pacient.dto.CreatePacientDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class PacientController {

    @RestController
    @RequestMapping("pacientes")
    public class PacienteController {

        @PostMapping
        public void cadastrar(@RequestBody CreatePacientDTO data) {
            System.out.println("data received: " + data);
        }

    }

}
