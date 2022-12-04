package cn.tedu.csmall.product.pojo.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotNull;

/**
 * @author firstdragon
 * @since 2022/12/1 下午 7:29
 * jsd2208-csmall-product cn.tedu.csmall.product.pojo.dto
 */
@Data
public class BrandAddNewDTO {
    @ApiModelProperty(value = "品牌名字", required = true)
    @NotNull(message = "必须提交品牌名字")
    private String name;

    @ApiModelProperty(value = "品牌拼音", required = true)
    @NotNull(message = "必须提交品牌拼音")
    private String pinyin;

    @ApiModelProperty(value = "品牌logo", required = true)
    @NotNull(message = "必须提交品牌logo")
    private String logo;

    @ApiModelProperty(value = "品牌描述", required = true)
    @NotNull(message = "必须提交品牌描述")
    private String description;

    @ApiModelProperty(value = "关键字", required = true)
    @NotNull(message = "必须提交关键字")
    private String keywords;

    @ApiModelProperty(value = "排序序号", required = true)
    @Range(max = 255)
    private Integer sort;

    @ApiModelProperty(value = "启用", required = true)
    private Integer enable;
}
