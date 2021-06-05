package me.lubin.mybatis.plus.service.impl;

import me.lubin.mybatis.plus.entity.IotProductModelBindingTopic;
import me.lubin.mybatis.plus.mapper.IotProductModelBindingTopicMapper;
import me.lubin.mybatis.plus.service.IIotProductModelBindingTopicService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 产品绑定的子模型与topic绑定表，数据格式json时用 服务实现类
 * </p>
 *
 * @author lubin
 * @since 2021-06-05
 */
@Service
public class IotProductModelBindingTopicServiceImpl extends ServiceImpl<IotProductModelBindingTopicMapper, IotProductModelBindingTopic> implements IIotProductModelBindingTopicService {

}
