package br.com.adde.multipletransactionmanager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ServiceTransactionChangeStatus {

    @Autowired
    private StatusDAO statusDAO;

    @Transactional
    public void addStatus(String status) {
        statusDAO.addStatus(status);

    }

}
