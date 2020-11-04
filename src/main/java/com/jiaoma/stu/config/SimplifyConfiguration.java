package com.jiaoma.stu.config;

import com.jiaoma.stu.resolver.HandlerMethodArgumentResolverExtended;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.web.PageableHandlerMethodArgumentResolver;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Description: 自动加载 .<br>
 *
 * @author m-xy
 *     Created By 2019/11/19 17:49
 */
@Configuration
@ComponentScan
@EnableSpringDataWebSupport
public class SimplifyConfiguration implements WebMvcConfigurer {
    /**
     * 日志.
     */
    private static final Logger logger = LoggerFactory.getLogger(SimplifyConfiguration.class);

    /**
     * 添加参数解析器.
     *
     * @param argumentResolvers 参数解析器容器参数
     */
    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
        argumentResolvers.add(new HandlerMethodArgumentResolverExtended());
        argumentResolvers.add(new PageableHandlerMethodArgumentResolver());
        logger.info("[simplify-framework] - [添加PageRequest参数解析器成功]");
    }
}
