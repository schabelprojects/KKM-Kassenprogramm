package de.kkm_niendorf.kkm_backend.repositorys;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import de.kkm_niendorf.kkm_backend.PriceDetails;

@Repository
public interface PriceDetailsRepository extends MongoRepository<PriceDetails, String> {
    
}
