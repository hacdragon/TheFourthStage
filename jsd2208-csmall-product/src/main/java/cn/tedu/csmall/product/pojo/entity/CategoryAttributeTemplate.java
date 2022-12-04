package cn.tedu.csmall.product.pojo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

/**
 * @author firstdragon
 * @since 2022/11/29 下午 6:27
 * jsd2208-csmall-product cn.tedu.csmall.product.pojo.entity
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class CategoryAttributeTemplate {
    private Long id;
    private Long categoryId;
    private Long attributeTemplateId;
    private LocalDateTime gmtCreate;
    private LocalDateTime gmtModified;
}
