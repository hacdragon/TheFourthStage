package cn.tedu.csmall.product.mapper;

import cn.tedu.csmall.product.pojo.entity.Picture;
import cn.tedu.csmall.product.pojo.entity.Sku;
import cn.tedu.csmall.product.pojo.vo.AlbumListItemVO;
import cn.tedu.csmall.product.pojo.vo.AlbumStandardVO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author firstdragon
 * @since 2022/11/29 下午 7:06
 * jsd2208-csmall-product cn.tedu.csmall.product.mapper
 */

@Repository
public interface SkuMapper {
    int insert(Sku sku);
    int insertBatch(List<Sku> skus);
    int deleteById(Long id);
    int deleteByIds(List<Long> ids);
    int update(Sku sku);
    int count();
    int countByName(String name);
    Sku getStandardById(Long id);
    List<Sku> list();
}
