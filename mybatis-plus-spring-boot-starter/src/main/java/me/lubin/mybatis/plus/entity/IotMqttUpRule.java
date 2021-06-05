package me.lubin.mybatis.plus.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * mqtt协议下行转换规则表
 * </p>
 *
 * @author lubin
 * @since 2021-06-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("iot_mqtt_up_rule")
public class IotMqttUpRule implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @TableId("id")
    private String id;

    /**
     * 产品类型
     */
    @TableField("product_id")
    private String productId;

    /**
     * mqtt主题
     */
    @TableField("topic_name")
    private String topicName;

    /**
     * 主题中的标识符
     */
    @TableField("identifier")
    private String identifier;

    /**
     * 模型ID
     */
    @TableField("model_id")
    private String modelId;


}
