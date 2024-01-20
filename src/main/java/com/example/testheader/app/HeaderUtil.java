package com.example.testheader.app;


import com.example.testheader.HeaderResponse;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;

import java.util.Objects;

@Component
public class HeaderUtil {

    public static void setHeader(HttpServletRequest request){

        String language = "";
        String timezone = "";

        if(request != null){
            language = request.getHeader("Accept-Language") != null ? "_" + request.getHeader("Accept-Language") : "";
            timezone = request.getHeader("timezone") != null ? request.getHeader("timezone") : "Etc/UTC";
        }

        if(Objects.equals(timezone, "")){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "TIMEZONE_REQUIRED");
        }

        HeaderResponse.language = language;
        HeaderResponse.request = request;
        HeaderResponse.timezone = timezone;

    }
}