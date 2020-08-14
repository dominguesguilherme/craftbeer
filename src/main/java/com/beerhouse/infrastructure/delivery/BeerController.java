package com.beerhouse.infrastructure.delivery;

import com.beerhouse.application.BeerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class BeerController {


    private final BeerService service;

    public BeerController(BeerService service) {
        this.service = service;
    }

    @PostMapping("/beers")
    public ResponseEntity<Object> create() {
        BeerService service = this.service;
        return null;
    }

    @PutMapping("/beers/{beer_id}")
    public ResponseEntity<Object> change(@PathVariable String beer_id) {
        return null;
    }

    @GetMapping("/beers/{beer_id}")
    public ResponseEntity<Object> find(@PathVariable String beer_id) {
        return null;
    }

    @GetMapping("/beers")
    public ResponseEntity<Object> fetchAll() {
        return null;
    }

    @DeleteMapping("/beers/{beer_id}")
    public ResponseEntity<Object> delete(@PathVariable String beer_id) {
        return null;
    }
}
