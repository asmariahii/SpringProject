package tn.esprit.tpfoyer.service;
import tn.esprit.tpfoyer.entity.Reservation;

import java.util.List;

public interface IReservationService {
    Reservation addReservation(Reservation reservation);
    List<Reservation> getAllReservations();
    Reservation getReservationById(long id);
    void deleteReservation(long id);
    Reservation updateReservation(Reservation reservation);
    public Reservation ajouterReservation(long idBloc, long cinEtudiant);
}
