package com.example.testheader.app.user;

import com.example.testheader.app.branch.Branch;
import com.example.testheader.app.branch.BranchProvider;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserMapper {
    @SelectProvider(value = UserProvider.class, method = "selectUsersSql")
    @Result(property = "userId", column = "user_id")
    @Result(property = "branch", column = "(headers={headers},branchId={branch_id})",
            one = @One(select = "selectBranchByHeadersAndBranchId"))
    List<User> getUsers(Map<String, Object> headers);

    @SelectProvider(type = BranchProvider.class, method = "selectBranchByBranchIdSql")
    @Results(id = "branchResultMap", value = {
            @Result(property = "branchId", column = "branch_id"),
            @Result(property = "branchCode", column = "branch_code"),
            @Result(property = "branchTitle", column = "branch_title")
    })
    Branch selectBranchByHeadersAndBranchId(@Param("headers") Map<String, Object> headers,@Param("branchId") String branchId);

}
