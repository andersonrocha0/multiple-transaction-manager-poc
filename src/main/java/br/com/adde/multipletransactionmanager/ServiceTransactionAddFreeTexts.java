package br.com.adde.multipletransactionmanager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ServiceTransactionAddFreeTexts {


    @Autowired
    private FreeTextsDAO freeTextsDAO;

    @Autowired
    private ServiceTransactionChangeStatus serviceTransactionChangeStatus;

    @Transactional
    public void addFreeText(String text) {

        serviceTransactionChangeStatus.addStatus("Started adding new values...");

        for (int i = 0; i < 10; i++) {
            freeTextsDAO.addText(text);
            if (i == 4) {
                serviceTransactionChangeStatus.addStatus("Almost there...");
            }
        }

        serviceTransactionChangeStatus.addStatus("Finished adding new values");

    }

}
