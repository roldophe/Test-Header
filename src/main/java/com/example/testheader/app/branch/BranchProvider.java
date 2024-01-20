package com.example.testheader.app.branch;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.jdbc.SQL;

import java.util.Map;

public class BranchProvider {

    public String selectBranchByBranchIdSql(Map<String, Object> headers,String branchId) {

        final String language = (String) headers.get("language");

        System.out.println("language::>>"+language);
        return new SQL() {{
            SELECT("branch_id");
            SELECT("branch_code");
            SELECT("COALESCE(branch_title_" + language + ", branch_title) as branch_title");
            FROM("branches");
            WHERE("branch_id = #{branchId}");
        }}.toString();
    }
}

