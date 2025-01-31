package com.example.hngStage;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:8080", maxAge = 3600)
@RestController
@RequestMapping("/api/v1/getInfo")
@RequiredArgsConstructor
public class HngController {

    @Autowired
    private HngService service;

    @GetMapping("/")
    public ResponseEntity<ResponseDto> getInfo(){
        ResponseDto responseDto = new ResponseDto();
        responseDto = service.getInfo();
        return ResponseEntity.ok(responseDto);
    }
}
