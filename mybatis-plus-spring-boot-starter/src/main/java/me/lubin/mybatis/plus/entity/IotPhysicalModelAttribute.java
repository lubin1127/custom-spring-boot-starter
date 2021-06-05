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
 * 物模型属性表
 * </p>
 *
 * @author lubin
 * @since 2021-06-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("iot_physical_model_attribute")
public class IotPhysicalModelAttribute implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @TableId("ipma_id")
    private String ipmaId;

    /**
     * 属性名称
     */
    @TableField("ipma_name")
    private String ipmaName;

    /**
     * 属性编码
     */
    @TableField("ipma_code")
    private String ipmaCode;

    /**
     * 模型ID
     */
    @TableField("ipma_model_id")
    private String ipmaModelId;

    /**
     * 数据类型
     */
    @TableField("ipma_data_type")
    private String ipmaDataType;

    /**
     * json
     */
    @TableField("ipma_data_type_append")
    private String ipmaDataTypeAppend;

    /**
     * 单位
     */
    @TableField("ipma_unit")
    private String ipmaUnit;

    /**
     * 0非必填1必填
     */
    @TableField("ipma_required")
    private Integer ipmaRequired;

    /**
     * 备注
     */
    @TableField("ipma_remark")
    private String ipmaRemark;

    /**
     * 0.有效；1.无效
     */
    @TableField("ipma_invalid")
    private Integer ipmaInvalid;

    /**
     * 创建人
     */
    @TableField("ipma_creator")
    private String ipmaCreator;

    /**
     * 创建时间
     */
    @TableField("ipma_create_time")
    private LocalDateTime ipmaCreateTime;


}
