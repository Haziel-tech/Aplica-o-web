package Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity



public class Documento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tipo;
    private String numero;
}
