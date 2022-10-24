package per.mike.example.bean;

import java.math.BigDecimal;
import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductData {

    private String id;
    private String name;
    private BigDecimal amt;
    private Date createTime;
}
