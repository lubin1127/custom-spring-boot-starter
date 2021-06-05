package me.lubin.mybatis.plus.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 产品绑定的子模型与topic绑定表，数据格式json时用
 * </p>
 *
 * @author lubin
 * @since 2021-06-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("iot_product_model_binding_topic")
public class IotProductModelBindingTopic implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @TableId("ipmbt_id")
    private String ipmbtId;

    /**
     * 产品ID
     */
    @TableField("ipmbt_product")
    private String ipmbtProduct;

    /**
     * 子模型ID
     */
    @TableField("ipmbt_model")
    private String ipmbtModel;

    /**
     * topic ID
     */
    @TableField("ipmbt_topic")
    private String ipmbtTopic;

    /**
     * 服务名称 ID
     */
    @TableField("ipmbt_server_name")
    private String ipmbtServerName;

    /**
     * 创建人
     */
    @TableField("ipmbt_creator")
    private String ipmbtCreator;

    /**
     * 创建时间
     */
    @TableField("ipmbt_create_time")
    private LocalDateTime ipmbtCreateTime;

    /**
     * 1.属性上报；2.命令下发
     */
    @TableField("ipmbt_type")
    private Integer ipmbtType;

    /**
     * 下发服务ID
     */
    @TableField("ipmbt_cmd")
    private String ipmbtCmd;


}
