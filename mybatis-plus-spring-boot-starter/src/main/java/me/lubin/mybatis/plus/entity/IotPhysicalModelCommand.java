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
 * 物模型命令表
 * </p>
 *
 * @author lubin
 * @since 2021-06-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("iot_physical_model_command")
public class IotPhysicalModelCommand implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @TableId("ipmc_id")
    private String ipmcId;

    /**
     * 名称
     */
    @TableField("ipmc_name")
    private String ipmcName;

    /**
     * 标识
     */
    @TableField("ipmc_code")
    private String ipmcCode;

    /**
     * 模型ID
     */
    @TableField("ipmc_model_id")
    private String ipmcModelId;

    /**
     * 备注
     */
    @TableField("ipmc_remark")
    private String ipmcRemark;

    /**
     * 0.有效；1.无效
     */
    @TableField("ipmc_invalid")
    private Integer ipmcInvalid;

    /**
     * 创建人
     */
    @TableField("ipmc_creator")
    private String ipmcCreator;

    /**
     * 创建时间
     */
    @TableField("ipmc_create_time")
    private LocalDateTime ipmcCreateTime;


}
