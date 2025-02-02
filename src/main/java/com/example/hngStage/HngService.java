package com.example.hngStage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

@Service
public class HngService {

    public ResponseDto getInfo(){
        LocalDateTime date = LocalDateTime.now();
        String presentDate = formatUsingDateTimeFormatter(date);
        return new ResponseDto("prebstamar@gmail.com",presentDate,"https://github.com/Prebor97/hngStage0");
    }

    public static String formatUsingDateTimeFormatter(LocalDateTime localDateTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSX");
        return localDateTime.atOffset(ZoneOffset.UTC).format(formatter);
    }

}
