package tn.esprit.tpfoyer.service;

import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import tn.esprit.tpfoyer.entity.Foyer;
import tn.esprit.tpfoyer.entity.Universite;
import tn.esprit.tpfoyer.repository.FoyerRepository;
import tn.esprit.tpfoyer.repository.UniversiteRepository;

import java.util.List;

@Repository
public class FoyerService implements IFoyerService{
    @Autowired
    FoyerRepository foyerRepository;
    @Override
    public Foyer addFoyer(Foyer foyer) {
        return foyerRepository.save(foyer);
    }

    @Override
    public List<Foyer> getAllFoyer() {
        return foyerRepository.findAll();
    }


    @Override
    public Foyer updateFoyer(Foyer foyer) {
        return foyerRepository.save(foyer);
    }

    @Override
    public void deleteFoyer(long id) {
        foyerRepository.deleteById(id);
    }

    @Override
    public Foyer getFoyerById(long id) {
        return foyerRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("foyer not found with id: " + id));
    }
    @Autowired
    private UniversiteRepository universiteRepository;

    public Foyer ajouterFoyerEtAffecterAUniversite(Foyer foyer, long idUniversite) {
        // Récupérer l'Université par son ID
        Universite universite = universiteRepository.findById(idUniversite)
                .orElseThrow(() ->  new RuntimeException("Université non trouvée avec l'ID : " + idUniversite));

        // Associer le foyer à l'Université
        universite.setFoyer(foyer);
        // Ajouter le foyer avec ses blocs associés (cascade = ALL pour que les blocs soient aussi ajoutés)
        Foyer savedFoyer = foyerRepository.save(foyer);

        return savedFoyer;
    }
}
