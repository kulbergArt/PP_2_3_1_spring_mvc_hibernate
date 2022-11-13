package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.UserDao;

@Service
public class UserServiceImp implements UserService{

    @Autowired
    private UserDao userDao;
}
