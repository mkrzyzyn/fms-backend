package com.fms.controller;

import com.fms.model.LoanOffersEntity;
import com.fms.repository.LoanOffersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/offers")
public class LoanOffersController{
        private final LoanOffersRepository repository;

        @Autowired
        public LoanOffersController(LoanOffersRepository repository) {
            this.repository = repository;
        }

        @GetMapping
        public ResponseEntity<List<LoanOffersEntity>> getAllEntries() {
            List<LoanOffersEntity> entries = repository.findAll();
            return ResponseEntity.ok(entries);
        }


}
