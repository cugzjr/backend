package com.xxxx.server;

import com.xxxx.server.dao.BuyRespository;
import com.xxxx.server.dao.UserRespository;
import com.xxxx.server.domain.pojo.User;
import com.xxxx.server.domain.relation.BuyRelation;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
class SecondHandApplicationTests {

	@Autowired
	UserRespository userRespository;

	@Autowired
	BuyRespository buyRespository;

	@Test
	public void testCreate(){
		User user = new User();
		user.setName("朱萌");
		userRespository.save(user);
	}

	@Test
	public void createRelation(){
		User user1 = new User();
		user1.setName("朱佳睿");

		User user2 = new User();
		user2.setName("面包");

		userRespository.save(user1);
		userRespository.save(user2);
		buyRespository.createRelation("朱佳睿","面包");
	}

}
