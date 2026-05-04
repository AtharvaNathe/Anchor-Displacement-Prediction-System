package com.predator.Anchor.Prediction;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class PredictionController {

    @PostMapping("/predict")
    public Map<String, Object> predict(@RequestBody Map<String, Object> input) {

        String pythonAPI = "http://127.0.0.1:5000/predict";

        RestTemplate restTemplate = new RestTemplate();

        Map response = restTemplate.postForObject(pythonAPI, input, Map.class);

        return response;
    }
}