package com.example.testheader;

import jakarta.servlet.http.HttpServletRequest;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class HeaderResponse {
    public static HttpServletRequest request;
    public static String language;
    public static String timezone;
}
