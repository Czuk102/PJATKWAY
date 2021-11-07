package com.example.PJATKWAY;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/sandwich")
public class SandwichRestController {
    private final SandwichService sandwichService;

    public SandwichRestController(SandwichService sandwichService) {
        this.sandwichService = sandwichService;
    }

    @GetMapping("/example")
    public ResponseEntity<Sandwich> getExampleSandwich(){

     return ResponseEntity.ok(sandwichService.prepareSandwich());
    }

    @GetMapping("/rich")
    public ResponseEntity<Sandwich> getRichSandwich(){

        return ResponseEntity.ok(sandwichService.prepareSandwich("Rich"));

    }


    @GetMapping("/null")
    protected ResponseEntity<Sandwich> NullSandwich(){
        List<Ingredient> ingrediets = new ArrayList<>();


        Sandwich poor = new Sandwich();
        return ResponseEntity.ok(poor);
    }

}