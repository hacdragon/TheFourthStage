package cn.tedu.csmall.product.pojo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

/**
 * @author firstdragon
 * @since 2022/11/29 下午 6:33
 * jsd2208-csmall-product cn.tedu.csmall.product.pojo.entity
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Sku {
    private Long id;
    private String spuId;
    private String title;
    private String barCode;
    private Long attibuteTemplateId;
    private String specifications;
    private Long alnumId;
    private String pictures;
    private Double price;
    private Integer stock;
    private Integer stockThreshold;
    private Integer sales;
    private Integer commentCount;
    private Integer positiveCommentCount;
    private Integer sort;
    private LocalDateTime gmtCreate;
    private LocalDateTime gmtModified;
}
