package me.lubin.mybatis.plus.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * mqtt协议上行映射规则表
 * </p>
 *
 * @author lubin
 * @since 2021-06-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("iot_mqtt_up_proj")
public class IotMqttUpProj implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @TableId("id")
    private String id;

    /**
     * 对应的子模型id
     */
    @TableField("model_id")
    private String modelId;

    /**
     * 模型域路径
     */
    @TableField("model_field")
    private String modelField;

    /**
     * 主题域路径
     */
    @TableField("topic_field")
    private String topicField;

    /**
     * 归属的映射集
     */
    @TableField("rule_id")
    private String ruleId;

    /**
     * 默认值
     */
    @TableField("def_val")
    private String defVal;

    /**
     * 值映射
     */
    @TableField("val_map")
    private String valMap;

    /**
     * 字段说明
     */
    @TableField("desc_name")
    private String descName;

    /**
     * 数据类型
     */
    @TableField("val_type")
    private String valType;


}
