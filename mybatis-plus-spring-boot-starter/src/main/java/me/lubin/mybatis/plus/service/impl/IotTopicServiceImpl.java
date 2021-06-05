package me.lubin.mybatis.plus.service.impl;

import me.lubin.mybatis.plus.entity.IotTopic;
import me.lubin.mybatis.plus.mapper.IotTopicMapper;
import me.lubin.mybatis.plus.service.IIotTopicService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * topic表 服务实现类
 * </p>
 *
 * @author lubin
 * @since 2021-06-05
 */
@Service
public class IotTopicServiceImpl extends ServiceImpl<IotTopicMapper, IotTopic> implements IIotTopicService {

}
