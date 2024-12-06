package tn.esprit.tpfoyer.service;

import tn.esprit.tpfoyer.entity.Foyer;

import java.util.List;

public interface IFoyerService {
     Foyer addFoyer(Foyer foyer);

     List<Foyer> getAllFoyer();

     Foyer getFoyerById(long id);

     Foyer updateFoyer(Foyer foyer);

     void deleteFoyer(long id);
     public Foyer ajouterFoyerEtAffecterAUniversite(Foyer foyer, long idUniversite);
}
