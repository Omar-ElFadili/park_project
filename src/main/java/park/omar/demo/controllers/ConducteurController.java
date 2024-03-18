package park.omar.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import park.omar.demo.entities.Conducteur;
import park.omar.demo.services.ConducteurService;
import park.omar.demo.services.DisponibilityService;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/conductors")
public class ConducteurController {

    @Autowired
    ConducteurService conducteurService;
    @Autowired
    DisponibilityService disponibilityService;
    @GetMapping("/")
    public ResponseEntity<List<Conducteur>> getAll(){
        return  new ResponseEntity<>(conducteurService.getAll() , HttpStatus.OK
        ) ;
    }
    @GetMapping("/{id}")
    public ResponseEntity<Conducteur> getById(@PathVariable String id){
        return new ResponseEntity<>(conducteurService.getById(id) , HttpStatus.OK) ;
    }
    @PostMapping("/add")
    public ResponseEntity<Conducteur> save(@RequestBody Conducteur conductor) {
        return new ResponseEntity<>(conducteurService.add(conductor) , HttpStatus.OK) ;
    }
    @GetMapping("/available")
    public ResponseEntity<List<Conducteur>> getAvailableConductor(@RequestParam("start") LocalDate startDate, @RequestParam("end") LocalDate endDate ) {
        return new ResponseEntity<>(disponibilityService.getAvailableConducteur( startDate ,endDate) , HttpStatus.OK) ;
    }
    @GetMapping("/availableForVehicule")
    public ResponseEntity<List<Conducteur>> getAvailableForVehicule(@RequestParam("vehiculeId") String vehiculeId ,
                                                                    @RequestParam("startDate") LocalDate startDate ,
                                                                    @RequestParam("endDate") LocalDate endDate) {
        return new ResponseEntity<>(disponibilityService.getAvailableDriversForVehicle(vehiculeId , startDate , endDate) , HttpStatus.OK) ;
    }
}