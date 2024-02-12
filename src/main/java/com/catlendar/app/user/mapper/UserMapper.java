package com.catlendar.app.user.mapper;

import com.catlendar.app.user.model.PasswordInfo;
import com.catlendar.app.user.model.UserInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<UserInfo> getUserList();
    UserInfo getUser(UserInfo user);
    UserInfo selectEmailInfo(String email);
    int insertUser(UserInfo user);
    int emailVerify(UserInfo user);
    int updateUser(UserInfo user);
    PasswordInfo selectPassword(PasswordInfo passwordInfo);

    int updatePassword(PasswordInfo passwordInfo);
    int deleteUser(UserInfo user);
}
