package com.example.testheader.app.service;

import com.example.testheader.app.user.User;

import java.util.List;
import java.util.Map;

public interface service {
    List<User> getUserDetail(Map<String, Object> headers);
}
