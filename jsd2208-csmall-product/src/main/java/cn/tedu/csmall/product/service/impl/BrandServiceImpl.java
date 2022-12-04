package cn.tedu.csmall.product.service.impl;

import cn.tedu.csmall.product.ex.ServiceException;
import cn.tedu.csmall.product.mapper.BrandMapper;
import cn.tedu.csmall.product.pojo.dto.BrandAddNewDTO;
import cn.tedu.csmall.product.pojo.entity.Brand;
import cn.tedu.csmall.product.service.IBrandService;
import cn.tedu.csmall.product.web.ServiceCode;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author firstdragon
 * @since 2022/12/1 下午 7:26
 * jsd2208-csmall-product cn.tedu.csmall.product.service.impl
 */

@Service
@Log4j2
public class BrandServiceImpl implements IBrandService {
    @Autowired
    private BrandMapper brandMapper;


    @Override
    public void addnew(BrandAddNewDTO brandDTO) {
        if(brandMapper.countByName(brandDTO.getName())>0){
            throw new ServiceException(ServiceCode.ERR_CONFLICT, "添加品牌失败，尝试添加的品牌名称已经被使用！");
        }
        Brand brand = new Brand();
        BeanUtils.copyProperties(brandDTO, brand);
        brandMapper.insert(brand);
    }
}
