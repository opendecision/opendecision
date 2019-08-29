package com.opendecision.id.web;

import com.opendecision.id.service.IdGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IdGeneratorController {

    @Autowired
    private IdGeneratorService idGenerator;

    @GetMapping("/sid")
    public ResponseEntity simpleId() {
        return ResponseEntity.ok(idGenerator.simpleId());
    }

    @GetMapping("/objectId")
    public ResponseEntity objectId() {
        return ResponseEntity.ok(idGenerator.objectId());
    }
}
