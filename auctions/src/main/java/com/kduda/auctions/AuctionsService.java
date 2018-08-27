package com.kduda.auctions;

import org.springframework.stereotype.Service;

import java.util.UUID;


@Service
class AuctionsService {

    private final PaymentsClient payments;

    AuctionsService(PaymentsClient payments) {
        this.payments = payments;
    }

    String buyItem(){
        String id = UUID.randomUUID().toString();
        return payments.createPayment(id);
    }

    String getStatus(String id){
        return payments.getStatus(id);
    }
}
