package Repository;

import Entity.Estudante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudanteRep extends JpaRepository<Estudante, Long> {}
