package cn.tedu.csmall.product.mapper;

import cn.tedu.csmall.product.pojo.entity.Category;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author firstdragon
 * @since 2022/11/29 下午 7:02
 * jsd2208-csmall-product cn.tedu.csmall.product.mapper
 */
@Repository
public interface CategoryMapper {
    int insert(Category category);
    int insertBatch(List<Category> categorys);
    int deleteById(Long id);
    int deleteByIds(List<Long> ids);
    int update(Category category);
    int count();
    int countByName(String name);
    Category getStandardById(Long id);
    List<Category> list();
}
