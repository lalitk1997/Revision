package com.prospecta.assign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
public class APIController {
    // Rest Template is used to create applications that consume RESTful Web Services.
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/categories")
    public List<API> getCategories(@RequestParam String category) {
        // Creating URL
        String url = String.format("https://api.publicapis.org/entries?category=%s", category);
        // Saving API Response
        // getForEntity method retrieves resources from the given URI or URL templates
        ResponseEntity<Map> apiResponse = restTemplate.getForEntity(url, Map.class);
        List<API> entries = (List<API>) apiResponse.getBody().get("entries");
        return entries;
    }
}
