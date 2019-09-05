package com.atguigu.gmall.gmallusermanage;

import com.atguigu.gmall.gmallusermanage.entity.UserInfo;
import com.atguigu.gmall.gmallusermanage.service.UserInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GmallUserManageApplicationTests {
	@Autowired
	private UserInfoService userInfoService;
	@Test
	public void contextLoads() {
		List<UserInfo> infoListAll = userInfoService.getUserInfoListAll();
		infoListAll.forEach(System.out::println);
	}

}
