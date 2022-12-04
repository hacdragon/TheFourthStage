package cn.tedu.csmall.product.mapper;

import cn.tedu.csmall.product.pojo.entity.BrandCategory;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author firstdragon
 * @since 2022/11/29 下午 7:01
 * jsd2208-csmall-product cn.tedu.csmall.product.mapper
 */

@Repository
public interface BrandCategoryMapper {
    int insert(BrandCategory brandCategory);
    int insertBatch(List<BrandCategory> brandCategorys);
    int deleteById(Long id);
    int deleteByIds(List<Long> ids);
    int update(BrandCategory brandCategory);
    int count();
    int countById(Long id);
    BrandCategory getStandardById(Long id);
    List<BrandCategory> list();
}
