package me.lubin.mybatis.plus.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author lubin
 * @since 2021-06-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("iot_mqtt_down_proj")
public class IotMqttDownProj implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("id")
    private String id;

    @TableField("rule_id")
    private String ruleId;

    @TableField("model_field")
    private String modelField;

    @TableField("topic_field")
    private String topicField;

    @TableField("def_val")
    private String defVal;

    @TableField("val_map")
    private String valMap;

    @TableField("desc_name")
    private String descName;

    @TableField("val_type")
    private String valType;


}
