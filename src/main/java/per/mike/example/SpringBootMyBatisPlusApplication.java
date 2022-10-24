package per.mike.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("per.mike.example.dao")
public class SpringBootMyBatisPlusApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMyBatisPlusApplication.class, args);

        System.out.println("######################################");
        System.out.println("##                                  ##");
        System.out.println("##  MY-BATIS PLUS SPRING BOOT START ##");
        System.out.println("##                                  ##");
        System.out.println("######################################");
	}

}
