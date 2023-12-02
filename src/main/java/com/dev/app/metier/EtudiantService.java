package com.dev.app.metier;

import com.dev.app.model.Etudiant;
import com.dev.app.repository.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EtudiantService {

    @Autowired
    EtudiantRepository etudiantRepository;

    public Etudiant saveEtudiant(Etudiant etudiant){
       return etudiantRepository.save(etudiant);
    }

    public List<Etudiant> findAllEtudiant(){
        return etudiantRepository.findAll();
    }

}
