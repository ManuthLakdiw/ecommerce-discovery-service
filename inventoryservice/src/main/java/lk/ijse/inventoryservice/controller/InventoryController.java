package lk.ijse.inventoryservice.controller;

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
@RequestMapping("/api/v1/inventory")
public class InventoryController {

    @GetMapping("/get/health")
    public ResponseEntity<String> checkHealth(){
        return ResponseEntity.ok("Inventory Service is up and running - Good Health");
    }
}
