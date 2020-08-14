package com.beerhouse.infrastructure.delivery;

import com.beerhouse.application.SystemOk;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class HealthCheckController {

    @GetMapping("/healthcheck")
    @ResponseBody
    public ResponseEntity<SystemOk> check() {
        try {
            SystemOk ok = new SystemOk("OK", new Date());
            return new ResponseEntity<SystemOk>((ok), HttpStatus.OK);
        } catch (Exception ex) {
            return ResponseEntity.ok().build();
        }
    }
}

