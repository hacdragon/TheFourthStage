package cn.tedu.csmall.product.pojo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

/**
 * @author firstdragon
 * @since 2022/11/29 下午 6:22
 * jsd2208-csmall-product cn.tedu.csmall.product.pojo.entity
 */

@Data
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
public class Category {
    private Long id;
    private String name;
    private Long parentId;
    private Integer depth;
    private String keywords;
    private Integer sort;
    private String Icon;
    private Integer enable;
    private Integer isParent;
    private Integer isDisplay;
    private LocalDateTime gmtCreate;
    private LocalDateTime gmtModified;
}
