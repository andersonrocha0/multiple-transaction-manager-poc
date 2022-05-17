package br.com.adde.multipletransactionmanager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/testing")
public class Controller {


    @Autowired
    private ServiceTransactionAddFreeTexts serviceTransactionAddFreeTexts;

    @GetMapping
    public void test() {
        System.out.println("Testing");
        serviceTransactionAddFreeTexts.addFreeText("Testing");
    }

}
