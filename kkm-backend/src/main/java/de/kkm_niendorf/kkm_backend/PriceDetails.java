package de.kkm_niendorf.kkm_backend;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "kkm_summary_db")
public class PriceDetails {

    @Id
    private String id;
    private String sellernumber;
    private Integer price;
    
}
