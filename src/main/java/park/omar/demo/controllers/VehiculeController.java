package park.omar.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import park.omar.demo.entities.Vehicule;
import park.omar.demo.services.DisponibilityService;
import park.omar.demo.services.VehiculeSrevice;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/vehicule")
public class VehiculeController {
    @Autowired
    DisponibilityService disponibilityService;
    @Autowired
    VehiculeSrevice vehiculeService ;
    @GetMapping("/available")
    public ResponseEntity<List<Vehicule>> getAvailableVehicule(@RequestParam("start") Date startDate, @RequestParam("end") Date endDate) {
        return new ResponseEntity<>(disponibilityService.getAvailableVehicule(startDate , endDate) , HttpStatus.OK)  ;
    }
    @PostMapping("/")
    public ResponseEntity<Vehicule> saveVehicule(@RequestBody Vehicule vehicule){
        return new ResponseEntity<>(vehiculeService.add(vehicule), HttpStatus.OK) ;
    }
    @GetMapping("/{id}")
    public ResponseEntity<Vehicule> getVehiculeById(@PathVariable String id ){
        return new ResponseEntity<>(vehiculeService.getById(id) , HttpStatus.OK) ;
    }

}

