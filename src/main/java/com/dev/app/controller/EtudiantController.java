package com.dev.app.controller;

import com.dev.app.metier.EtudiantService;
import com.dev.app.model.Etudiant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EtudiantController {

   @Autowired
   EtudiantService etudiantService;

   @PostMapping("/etudiant")
    public Etudiant save(@RequestBody Etudiant etudiant){
        return etudiantService.saveEtudiant(etudiant);
    }

    @GetMapping("/etudiants")
    public List<Etudiant>listEtudiant(){
       return etudiantService.findAllEtudiant();
    }
}
