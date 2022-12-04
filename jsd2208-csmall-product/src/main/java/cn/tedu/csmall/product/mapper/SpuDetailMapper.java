package cn.tedu.csmall.product.mapper;

import cn.tedu.csmall.product.pojo.entity.Picture;
import cn.tedu.csmall.product.pojo.entity.SpuDetail;
import cn.tedu.csmall.product.pojo.vo.AlbumListItemVO;
import cn.tedu.csmall.product.pojo.vo.AlbumStandardVO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author firstdragon
 * @since 2022/11/29 下午 7:09
 * jsd2208-csmall-product cn.tedu.csmall.product.mapper
 */

@Repository
public interface SpuDetailMapper {
    int insert(SpuDetail spuDetail);
    int insertBatch(List<SpuDetail> spuDetails);
    int deleteById(Long id);
    int deleteByIds(List<Long> ids);
    int update(SpuDetail spuDetail);
    int count();
    int countByName(String name);
    SpuDetail getStandardById(Long id);
    List<SpuDetail> list();
}
