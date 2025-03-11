package com.southwind.hr.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author admin
 * @since 2024-05-25
 */
@Data
  @EqualsAndHashCode(callSuper = false)
    public class BWorkRecord implements Serializable {

    private static final long serialVersionUID=1L;

      /**
     * ID
     */
        @TableId(value = "id", type = IdType.AUTO)
      private Long id;

      /**
     * 用户ID
     */
      private Long uid;

      /**
     * 打卡日期
     */
      private String workDate;

      /**
     * 上班时间
     */
      private String upTime;

      /**
     * 下班时间
     */
      private String downTime;

      /**
     * 打卡状态
     */
      private Integer status;

      /**
     * 创建时间
     */
      private LocalDateTime createTime;

      /**
     * 更新时间
     */
      private LocalDateTime updateTime;


}
