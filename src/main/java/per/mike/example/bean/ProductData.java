package per.mike.example.bean;

import java.math.BigDecimal;
import java.sql.Timestamp;

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
    private Timestamp createTime;
}
