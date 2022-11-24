package com.example.demo.controller.rest;

import com.example.demo.entity.TestEntity;
import com.example.demo.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/test")
public class TestResource {
    @Autowired
    TestService testService;

    @GetMapping("/suggest/industry")
    public ResponseEntity<List<TestEntity>> getIndustryStaticSuggestions() {
        List<TestEntity> results = testService.getIndustryList();
        HttpHeaders headers = new HttpHeaders();
        headers.add(HttpHeaders.CACHE_CONTROL, "no-cache");

        return ResponseEntity.ok().headers(headers).body(results);
    }
}
