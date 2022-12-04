package cn.tedu.csmall.product.service.impl;

import cn.tedu.csmall.product.ex.ServiceException;
import cn.tedu.csmall.product.mapper.AttributeTemplateMapper;
import cn.tedu.csmall.product.pojo.dto.AttributeTemplateAddNewDTO;
import cn.tedu.csmall.product.pojo.entity.AttributeTemplate;
import cn.tedu.csmall.product.service.IAttributeTemplateService;
import cn.tedu.csmall.product.web.ServiceCode;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author firstdragon
 * @since 2022/12/4 下午 3:09
 * jsd2208-csmall-product cn.tedu.csmall.product.service.impl
 */

@Service
@Log4j2
public class AttributeTemplateImpl implements IAttributeTemplateService {

    @Autowired
    private AttributeTemplateMapper attributeTemplateMapper;

    @Override
    public void addNew(AttributeTemplateAddNewDTO attributeTemplateAddNewDTO) {
        if(attributeTemplateMapper.countByName(attributeTemplateAddNewDTO.getName())>0){
            throw new ServiceException(ServiceCode.ERR_CONFLICT, "添加品牌失败，尝试添加的属性模板名称已经被使用！");
        }
        AttributeTemplate attributeTemplate = new AttributeTemplate();
        BeanUtils.copyProperties(attributeTemplateAddNewDTO, attributeTemplate);
        attributeTemplateMapper.insert(attributeTemplate);
    }
}
