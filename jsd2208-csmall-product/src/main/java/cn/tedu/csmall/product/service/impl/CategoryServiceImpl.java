package cn.tedu.csmall.product.service.impl;

import cn.tedu.csmall.product.ex.ServiceException;
import cn.tedu.csmall.product.mapper.CategoryMapper;
import cn.tedu.csmall.product.pojo.dto.CategoryAddNewDTO;
import cn.tedu.csmall.product.pojo.entity.Category;
import cn.tedu.csmall.product.service.ICategoryService;
import cn.tedu.csmall.product.web.ServiceCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author firstdragon
 * @since 2022/12/4 下午 3:47
 * jsd2208-csmall-product cn.tedu.csmall.product.service.impl
 */

@Service
@Slf4j
public class CategoryServiceImpl implements ICategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public void addCategory(CategoryAddNewDTO categoryAddNewDTO) {
        if(categoryMapper.countByName(categoryAddNewDTO.getName())>0){
            throw new ServiceException(ServiceCode.ERR_CONFLICT, "添加品牌失败，尝试添加的类别名称已经被使用！");
        }
        Category category = new Category();
        BeanUtils.copyProperties(categoryAddNewDTO, category);
        categoryMapper.insert(category);
    }
}
