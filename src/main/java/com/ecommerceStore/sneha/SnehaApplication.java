package com.ecommerceStore.sneha;
import com.ecommerceStore.sneha.model.Product;
import com.ecommerceStore.sneha.service.ProductService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sql.DataSource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


@SpringBootApplication
public class SnehaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SnehaApplication.class, args);
	}

	@Bean
    CommandLineRunner runner(ProductService productService) {
        return args -> {
            productService.save(new Product(1L, "Dish-Washer", 450.00, "http://placehold.it/200x100"));
            productService.save(new Product(2L, "Refrigerator", 550.00, "http://placehold.it/200x100"));
            productService.save(new Product(3L, "Microwave", 100.00, "http://placehold.it/200x100"));
            productService.save(new Product(4L, "Electric Kettle", 50.00, "http://placehold.it/200x100"));
            productService.save(new Product(5L, "Mixer", 35.00, "http://placehold.it/200x100"));
            productService.save(new Product(6L, "Electric cooker", 150.00, "http://placehold.it/200x100"));
            productService.save(new Product(7L, "Food Processor", 305.00, "http://placehold.it/200x100"));
        };
    }
 

}
