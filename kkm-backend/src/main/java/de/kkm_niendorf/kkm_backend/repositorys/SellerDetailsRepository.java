package de.kkm_niendorf.kkm_backend.repositorys;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import de.kkm_niendorf.kkm_backend.SellerDetails;

@Repository
public interface SellerDetailsRepository extends MongoRepository<SellerDetails, String>{
    
}
