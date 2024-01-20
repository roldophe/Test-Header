package com.example.testheader.app.branch;

import org.apache.ibatis.annotations.*;
import java.util.Map;

@Mapper
public interface BranchMapper {
//    @SelectProvider(value = BranchProvider.class, method = "selectBranchByBranchIdSql")
//    @Results(id = "branchResultMap", value = {
//            @Result(property = "branchId", column = "branch_id"),
//            @Result(property = "branchCode", column = "branch_code"),
//            @Result(property = "branchTitle", column = "branch_title")
//    })
//    Branch selectBranchByBranchId(@Param("headers") Map<String, String> headers, @Param("branch_id") String branchId);

    @SelectProvider(type = BranchProvider.class, method = "selectBranchByBranchIdSql")
    @Results(id = "branchResultMap", value = {
            @Result(property = "branchId", column = "branch_id"),
            @Result(property = "branchCode", column = "branch_code"),
            @Result(property = "branchTitle", column = "branch_title")
    })
    Branch selectBranchByBranchId(@Param("headers") Map<String, Object> headers,
                                  @Param("branchId") String branchId);
}
