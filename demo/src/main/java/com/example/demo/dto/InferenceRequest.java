// src/main/java/com/example/signglove/dto/InferenceRequest.java
package com.example.signglove.dto;

import lombok.Data;

@Data
public class InferenceRequest {
    private String predictedClass;
    private int predictedClassIdx;
    private double confidence;
    private String timestamp;

    private double yaw;
    private double pitch;
    private double roll;
    private int flex1;
    private int flex2;
    private int flex3;
    private int flex4;
    private int flex5;
}
