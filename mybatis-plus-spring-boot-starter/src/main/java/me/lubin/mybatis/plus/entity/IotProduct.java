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
 * 产品表
 * </p>
 *
 * @author lubin
 * @since 2021-06-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("iot_product")
public class IotProduct implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @TableId("ip_id")
    private String ipId;

    /**
     * 名称
     */
    @TableField("ip_name")
    private String ipName;

    /**
     * 厂商ID
     */
    @TableField("ip_manufacturer")
    private String ipManufacturer;

    /**
     * 产品类别ID
     */
    @TableField("ip_classify")
    private String ipClassify;

    /**
     * 协议ID
     */
    @TableField("ip_protocol")
    private String ipProtocol;

    /**
     * 0json;1二进制
     */
    @TableField("ip_data_format")
    private Integer ipDataFormat;

    /**
     * 模型ID
     */
    @TableField("ip_model")
    private String ipModel;

    /**
     * 描述
     */
    @TableField("ip_remark")
    private String ipRemark;

    /**
     * 创建人
     */
    @TableField("ip_creator")
    private String ipCreator;

    /**
     * 创建时间
     */
    @TableField("ip_create_time")
    private LocalDateTime ipCreateTime;

    /**
     * 协议版本号
     */
    @TableField("ip_version")
    private String ipVersion;

    /**
     * 产品标识
     */
    @TableField("ip_product_code")
    private String ipProductCode;


}
