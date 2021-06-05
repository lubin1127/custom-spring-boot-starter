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
 * 服务名称表
 * </p>
 *
 * @author lubin
 * @since 2021-06-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("iot_server_name")
public class IotServerName implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @TableId("isn_id")
    private String isnId;

    /**
     * 名称
     */
    @TableField("isn_name")
    private String isnName;

    /**
     * 标识
     */
    @TableField("isn_code")
    private String isnCode;

    /**
     * 描述
     */
    @TableField("isn_remark")
    private String isnRemark;

    /**
     * 创建时间
     */
    @TableField("isn_create_time")
    private LocalDateTime isnCreateTime;

    /**
     * 创建人
     */
    @TableField("isn_creator")
    private String isnCreator;


}
