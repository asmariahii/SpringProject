package tn.esprit.tpfoyer.service;

import tn.esprit.tpfoyer.entity.Chambre;
import tn.esprit.tpfoyer.entity.TypeChambre;

import java.util.List;

public interface IChambreService {

    // Create
    Chambre addChambre(Chambre chambre);

    // Read
    List<Chambre> getAllChambres();

    // Update
    Chambre updateChambre(Chambre chambre);

    // Delete
    void deleteChambre(long id);
    Chambre getChambreById(long id);

    public List<Chambre> getChambresParNomUniversite(String nomUniversite);
    public List<Chambre> getChambresParBlocEtType(long idBloc, TypeChambre typeC);

    void pourcentageChambreParTypeChambre();

    void nbPlacesDisponibleParChambreAnneeEnCours();
    //to do
    //reservation pour chambre avec nombre sup a entier donnee
    //List<Reservation> getReservationForChambreWithNumberGraterThan(Long number);
}
