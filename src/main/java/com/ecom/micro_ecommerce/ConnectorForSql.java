package com.ecom.micro_ecommerce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.ecom.micro_ecommerce.model.Product;

@Component
@Repository
public class ConnectorForSql {
    @Autowired
    private JdbcTemplate template;

    public JdbcTemplate getTemplate() {
        return template;
    }

    @Autowired
    public void setTemplate(JdbcTemplate temp) {
        this.template = temp;
    }

    public void save(Product p) {
        String query = "insert into product values(?,?,?,?,?,?,?,?,?,?)";
        template.update(query, p.getId(), p.isAvailable(), p.getBrand(), p.getCategory(), p.getDate(), p.getDesci(),
                p.getName(),
                p.getImgDate(), p.getImgName(), p.getImgType(), p.getPrice(),

                p.getQuantity());
    }
}
