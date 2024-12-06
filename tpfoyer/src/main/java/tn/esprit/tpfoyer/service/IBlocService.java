package tn.esprit.tpfoyer.service;

import tn.esprit.tpfoyer.entity.Bloc;

import java.util.List;

public interface IBlocService {
    // Create
    Bloc addBloc(Bloc bloc);

    // Read
    List<Bloc> getAllBlocs();

    // Update
    Bloc updateBloc(Bloc bloc);

    // Delete
    void deleteBloc(long id);

     Bloc getBlocById(long id);

    public Bloc affecterChambresABloc(List<Long> numChambre, long idBloc);

}
