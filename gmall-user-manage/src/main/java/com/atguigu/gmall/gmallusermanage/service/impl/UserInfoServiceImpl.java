package com.atguigu.gmall.gmallusermanage.service.impl;

import com.atguigu.gmall.gmallusermanage.entity.UserInfo;
import com.atguigu.gmall.gmallusermanage.mapper.UserInfoMapper;
import com.atguigu.gmall.gmallusermanage.service.UserInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @author Daniel
 * @create 2019--09--04--13:45
 * @Description:
 */
@Service
@Slf4j
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    private UserInfoMapper userInfoMapper;
    @Override
    public List<UserInfo> getUserInfoListAll() {
        log.error("人生无常!!!!");
        System.out.println("及时行乐!!!");
        return userInfoMapper.selectAll();
    }

    @Override
    public void addUser(UserInfo userInfo) {
        userInfoMapper.insertSelective(userInfo);
    }

    @Override
    public void updateUser(UserInfo userInfo) {
        userInfoMapper.updateByPrimaryKeySelective(userInfo);
    }

    @Override
    public void updateUserByName(String name, UserInfo userInfo) {
        Example example = new Example(UserInfo.class);
        example.createCriteria().andEqualTo("loginName",name);
        userInfoMapper.updateByExampleSelective(userInfo,example);
    }

    @Override
    public void delUser(String id) {
        userInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public UserInfo getUserInfoById(String id) {
        return userInfoMapper.selectByPrimaryKey(id);
    }
}
