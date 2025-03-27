package desafio.api.springboot.service;

import java.time.OffsetDateTime;
import java.util.DoubleSummaryStatistics;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

import org.springframework.stereotype.Service;

import desafio.api.springboot.model.Transaction;

@Service
public class TransactionService {
    
    //colection que se auto gerencia, já que no dedafio não podia usar banco de dados

    private final Queue<Transaction> transactions = new ConcurrentLinkedQueue<>();

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public void clearTransactions(){
        transactions.clear();
    }

   public DoubleSummaryStatistics getStatistics() {
        OffsetDateTime now = OffsetDateTime.now();
        return transactions.stream()
                .filter(t->t.getDataHora().isAfter(now.minusSeconds(60))) //filtra as trasações dos ultimos 60 segundos
                .mapToDouble(Transaction::getValor)
                .summaryStatistics();
    } // getStatistics

}
