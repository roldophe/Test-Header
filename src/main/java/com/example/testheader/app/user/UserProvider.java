package com.example.testheader.app.user;

import org.apache.ibatis.jdbc.SQL;

import java.util.Map;

public class UserProvider {
    public String selectUsersSql() {
        return new SQL() {{
            SELECT("user_id");
            SELECT("username");
            SELECT("first_name");
            SELECT("last_name");
            SELECT("gender");
            SELECT("branch_id");
            FROM("users");
        }}.toString();
    }
}
