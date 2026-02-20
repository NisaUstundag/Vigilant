package com.vigilant.service;
import com.vigilant.model.Transaction;
import com.vigilant.repository.TransactionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class TransactionService {

    private final TransactionRepository repository;

    public Transaction createTransaction(Transaction transaction) {
        // İşlem zamanını şu an olarak ayarla
        transaction.setTimestamp(LocalDateTime.now());
        // İlk başta durumu "BEKLEMEDE" yap
        transaction.setStatus("PENDING");
        // Veritabanına kaydet
        return repository.save(transaction);
    }
}