package cn.tedu.csmall.product.pojo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

/**
 * @author firstdragon
 * @since 2022/11/29 下午 6:30
 * jsd2208-csmall-product cn.tedu.csmall.product.pojo.entity
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Picture {
    private Long id;
    private Long albumId;
    private String url;
    private String description;
    private Integer width;
    private Integer height;
    private Integer isCover;
    private Integer sort;
    private LocalDateTime gmtCreate;
    private LocalDateTime gmtModified;
}