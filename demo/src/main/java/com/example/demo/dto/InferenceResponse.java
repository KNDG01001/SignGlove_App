// src/main/java/com/example/signglove/dto/InferenceResponse.java
package com.example.signglove.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class InferenceResponse {
    private String predictedClass;
    private double confidence;
    private String timestamp;
}
