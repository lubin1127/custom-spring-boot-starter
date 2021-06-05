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
 * topic表
 * </p>
 *
 * @author lubin
 * @since 2021-06-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("iot_topic")
public class IotTopic implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @TableId("it_id")
    private String itId;

    /**
     * topic名称
     */
    @TableField("it_name")
    private String itName;

    /**
     * topic值
     */
    @TableField("it_val")
    private String itVal;

    /**
     * 0系统；1.自定义；
     */
    @TableField("it_type")
    private Integer itType;

    /**
     * 描述
     */
    @TableField("it_describe")
    private String itDescribe;

    /**
     * 创建人
     */
    @TableField("it_creator")
    private String itCreator;

    /**
     * 创建时间
     */
    @TableField("it_create_time")
    private LocalDateTime itCreateTime;

    /**
     * 逻辑删除标识 1 删除  0 正常
     */
    @TableField("it_delete_flag")
    private Integer itDeleteFlag;

    /**
     * 0.否；1.是
     */
    @TableField("it_grateway_listen")
    private Integer itGratewayListen;


}
