package cn.tedu.csmall.product.mapper;

import cn.tedu.csmall.product.pojo.entity.CategoryAttributeTemplate;
import cn.tedu.csmall.product.pojo.vo.AlbumListItemVO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author firstdragon
 * @since 2022/11/29 下午 7:04
 * jsd2208-csmall-product cn.tedu.csmall.product.mapper
 */

@Repository
public interface CategoryAttributeTemplateMapper {
    int insert(CategoryAttributeTemplate categoryAttributeTemplate);
    int insertBatch(List<CategoryAttributeTemplate> categoryAttributeTemplates);
    int deleteById(Long id);
    int deleteByIds(List<Long> ids);
    int update(CategoryAttributeTemplate categoryAttributeTemplate);
    int count();
    int countByName(String name);
    CategoryAttributeTemplate getStandardById(Long id);
    List<AlbumListItemVO> list();
}
