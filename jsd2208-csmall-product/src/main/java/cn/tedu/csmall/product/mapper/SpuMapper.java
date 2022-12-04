package cn.tedu.csmall.product.mapper;

import cn.tedu.csmall.product.pojo.entity.Picture;
import cn.tedu.csmall.product.pojo.entity.Spu;
import cn.tedu.csmall.product.pojo.vo.AlbumListItemVO;
import cn.tedu.csmall.product.pojo.vo.AlbumStandardVO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author firstdragon
 * @since 2022/11/29 下午 7:08
 * jsd2208-csmall-product cn.tedu.csmall.product.mapper
 */

@Repository
public interface SpuMapper {
    int insert(Spu spu);
    int insertBatch(List<Spu> spus);
    int deleteById(Long id);
    int deleteByIds(List<Long> ids);
    int update(Spu spu);
    int count();
    int countByName(String name);
    Spu getStandardById(Long id);
    List<Spu> list();
}
