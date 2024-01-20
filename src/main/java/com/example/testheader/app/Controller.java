package com.example.testheader.app;

import com.example.testheader.app.service.service;
import com.example.testheader.app.user.User;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/user")
public class Controller {
    private final service service;

    @PostMapping
    public PayloadApi<?> getUsers() {
        Map<String, Object> headers = new HashMap<>();
        headers.put("language", "kh");

        List<User> users = service.getUserDetail(headers);

        return PayloadApi.builder()
                .success(true)
                .code(200)
                .message("INFORMATION_DETAIL")
                .error(null)
                .payload(users)
                .build();
    }

}
