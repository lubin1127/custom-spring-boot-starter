package me.lubin.mybatis.plus.service.impl;

import me.lubin.mybatis.plus.entity.User;
import me.lubin.mybatis.plus.mapper.UserMapper;
import me.lubin.mybatis.plus.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lubin
 * @since 2021-06-05
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
