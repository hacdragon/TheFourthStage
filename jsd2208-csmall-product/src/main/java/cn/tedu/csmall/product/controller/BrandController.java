package cn.tedu.csmall.product.controller;

import cn.tedu.csmall.product.pojo.dto.BrandAddNewDTO;
import cn.tedu.csmall.product.service.IBrandService;
import cn.tedu.csmall.product.web.JsonResult;
import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.validator.constraints.Range;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * 处理品牌相关请求的控制器
 *
 * @author java@tedu.cn
 * @version 0.0.1
 */
@Slf4j
@RestController
@RequestMapping("/brand")
@Validated
@Api(tags = "02. 品牌管理模块")
public class BrandController {
    @Autowired
    private IBrandService brandService;

    // http://localhost:8080/category/add-new
    @ApiOperation("添加类别")
    @ApiOperationSupport(order = 100)
    @PostMapping("/add-new")
    public JsonResult addNew(@Valid @RequestBody BrandAddNewDTO brandDTO) {
        brandService.addnew(brandDTO);
        return JsonResult.ok();
    }

    // http://localhost:9080/brand/delete
    @ApiOperation("删除品牌")
    @ApiOperationSupport(order = 200)
    @ApiImplicitParam(name = "id", value = "品牌ID", required = true, dataType = "long")
    @PostMapping("/delete")
    public void delete(@Range(min = 1, message = "删除品牌失败，尝试删除的品牌的ID无效！")
                           @RequestParam Long id) {
    }

}
