package me.wonwoo;

import me.wonwoo.cache.KeyGeneratorImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableCaching
public class CacheExampleApplication  {

	public static void main(String[] args) {
		SpringApplication.run(CacheExampleApplication.class, args);
	}

	@Bean
	public KeyGenerator keyGenerator() {
		return new KeyGeneratorImpl();
	}
}
