package com.atguigu.gmall.gmallusermanage.service;

import com.atguigu.gmall.gmallusermanage.entity.UserInfo;

import java.util.List;

/**
 * @author Daniel
 * @create 2019--09--04--13:45
 * @Description:
 */
public interface UserInfoService {
    List<UserInfo> getUserInfoListAll();

    void addUser(UserInfo userInfo);

    void updateUser(UserInfo userInfo);

    void updateUserByName(String name,UserInfo userInfo);

    void delUser(String id);

    UserInfo getUserInfoById(String id);
}
