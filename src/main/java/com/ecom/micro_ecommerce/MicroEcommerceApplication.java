package com.ecom.micro_ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MicroEcommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroEcommerceApplication.class,
				args);
		// Product prod = context.getBean(Product.class);
		// prod.setAvailable(new Byte("1"));
		// prod.setBrand("Mercedes");
		// prod.setCategory("Car");
		// prod.setDate(Date.valueOf("2024-09-04"));
		// prod.setDesc("Luxurious Car");
		// prod.setId(5);
		// prod.setName("Sail");
		// prod.setPrice(new BigDecimal(4577612));
		// prod.setQuantity(2);

		// ConnectorForSql cs = context.getBean(ConnectorForSql.class);
		// cs.save(prod);
		// sp.save();

	}

}
