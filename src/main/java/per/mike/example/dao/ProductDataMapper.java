package per.mike.example.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import per.mike.example.bean.ProductData;
import per.mike.example.bean.ProductDataFilter;

public interface ProductDataMapper extends BaseMapper<ProductData> {

    // List<ProductData> listProductDataByConditions(@Param(Constants.WRAPPER) Wrapper<ProductData> queryWrapper);
    List<ProductData> listProductDataByConditions();

    List<ProductData> searchPageByConditions(Page<ProductData> page, @Param("filter") ProductDataFilter filter);

    ProductData getProductDataById(String id);

    Integer insertProductData(ProductData model);

    Integer updateProductData(ProductData model);

    Integer deleteProductData(String id);
}
