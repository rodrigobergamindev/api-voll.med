package med.voll.api.pacient.repository;

import med.voll.api.pacient.entities.Pacient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacientRepository extends JpaRepository<Pacient, Long> {

}
