package com.frotly.jooq.service;

import com.frotly.jooq.data.tables.User;
import org.jooq.DSLContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by songyigui on 2016/12/20.
 */
@Service
public class UserService {
    Logger logger = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private DSLContext dsl;

    //    @Transactional
    public void insert() {
        for (int i = 0; i < 2; i++) {
            logger.info(i+"");
            dsl.insertInto(User.USER)
                    .set(User.USER.ID, 30)
                    .set(User.USER.USERNAME, "tom")
                    .set(User.USER.SEX, "1")
                    .execute();
        }
    }
}
