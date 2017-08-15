package com.csy.dao.mapper.user;

import com.csy.model.user.User;
import com.csy.model.user.UserConditions;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int countByExample(UserConditions example);

    int deleteByExample(UserConditions example);

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserConditions example);

    User selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserConditions example);

    int updateByExample(@Param("record") User record, @Param("example") UserConditions example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}