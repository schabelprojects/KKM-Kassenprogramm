package de.kkm_niendorf.kkm_backend.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.kkm_niendorf.kkm_backend.PriceDetails;
import de.kkm_niendorf.kkm_backend.repositorys.PriceDetailsRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PriceDetailsService {
    
    @Autowired
    private PriceDetailsRepository pricerepository;

    public List<PriceDetails> getAllPriceDetails() {
        return pricerepository.findAll();
    }

    public Optional<PriceDetails> getPriceDetailsById(String id) {
        return pricerepository.findById(id);
    }

    public PriceDetails createNewPriceDetail(PriceDetails pricedetail) {
        return pricerepository.save(pricedetail);
    }

    public PriceDetails updateExistingPriceDetails(String id, PriceDetails updatedPriceDetails) {
        return pricerepository.findById(id).map(existingPriceDetails -> {
            existingPriceDetails.setSellernumber(updatedPriceDetails.getSellernumber());
            existingPriceDetails.setPrice(updatedPriceDetails.getPrice());
            return existingPriceDetails;
        }).map(pricerepository::save).orElseThrow(() -> new RuntimeException("Detail mit id " + id + " wurde nicht gefunden." ));
    }

    public void deleteAllPriceDetails(){
        pricerepository.deleteAll();
    }

    public void deletePriceDetailById(String id){
        pricerepository.deleteById(id);
    }
}
