package com.example.hngStage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class HngService {

    @Autowired
    private DateUtil dateUtil;

    public ResponseDto getInfo(){
        ResponseDto responseDto = new ResponseDto();
        LocalDateTime date = LocalDateTime.now();
        String presentDate = dateUtil.formatUsingDateTimeFormatter(date);
        responseDto.setEmail("prebstamar@gmail.com");
        responseDto.setCurrent_datetime(presentDate);
        responseDto.setGithub_url("https://github.com/Prebor97/hngStage0");
        return responseDto;
    }

}
