package application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframewgork.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import application.repository.CategoriaRepository;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {
    @Autowired
    private CategoriaRepository categoriaRepo;
    @GetMappin
    public Interable <categorias> getAll() {
        return categoriaRepo.findAll();
    }
    
}