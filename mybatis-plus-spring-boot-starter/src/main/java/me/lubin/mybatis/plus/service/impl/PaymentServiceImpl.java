package me.lubin.mybatis.plus.service.impl;

import me.lubin.mybatis.plus.entity.Payment;
import me.lubin.mybatis.plus.mapper.PaymentMapper;
import me.lubin.mybatis.plus.service.IPaymentService;
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
public class PaymentServiceImpl extends ServiceImpl<PaymentMapper, Payment> implements IPaymentService {

}
