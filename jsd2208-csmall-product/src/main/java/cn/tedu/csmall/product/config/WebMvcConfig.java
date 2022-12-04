package cn.tedu.csmall.product.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author firstdragon
 * @since 2022/12/4 下午 5:10
 * jsd2208-csmall-product cn.tedu.csmall.product.config
 */

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*")
                .allowedMethods("*")
                .allowedHeaders("*")
                .allowCredentials(false)
                .exposedHeaders("")
                .maxAge(3600);
    }
}
