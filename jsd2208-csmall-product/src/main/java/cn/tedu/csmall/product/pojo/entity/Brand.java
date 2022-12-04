package cn.tedu.csmall.product.pojo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

/**
 * @author firstdragon
 * @since 2022/11/29 下午 6:17
 * jsd2208-csmall-product cn.tedu.csmall.product.pojo.entity
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Brand {
    private Long id;    private String name;
    private String pinyin;
    private String logo;
    private String description;
    private String keywords;
    private Integer sort;
    private Integer sales;
    private Integer productCount;
    private Integer commentCount;
    private Integer positiveCommentCount;
    private Integer enable;

    private LocalDateTime gmtCreate;
    private LocalDateTime gmtModified;
}
