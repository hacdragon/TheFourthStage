package cn.tedu.csmall.product.pojo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

/**
 * @author firstdragon
 * @since 2022/11/29 下午 6:42
 * jsd2208-csmall-product cn.tedu.csmall.product.pojo.entity
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class SpuDetail {
    private Long id;
    private Long spuId;
    private String detail;
    private LocalDateTime gmtCreate;
    private LocalDateTime gmtModified;
}
