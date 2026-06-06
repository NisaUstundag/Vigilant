package com.vigilant.controller;

import com.vigilant.model.Transaction;
import com.vigilant.service.TransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/transactions")
@RequiredArgsConstructor
public class TransactionController {

    private final TransactionService transactionService;

    /**
     * Endpoint to receive and process a new transaction.
     * External systems (like Postman) will send POST requests here.
     *
     * @param transaction The transaction payload
     * @return The saved transaction with generated ID and PENDING status
     */
    @PostMapping
    public ResponseEntity<Transaction> createTransaction(@RequestBody Transaction transaction) {
        Transaction savedTransaction = transactionService.createTransaction(transaction);
        return ResponseEntity.ok(savedTransaction);
    }
}