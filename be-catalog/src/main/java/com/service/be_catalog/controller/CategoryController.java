package com.service.be_catalog.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/category")
public class CategoryController {



        @GetMapping(value = "/test")
        public ResponseEntity<Object> doTest() {
            return ResponseEntity.ok("Success Test");
        }
}
