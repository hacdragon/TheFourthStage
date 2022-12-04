package cn.tedu.csmall.product.service.impl;

import cn.tedu.csmall.product.ex.ServiceException;
import cn.tedu.csmall.product.mapper.AlbumMapper;
import cn.tedu.csmall.product.pojo.dto.AlbumAddNewDTO;
import cn.tedu.csmall.product.pojo.entity.Album;
import cn.tedu.csmall.product.service.IAlbumService;
import cn.tedu.csmall.product.web.ServiceCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 处理相册数据的业务实现类
 *
 * @author java@tedu.cn
 * @version 0.0.1
 */
@Slf4j
@Service
public class AlbumServiceImpl implements IAlbumService  {

    @Autowired
    private AlbumMapper albumMapper;

    @Override
    public void addNew(AlbumAddNewDTO albumAddNewDTO) {
        // 应该保证此相册的名称是唯一的
        String albumName = albumAddNewDTO.getName();
        int count = albumMapper.countByName(albumName);
        if (count > 0) {
            String message = "添加相册失败，尝试添加的相册名称已经被使用！";
            throw new ServiceException(ServiceCode.ERR_CONFLICT, message);
        }

        // 创建Album类型的对象
        Album album = new Album();
        // 调用BeanUtils.copyProperties(源对象, 目标对象)将参数的属性值复制到新创建的Album对象中
        BeanUtils.copyProperties(albumAddNewDTO, album);
        // 调用albumMapper的int insert(Album album)方法插入相册数据
        albumMapper.insert(album);
    }

}