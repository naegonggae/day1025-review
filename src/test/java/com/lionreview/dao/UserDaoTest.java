package com.lionreview.dao;

import com.lionreview.domain.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserDaoTest {
    @Test
    void addAndGet() {
        UserDao userDao = new UserDaoFactory().awsUserDao();
        String id = "44";
        userDao.add(new User(id, "sanghun", "12345"));
        User user = userDao.findById(id);
        assertEquals("sanghun", user.getName());
        assertEquals("12345", user.getPassword());
    }
}