package cn.tedu.csmall.product.controller;

import cn.tedu.csmall.product.pojo.dto.CategoryAddNewDTO;
import cn.tedu.csmall.product.service.ICategoryService;
import cn.tedu.csmall.product.web.JsonResult;
import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
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
 * 处理类别相关请求的控制器
 *
 * @author java@tedu.cn
 * @version 0.0.1
 */
@Slf4j
@Validated
@RestController
@RequestMapping("/category")
@Api(tags = "01. 类别管理模块")
public class CategoryController {

    @Autowired
    private ICategoryService iCategoryService;

    // http://localhost:8080/category/add-new
    @ApiOperation("添加类别")
    @ApiOperationSupport(order = 100)
    @PostMapping("/add-new")
    public JsonResult addNew(@Valid @RequestBody CategoryAddNewDTO categoryAddNewDTO) {
        iCategoryService.addCategory(categoryAddNewDTO);
        return JsonResult.ok();
    }

    // http://localhost:8080/category/delete
    @ApiOperation("删除类别")
    @ApiOperationSupport(order = 200)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "类别ID", required = true, dataType = "long"),
            @ApiImplicitParam(name = "userId", value = "用户ID", required = true, dataType = "long")
    })
    @PostMapping("/delete")
    public void delete(Long userId, Long id) {
    }

    // http://localhost:8080/category/update
    @ApiOperation("修改类别详情")
    @ApiOperationSupport(order = 300)
    @PostMapping("/update")
    public void update() {
    }

    // http://localhost:8080/category/get
    @ApiOperation("根据id查询类别详情")
    @ApiOperationSupport(order = 400)
    @PostMapping("/get")
    public void getStandardById() {
    }

    // http://localhost:8080/category/list
    @ApiOperation("查询类别列表")
    @ApiOperationSupport(order = 410)
    @PostMapping("/list")
    public void list() {
    }

}
