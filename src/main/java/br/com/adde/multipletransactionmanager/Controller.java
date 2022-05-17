package br.com.adde.multipletransactionmanager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/testing")
public class Controller {


    @Autowired
    ServiceAggregator serviceAggregator;

    @GetMapping
    public void test() {
        System.out.println("Testing");
        serviceAggregator.aggregate("Testing");
    }

}
