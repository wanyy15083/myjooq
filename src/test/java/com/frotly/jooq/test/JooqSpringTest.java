package com.frotly.jooq.test;

import com.frotly.jooq.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by songyigui on 2016/12/20.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-config.xml"})
public class JooqSpringTest extends AbstractTransactionalJUnit4SpringContextTests {

    @Autowired
    private UserService userService;

    @Test
    public void testUserService(){
        userService.insert();
    }

}
