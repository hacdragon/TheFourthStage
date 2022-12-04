package cn.tedu.csmall.product.controller;

import cn.tedu.csmall.product.pojo.dto.AlbumAddNewDTO;
import cn.tedu.csmall.product.service.IAlbumService;
import cn.tedu.csmall.product.web.JsonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * 处理相册相关请求的控制器
 *
 * @author java@tedu.cn
 * @version 0.0.1
 */
@Slf4j
@RestController
@RequestMapping("/album")
@Api(tags = "04. 相册管理模块")
public class AlbumController {

    @Autowired
    private IAlbumService albumService;

    // http://localhost:8080/album/add-new?name=TestAlbum001&description=TestDescription001&sort=66
    @ApiOperation("添加相册")
    @PostMapping("/add-new")
    public JsonResult addNew(@Valid @RequestBody AlbumAddNewDTO albumAddNewDTO) {
        albumService.addNew(albumAddNewDTO);
        return JsonResult.ok();
    }

}
