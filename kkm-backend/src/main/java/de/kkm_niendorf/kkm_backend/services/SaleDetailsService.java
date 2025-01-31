package de.kkm_niendorf.kkm_backend.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.kkm_niendorf.kkm_backend.SaleDetails;
import de.kkm_niendorf.kkm_backend.repositorys.SaleDetailsRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SaleDetailsService {
    
    @Autowired
    private SaleDetailsRepository salerepository;

    public List<SaleDetails> getAllSaleDetails(){
        return salerepository.findAll();
    }

    public Optional<SaleDetails> getAllSaleDetailsById(String id){
        return salerepository.findById(id);
    }

    public SaleDetails createNewSaleDetails(SaleDetails saleDetail){
        return salerepository.save(saleDetail);
    }

    public SaleDetails updateExistingSaleDetails(String id, SaleDetails updatedSaleDetails){
        return salerepository.findById(id).map(existingSaleDetail -> {
            existingSaleDetail.setSellernumber(updatedSaleDetails.getSellernumber());
            existingSaleDetail.setSummaryprice(updatedSaleDetails.getSummaryprice());
            return existingSaleDetail;
        }).map(salerepository::save).orElseThrow(() -> new RuntimeException("Detail mit id " + id + " wurde nicht gefunden."));
    }

    public void deleteAllSaleDetails(){
        salerepository.deleteAll();
    }

    public void deleteSaleDetailById(String id){
        salerepository.deleteById(id);
    }

}
