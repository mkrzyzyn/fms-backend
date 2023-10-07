package com.fms.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "loan_offers")
public class LoanOffersEntity {
    @Id
    @JsonProperty
    private String provider;
    @JsonProperty
    private double interest;
    @JsonProperty
    private double fee;

}
