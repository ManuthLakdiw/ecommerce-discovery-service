package lk.ijse.orderservice.controller;

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

    @GetMapping("/get/order")
    public String getOrder(){
        return "Order Service is up and running -  Order is placed";
    }
}
