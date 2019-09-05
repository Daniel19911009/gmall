package com.atguigu.gmall.gmallusermanage.controller;

import com.atguigu.gmall.gmallusermanage.entity.UserInfo;
import com.atguigu.gmall.gmallusermanage.service.UserInfoService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Daniel
 * @create 2019--09--04--13:48
 * @Description:
 */
@RestController
public class UserController {
    @Autowired
    private UserInfoService userInfoService;

    @ApiOperation(value = "查询所有用户")
    @GetMapping("/listAllUsers")
    public List<UserInfo> listAllUsers() {
        return userInfoService.getUserInfoListAll();
    }

    @ApiOperation(value = "根据id查询用户信息")
    @GetMapping("/getUserInfoById/{id}")
    public UserInfo getUserInfoById(String id) {
        return userInfoService.getUserInfoById(id);
    }

    @ApiOperation(value = "根据id删除用户信息")
    @PostMapping("/deleteUserInfoById/{id}")
    public String deleteUserInfoById(String id) {
        userInfoService.delUser(id);
        return "success";
    }

    @ApiOperation(value = "根据登录name修改用户信息")
    @PutMapping("/updateUserInfoById/{name}")
    public String updateUserInfoById(@PathVariable String name,
                                     @RequestBody UserInfo userInfo) {
        userInfoService.updateUserByName(name, userInfo);
        return "success";
    }

    @ApiOperation(value = "根据id修改用户信息")
    @PutMapping("/updateUserInfoById")
    public String updateUserInfoById(@RequestBody UserInfo userInfo) {
        userInfoService.updateUser(userInfo);
        return "success";
    }

    @ApiOperation(value = "添加用户信息")
    @PostMapping("/addUserInfo")
    public String addUserInfo(@RequestBody UserInfo userInfo) {
        userInfoService.addUser(userInfo);
        return "success";
    }


}
