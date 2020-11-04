package com.jiaoma.stu.resolver;



import com.jiaoma.stu.helper.PageHelper;
import org.springframework.core.MethodParameter;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.support.WebArgumentResolver;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

/**
 * Description: 参数解析器 .<br>
 *
 * @author liusf
 */
public class HandlerMethodArgumentResolverExtended implements HandlerMethodArgumentResolver {

    @Override
    public boolean supportsParameter(MethodParameter parameter) {
        Class<?> targetClass = parameter.getParameterType();
        if (targetClass.isAssignableFrom(PageRequest.class)) {
            return true;
        }
        return false;
    }

    @Override
    public Object resolveArgument(
        MethodParameter parameter,
        ModelAndViewContainer mavContainer,
        NativeWebRequest webRequest,
        WebDataBinderFactory binderFactory) throws Exception {
        Class<?> targetClass = parameter.getParameterType();
        if (targetClass.isAssignableFrom(PageRequest.class)) {
            return PageHelper.buildPageRequest(webRequest);
        }
        return WebArgumentResolver.UNRESOLVED;
    }
}
