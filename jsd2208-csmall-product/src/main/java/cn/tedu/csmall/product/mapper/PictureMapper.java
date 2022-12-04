package cn.tedu.csmall.product.mapper;

import cn.tedu.csmall.product.pojo.entity.Picture;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author firstdragon
 * @since 2022/11/29 下午 7:05
 * jsd2208-csmall-product cn.tedu.csmall.product.mapper
 */

@Repository
public interface PictureMapper {
    int insert(Picture pictures);
    int insertBatch(List<Picture> pictures);
    int deleteById(Long id);
    int deleteByIds(List<Long> ids);
    int update(Picture picture);
    int count();
    int countByName(String name);
    Picture getStandardById(Long id);
    List<Picture> list();
}
