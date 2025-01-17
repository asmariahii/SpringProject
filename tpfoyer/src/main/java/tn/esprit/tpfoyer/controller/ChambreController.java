package tn.esprit.tpfoyer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entity.Chambre;
import tn.esprit.tpfoyer.entity.TypeChambre;
import tn.esprit.tpfoyer.service.IChambreService;

import java.util.List;

@RestController
@RequestMapping("/Chambres")
public class ChambreController {
    @Autowired
    IChambreService chambreService;

  @PostMapping("add") 
  public Chambre addChambre(@RequestBody Chambre chambre) {
      return chambreService.addChambre(chambre);
  }

    @GetMapping("getAll")
    public List<Chambre> getAllChambres() {
        return chambreService.getAllChambres();
    }

    @PutMapping("update")
    public Chambre updateChambre(@RequestBody Chambre chambre) {
        return chambreService.updateChambre(chambre);
    }


    @DeleteMapping("/delete/{id}")
    public void deleteChambre(@PathVariable long id) {
        chambreService.deleteChambre(id);
    }

    @GetMapping("/{id}")
    public Chambre getChambreById(@PathVariable long id) {
        return chambreService.getChambreById(id);
    }

    @GetMapping("/parUniversite/{nomUniversite}")
    public List<Chambre> getChambresParNomUniversite(@PathVariable String nomUniversite) {
        return chambreService.getChambresParNomUniversite(nomUniversite);
    }

    @GetMapping("/parBlocEtType/{idBloc}/{typeC}")
    public List<Chambre> getChambresParBlocEtType(@PathVariable long idBloc, @PathVariable TypeChambre typeC) {
        return chambreService.getChambresParBlocEtType(idBloc, typeC);
    }
    @GetMapping("/calculatePercentage")
    public ResponseEntity<String> calculatePercentage() {
        chambreService.pourcentageChambreParTypeChambre();
        return ResponseEntity.ok("Pourcentage calculation triggered.");
    }

    @GetMapping("/placesDisponibles")
    public ResponseEntity<Void> getNbPlacesDisponibles() {
        chambreService.nbPlacesDisponibleParChambreAnneeEnCours();
        return ResponseEntity.ok().build(); // Respond with a 200 OK status
    }
}
