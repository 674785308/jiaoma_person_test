package com.jiaoma.stu.helper;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.util.StringUtils;
import org.springframework.web.context.request.NativeWebRequest;

/**
 * Description: Page的帮助类 .<br>
 *
 * @author m-xy
 *     Created By 2019/4/10 上午11:21
 */
public final class PageHelper {

    /**
     * build spring data pageRequest.
     *
     * @param webRequest currentRequest
     * @return org.springframework.data.domain.PageRequest
     */
    public static PageRequest buildPageRequest(NativeWebRequest webRequest) {
        String rows = webRequest.getParameter("limit");
        String page = webRequest.getParameter("page");
        String orderFiledStr = webRequest.getParameter("sidx");
        try {
            int start = StringUtils.hasText(page) ? Integer.parseInt(page) : 0;
            int length = StringUtils.hasText(rows) ? Integer.parseInt(rows) : 10;
            int offset = start == 0 ? start : start - 1;
            if (StringUtils.hasText(orderFiledStr)) {
                String orderSord = webRequest.getParameter("sord");
                String[] orderFileds = (orderFiledStr.split(","));
                List<Sort.Order> orders = Arrays.stream(orderFileds).map(orderFiled ->
                    new Sort.Order(Sort.Direction.fromString(orderSord), orderFiled))
                    .collect(Collectors.toList());
                return PageRequest.of(offset, length, Sort.by(orders));
            }
            return PageRequest.of(offset, length);
        } catch (Exception e) {
            throw e;
        }
    }
}
