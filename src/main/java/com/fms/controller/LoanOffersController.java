package com.fms.controller;

import com.fms.model.LoanOffersEntity;
import com.fms.repository.LoanOffersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/offers")
@CrossOrigin(origins = "*")
public class LoanOffersController{
        private final LoanOffersRepository repository;

        @Autowired
        public LoanOffersController(LoanOffersRepository repository) {
            this.repository = repository;
        }

        @GetMapping
        public ResponseEntity<List<LoanOffersEntity>> getAllEntries() {
            HttpHeaders headers = new HttpHeaders();
//            headers.add("Content-Type", "application/json");
//            headers.add("Access-Control-Allow-Origin", "*");
//            headers.add("Access-Control-Allow-Methods", "POST, GET, OPTIONS, PUT, DELETE, HEAD");
//            headers.add("Access-Control-Allow-Headers", "Authorization, X-PINGOTHER, Origin, X-Requested-With, Content-Type, Accept");
            List<LoanOffersEntity> entries = repository.findAll();
            return new ResponseEntity<>(entries, headers, HttpStatus.OK);
        }


}
