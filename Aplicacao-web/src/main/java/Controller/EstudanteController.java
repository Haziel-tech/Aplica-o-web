package Controller;

import Entity.Estudante;
import Repository.EstudanteRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estudantes")
public class EstudanteController {

    @Autowired
    private EstudanteRep estudanteRepository;

    @GetMapping
    public List<Estudante> listar() {
        return estudanteRepository.findAll();
    }

    @PostMapping
    public Estudante adicionar(@RequestBody Estudante estudante) {
        return estudanteRepository.save(estudante);
    }

    @DeleteMapping("/{id}")
    public void remover(@PathVariable Long id) {
        estudanteRepository.deleteById(id);
    }
}
