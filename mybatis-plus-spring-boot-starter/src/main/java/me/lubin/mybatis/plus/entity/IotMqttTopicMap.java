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
 * MQTT映射
 * </p>
 *
 * @author lubin
 * @since 2021-06-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("iot_mqtt_topic_map")
public class IotMqttTopicMap implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @TableId("id")
    private String id;

    /**
     * MQTT Topic 名称
     */
    @TableField("topic_name")
    private String topicName;

    /**
     * 产品key位置
     */
    @TableField("product_key")
    private Integer productKey;

    /**
     * 设备名称位置
     */
    @TableField("device_name")
    private Integer deviceName;

    /**
     * 分割符分割后长度
     */
    @TableField("length")
    private Integer length;

    /**
     * Topic 占位符
     */
    @TableField("subscribe_topic")
    private String subscribeTopic;

    /**
     * 匹配规则
     */
    @TableField("pattern")
    private String pattern;

    /**
     * 映射类型:PUBLISH-服务器下发,SUBSCRIBE-服务器订阅
     */
    @TableField("type")
    private String type;

    /**
     * 创建时间
     */
    @TableField("imtm_create_time")
    private LocalDateTime imtmCreateTime;

    /**
     * identifier位置 -1没有
     */
    @TableField("identifier")
    private Integer identifier;

    /**
     * method定义路径
     */
    @TableField("method_path")
    private String methodPath;

    /**
     * method_key
     */
    @TableField("method_key")
    private String methodKey;


}
