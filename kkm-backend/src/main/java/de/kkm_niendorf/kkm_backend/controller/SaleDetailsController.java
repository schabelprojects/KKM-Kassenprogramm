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

import de.kkm_niendorf.kkm_backend.SaleDetails;
import de.kkm_niendorf.kkm_backend.services.SaleDetailsService;
import lombok.RequiredArgsConstructor;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/kkm/saledetails")
@RequiredArgsConstructor
public class SaleDetailsController {
 
    @Autowired
    private SaleDetailsService saleservice;

    @GetMapping
    public List<SaleDetails> getAllSaleDetails(){
        return saleservice.getAllSaleDetails();
    }

    @GetMapping("/{id}")
    public ResponseEntity<SaleDetails> getSaleDetailById(@PathVariable String id){
        return saleservice.getAllSaleDetailsById(id).map(ResponseEntity::ok).orElse(ResponseEntity.noContent().build());
    }

    @PostMapping("/addsaledetails")
    public SaleDetails createNewSaleDetailEntry(@RequestBody SaleDetails saledetail){
        return saleservice.createNewSaleDetails(saledetail);
    }

    @PutMapping("/updatesaledetail/{id}")
    public ResponseEntity<SaleDetails> updateDetailOfSaleDetailEntry(@PathVariable String id, @RequestBody SaleDetails saledetail){
        try{
            return ResponseEntity.ok(saleservice.updateExistingSaleDetails(id, saledetail));
        }catch(RuntimeException exception){
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteAllSaleDetails(){
        saleservice.deleteAllSaleDetails();
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSaleDetailsById(@PathVariable String id){
        saleservice.deleteSaleDetailById(id);
        return ResponseEntity.noContent().build();
    }
    
}
