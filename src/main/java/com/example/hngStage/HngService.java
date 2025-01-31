package com.example.hngStage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class HngService {

    @Autowired
    private DateUtil dateUtil;

    public ResponseDto getInfo(){
        LocalDateTime date = LocalDateTime.now();
        String presentDate = DateUtil.formatUsingDateTimeFormatter(date);
        return new ResponseDto("prebstamar@gmail.com",presentDate,"https://github.com/Prebor97/hngStage");
    }

}
