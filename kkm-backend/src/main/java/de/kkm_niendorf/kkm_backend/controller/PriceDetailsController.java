package de.kkm_niendorf.kkm_backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.kkm_niendorf.kkm_backend.PriceDetails;
import de.kkm_niendorf.kkm_backend.services.PriceDetailsService;
import lombok.RequiredArgsConstructor;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/kkm/pricedetails")
@RequiredArgsConstructor
public class PriceDetailsController {

    @Autowired
    private PriceDetailsService priceservice;

    @GetMapping
    public List<PriceDetails> getAllPriceDetails(){
        return priceservice.getAllPriceDetails();
    }

    @GetMapping("/{id}")
    public ResponseEntity<PriceDetails> getPriceDetailsById(@PathVariable String id){
        return priceservice.getPriceDetailsById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/addpricedetail")
    public PriceDetails createNewPriceDetailEntry(@RequestBody PriceDetails priceDetail){
        return priceservice.createNewPriceDetail(priceDetail);
    }

    @PutMapping("/updateprice/{id}")
    public ResponseEntity<PriceDetails> updateDetailOfExistingPriceDetails(@PathVariable String id, @RequestBody PriceDetails updatePriceDetails){
        try{
            return ResponseEntity.ok(priceservice.updateExistingPriceDetails(id, updatePriceDetails));
        }catch(RuntimeException exception){
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteAllPriceDetails(){
        priceservice.deleteAllPriceDetails();
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePriceDetailById(@PathVariable String id){
        priceservice.deletePriceDetailById(id);
        return ResponseEntity.noContent().build();
    }
    
}
