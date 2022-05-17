package br.com.adde.multipletransactionmanager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceAggregator {


    @Autowired
    private ServiceTransactionAddFreeTexts serviceTransactionAddFreeTexts;

    @Autowired
    private ServiceTransactionChangeStatus serviceTransactionChangeStatus;

    public void aggregate(String text) {
        serviceTransactionAddFreeTexts.addFreeText(text);
    }

}
