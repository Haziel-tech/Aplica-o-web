package Repository;

import Entity.Documento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentoRep extends JpaRepository<Documento, Integer> {

}
