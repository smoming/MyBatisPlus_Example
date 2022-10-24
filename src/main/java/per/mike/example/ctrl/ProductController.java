package per.mike.example.ctrl;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;

import per.mike.example.bean.ProductData;
import per.mike.example.dao.ProductDataDao;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductDataDao dao;

    @GetMapping("/fetch")
    public List<ProductData> fetch() {
        return dao.selectList(null);
    }

    @GetMapping("/get")
    public ProductData get(String id) {
        // 寫法一 需要寫死欄位名稱
        // return dao.selectOne(
        // new QueryWrapper<ProductData>()
        // .eq("id", id));

        // 寫法二 Lambda
        return dao.selectOne(
                new LambdaQueryWrapper<ProductData>()
                        .eq(ProductData::getId, id));

        // 寫法三 Lambda + Chain
        // return new LambdaQueryChainWrapper<ProductData>(dao)
        // .eq(ProductData::getId, id)
        // .one();
    }

    @GetMapping("/add")
    public String add(String id, String name, BigDecimal amt) {
        ProductData pd = new ProductData(id, name, amt, new Date(System.currentTimeMillis()));
        Integer rows = dao.insert(pd);
        return String.format("add %d product success ~", rows);
    }

    @GetMapping("/upd")
    public String upd(String id, String name, BigDecimal amt) {
        ProductData pd = new ProductData(id, name, amt, new Date(System.currentTimeMillis()));
        Integer rows = dao.update(pd,
                new LambdaQueryWrapper<ProductData>()
                .eq(ProductData::getId, id));
        return String.format("upd %d product success ~", rows);
    }

    @GetMapping("/del")
    public String del(String id) {
        Integer rows = dao.delete(
                new LambdaQueryWrapper<ProductData>()
                        .eq(ProductData::getId, id));
        return String.format("del %d product success ~", rows);
    }
}
