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
 * 物模型表
 * </p>
 *
 * @author lubin
 * @since 2021-06-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("iot_physical_model")
public class IotPhysicalModel implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @TableId("ipm_id")
    private String ipmId;

    /**
     * 模型名称
     */
    @TableField("ipm_name")
    private String ipmName;

    /**
     * 描述
     */
    @TableField("ipm_describe")
    private String ipmDescribe;

    /**
     * 0产品模型；1.协议模型
     */
    @TableField("ipm_type")
    private Integer ipmType;

    /**
     * 父模型ID；为0时为顶级模型
     */
    @TableField("ipm_parent_id")
    private String ipmParentId;

    /**
     * 0动态；1静态
     */
    @TableField("ipm_static")
    private Integer ipmStatic;

    /**
     * 创建时间
     */
    @TableField("ipm_create_time")
    private LocalDateTime ipmCreateTime;

    /**
     * 创建人
     */
    @TableField("ipm_creator")
    private String ipmCreator;

    /**
     * 0.不可复用；1.可复用
     */
    @TableField("ipm_reuse")
    private Integer ipmReuse;

    /**
     * 0.有效；1.无效
     */
    @TableField("ipm_invalid")
    private Integer ipmInvalid;


}
