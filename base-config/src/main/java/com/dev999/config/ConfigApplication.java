package com.dev999.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 配置中心启动类
 * @author helecong
 *
 */
@EnableConfigServer
@SpringBootApplication
public class ConfigApplication {
	
	/**、
	 * 配置中心启动main方法
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(ConfigApplication.class, args);
	}

}
