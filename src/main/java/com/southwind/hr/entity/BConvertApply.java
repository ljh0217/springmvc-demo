package com.southwind.hr.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
    public class BConvertApply implements Serializable {

    private static final long serialVersionUID=1L;

      /**
     * ID
     */
        @TableId(value = "id", type = IdType.AUTO)
      private Long id;

    private Long applyUserId;

    private String applyDate;

    private String applyContent;

    private Integer status;

    private String approvalDate;

    private Integer approvalUserId;

    private String approvalOpinion;

    private String createTime;

    private String updateTime;


}
