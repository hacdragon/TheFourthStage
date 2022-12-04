package cn.tedu.csmall.product.controller;

import cn.tedu.csmall.product.pojo.dto.AttributeTemplateAddNewDTO;
import cn.tedu.csmall.product.service.IAttributeTemplateService;
import cn.tedu.csmall.product.web.JsonResult;
import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author firstdragon
 * @since 2022/12/4 下午 3:19
 * jsd2208-csmall-product cn.tedu.csmall.product.controller
 */

@Slf4j
@RestController
@RequestMapping("/attributeTemplate/")
@Validated
@Api(tags = "03. 属性模板管理模块")
public class AttributeTemplateContrller {
    @Autowired
    private IAttributeTemplateService iAttributeTemplate;
    @ApiOperation("添加属性模板")
    @ApiOperationSupport(order = 100)
    @PostMapping("add-new")
    public JsonResult addNewAttribute(@Valid @RequestBody AttributeTemplateAddNewDTO attributeTemplateAddNewDTO){
        iAttributeTemplate.addNew(attributeTemplateAddNewDTO);
        return JsonResult.ok();
    }
}
