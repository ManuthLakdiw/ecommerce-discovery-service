package lk.ijse.orderservice.controller;

import lk.ijse.orderservice.config.RestTemplateConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author manuthlakdiv
 * @email manuthlakdiv2006.com
 * @project e-commerce
 * @github https://github.com/ManuthLakdiw
 */

@RestController
@RequestMapping("/api/v1/order")
public class OrderController {

    @Autowired
    RestTemplateConfig restTemplateConfig;

    @GetMapping("/get/order")
    public String getOrder(){
        return "Order Service is up and running -  Order is placed";
    }

    @GetMapping("/inventory")
    public ResponseEntity<String> callInventoryService(){
        String url = "http://inventory-service/api/v1/inventory/get/health";
        String response = restTemplateConfig.restTemplate().getForObject(url, String.class);
        return new ResponseEntity<>(
                response  == null ? "Fail" : "Success",
                HttpStatus.OK
        );
    }
}
