package cn.tedu.csmall.product.pojo.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotNull;

/**
 * @author firstdragon
 * @since 2022/12/4 下午 3:41
 * jsd2208-csmall-product cn.tedu.csmall.product.pojo.dto
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class CategoryAddNewDTO {
    @ApiModelProperty(value = "类别名字", required = true)
    @NotNull(message = "必须提交类别名字")
    private String name;

    @ApiModelProperty(value = "父级类别id", required = true)
    private Long parentId;

    @ApiModelProperty(value = "深度", required = true)
    private Integer depth;

    @ApiModelProperty(value = "关键字", required = true)
    private String keywords;

    @ApiModelProperty(value = "排序序号", required = true)
    @Range(max = 255)
    private Integer sort;

    @ApiModelProperty(value = "图标图片URL", required = true)
    private String Icon;

    @ApiModelProperty(value = "是否启用", required = true)
    private Integer enable;

    @ApiModelProperty(value = "是否是父级", required = true)
    private Integer isParent;

    @ApiModelProperty(value = "是否显示在导航栏中", required = true)
    private Integer isDisplay;
}
