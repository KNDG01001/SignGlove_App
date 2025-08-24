// src/main/java/com/example/signglove/service/InferenceService.java
package com.example.signglove.service;

import com.example.signglove.dto.InferenceRequest;
import com.example.signglove.dto.InferenceResponse;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class InferenceService {

    private InferenceResponse latestResult;
    private final List<InferenceResponse> history = new LinkedList<>();

    public void saveResult(InferenceRequest req) {
        InferenceResponse res = new InferenceResponse(
                req.getPredictedClass(),
                req.getConfidence(),
                req.getTimestamp()
        );
        this.latestResult = res;
        history.add(res);

        if (history.size() > 100) {
            history.remove(0);
        }
    }

    public InferenceResponse getLatestResult() {
        return latestResult;
    }

    public List<InferenceResponse> getHistory() {
        return history;
    }
}
