package com.jdw.service.impl;

import com.jdw.entity.User;
import com.jdw.mapper.UserMapper;
import com.jdw.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jdw
 * @since 2021-10-29
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
