package cn.tedu.csmall.product.mapper;

import cn.tedu.csmall.product.pojo.entity.Picture;
import cn.tedu.csmall.product.pojo.entity.SkuSpecifications;
import cn.tedu.csmall.product.pojo.vo.AlbumListItemVO;
import cn.tedu.csmall.product.pojo.vo.AlbumStandardVO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author firstdragon
 * @since 2022/11/29 下午 7:07
 * jsd2208-csmall-product cn.tedu.csmall.product.mapper
 */

@Repository
public interface SkuSpecificationsMapper {
    int insert(SkuSpecifications skuSpecifications);
    int insertBatch(List<SkuSpecifications> skuSpecifications);
    int deleteById(Long id);
    int deleteByIds(List<Long> ids);
    int update(SkuSpecifications skuSpecifications);
    int count();
    int countByName(String name);
    SkuSpecifications getStandardById(Long id);
    List<SkuSpecifications> list();
}
