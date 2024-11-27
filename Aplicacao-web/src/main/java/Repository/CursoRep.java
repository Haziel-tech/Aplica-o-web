package Repository;

import Entity.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRep extends JpaRepository<Curso, Long> {}
