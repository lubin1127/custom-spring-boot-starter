package me.lubin.mybatis.plus.service.impl;

import me.lubin.mybatis.plus.entity.IotProduct;
import me.lubin.mybatis.plus.mapper.IotProductMapper;
import me.lubin.mybatis.plus.service.IIotProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 产品表 服务实现类
 * </p>
 *
 * @author lubin
 * @since 2021-06-05
 */
@Service
public class IotProductServiceImpl extends ServiceImpl<IotProductMapper, IotProduct> implements IIotProductService {

}
