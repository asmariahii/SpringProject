package tn.esprit.tpfoyer.service;

import tn.esprit.tpfoyer.entity.Etudiant;

import java.util.List;

public interface IEtudiantService {
    // Create
    Etudiant addEtudiant(Etudiant etudiant);

    // Read
    List<Etudiant> getAllEtudiants();

    // Update
    Etudiant updateEtudiant(Etudiant etudiant);

    // Delete
    void deleteEtudiant(long id);
    Etudiant getEtudiantById(long id);
}
