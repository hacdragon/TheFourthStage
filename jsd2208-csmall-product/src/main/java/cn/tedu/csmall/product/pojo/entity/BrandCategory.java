package cn.tedu.csmall.product.pojo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

/**
 * @author firstdragon
 * @since 2022/11/29 下午 6:20
 * jsd2208-csmall-product cn.tedu.csmall.product.pojo.entity
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class BrandCategory {
    private Long id;
    private Long brandId;
    private Long categoryId;
    /**
     * 数据创建时间
     */
    private LocalDateTime gmtCreate;
    /**
     * 数据最后修改时间
     */
    private LocalDateTime gmtModified;
}
