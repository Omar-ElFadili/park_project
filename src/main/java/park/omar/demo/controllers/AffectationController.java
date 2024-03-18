package park.omar.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import park.omar.demo.entities.Affectation;
import park.omar.demo.services.AffectationService;

import java.util.List;

@RestController
@RequestMapping("/api/affectation")
public class AffectationController {
    @Autowired
    AffectationService affectationService ;
    @PostMapping("/")
    public ResponseEntity<Affectation> addVoyage(@RequestBody Affectation affectation ) {
        return new ResponseEntity<>(affectationService.add(affectation), HttpStatus.OK );
    }
    @GetMapping("/")
    public ResponseEntity<List<Affectation>> getAll(){
        return new ResponseEntity<>(affectationService.getAll() , HttpStatus.OK) ;
    }
}
