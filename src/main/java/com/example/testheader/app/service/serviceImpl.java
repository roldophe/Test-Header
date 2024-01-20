package com.example.testheader.app.service;

import com.example.testheader.app.branch.Branch;
import com.example.testheader.app.branch.BranchMapper;
import com.example.testheader.app.user.User;
import com.example.testheader.app.user.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class serviceImpl implements service {
    private final UserMapper userMapper;
    private final BranchMapper branchMapper;

//    @Override
//    public List<User> getUserDetail(Map<String, String> headers) {
//        List<User> users = userMapper.getUsers();
//        List<User> list = new ArrayList<>();
//        for (User user : users) {
//            Branch branch = branchMapper.selectBranchByBranchId(headers, user.getBranch().getBranchId());
//            user.setBranch(branch);
//            list.add(user);
//        }
//        return list;
//    }

    public List<User> getUserDetail(Map<String, Object> headers) {
        return userMapper.getUsers(headers);
    }
}

