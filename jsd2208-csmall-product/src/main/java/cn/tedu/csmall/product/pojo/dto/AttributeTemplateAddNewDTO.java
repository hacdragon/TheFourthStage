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
 * @since 2022/12/4 下午 3:04
 * jsd2208-csmall-product cn.tedu.csmall.product.pojo.dto
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class AttributeTemplateAddNewDTO {
    @ApiModelProperty(value = "属性模板名字", required = true)
    @NotNull(message = "必须提交属性模板名字")
    private String name;

    @ApiModelProperty(value = "属性模板拼音", required = true)
    private String pinyin;

    @ApiModelProperty(value = "关键字", required = true)
    private String keywords;

    @ApiModelProperty(value = "排序序号", required = true)
    @Range(max = 255)
    private Integer sort;

}
