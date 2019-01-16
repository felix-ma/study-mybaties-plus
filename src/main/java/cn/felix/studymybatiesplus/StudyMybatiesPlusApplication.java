package cn.felix.studymybatiesplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.felix.studymybatiesplus.mapper")
public class StudyMybatiesPlusApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudyMybatiesPlusApplication.class, args);
	}

}

