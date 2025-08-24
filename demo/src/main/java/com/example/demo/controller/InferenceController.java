// src/main/java/com/example/signglove/controller/InferenceController.java
package com.example.signglove.controller;

import com.example.signglove.dto.InferenceRequest;
import com.example.signglove.dto.InferenceResponse;
import com.example.signglove.service.InferenceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class InferenceController {

    private final InferenceService service;

    public InferenceController(InferenceService service) {
        this.service = service;
    }

    @PostMapping("/inference")
    public String receiveInference(@RequestBody InferenceRequest req) {
        service.saveResult(req);
        return "OK";
    }

    @GetMapping("/result")
    public InferenceResponse getLatestResult() {
        return service.getLatestResult();
    }

    @GetMapping("/history")
    public List<InferenceResponse> getHistory() {
        return service.getHistory();
    }
}
