package cn.tedu.csmall.product.mapper;

import cn.tedu.csmall.product.pojo.entity.Brand;
import cn.tedu.csmall.product.pojo.vo.AlbumListItemVO;
import cn.tedu.csmall.product.pojo.vo.AlbumStandardVO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author firstdragon
 * @since 2022/11/29 下午 7:00
 * jsd2208-csmall-product cn.tedu.csmall.product.mapper
 */
@Repository
public interface BrandMapper {
    int insert(Brand brand);
    int insertBatch(List<Brand> abrandttibutes);
    int deleteById(Long id);
    int deleteByIds(List<Long> ids);
    int update(Brand brand);
    int count();
    int countByName(String name);
    Brand getStandardById(Long id);
    List<Brand> list();
}
