package org.meng.tools.config;

import org.meng.tools.service.MD5Service;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description: MD5AutoConfiguration
 * @create by meng on 17:11 2022/9/2
 */
@Configuration
@ConditionalOnClass(MD5Service.class)
public class AutoConfiguration {
	@Bean
	MD5Service md5Service() {
		return new MD5Service();
	}
}