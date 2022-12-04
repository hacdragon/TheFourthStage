package cn.tedu.csmall.product.pojo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

/**
 * @author firstdragon
 * @since 2022/11/29 下午 6:43
 * jsd2208-csmall-product cn.tedu.csmall.product.pojo.entity
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Spu {
    private Long id;
    private String name;
    private String typeNumber;
    private String title;
    private String description;

    private Double listPrice;
    private Integer stock;
    private Integer stockThreshold;
    private String unit;
    private Long brandId;

    private String brandName;
    private Long categoryId;
    private String categoryName;
    private Long attibuteTemplateId;
    private Long albumId;

    private String pictures;
    private String keywords;
    private String tags;
    private Integer sales;
    private Integer commentCount;

    private Integer positiveCommentCount;
    private Integer sort;
    private Integer isDeleted;
    private Integer isPublished;
    private Integer isNewArrival;

    private Integer isRecommend;
    private Integer isCheack;
    private String cheackUser;
    private LocalDateTime gmtCheck;
    private LocalDateTime gmtCreate;

    private LocalDateTime gmtModified;
}
