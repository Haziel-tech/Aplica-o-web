package Controller;

import Entity.Documento;
import Repository.DocumentoRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/documentos")
public class DocumentoController {

    @Autowired
    private DocumentoRep documentoRepository;

    @GetMapping
    public List<Documento> listar() {
        return documentoRepository.findAll();
    }

    @PostMapping
    public Documento adicionar(@RequestBody Documento documento) {
        return documentoRepository.save(documento);
    }

    @DeleteMapping("/{id}")
    public void remover(@PathVariable Long id) {
        documentoRepository.deleteById(Math.toIntExact(id));
    }
}