package com.example.kataSpringBoot.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.kataSpringBoot.dao.UserDao;
import com.example.kataSpringBoot.model.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Transactional
    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Transactional
    @Override
    public void deleteUser(Long id) {
        userDao.deleteUser(id);
    }

    @Transactional
    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    @Transactional(readOnly = true)
    @Override
    public List<User> getAllUser() {
        return userDao.getAllUser();
    }

    @Override
    public User getById(Long id) {
        return userDao.getById(id);
    }
}
