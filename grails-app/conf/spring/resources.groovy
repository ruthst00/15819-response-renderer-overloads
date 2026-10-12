package spring

import org.springframework.boot.web.servlet.FilterRegistrationBean
import org.springframework.web.filter.RequestContextFilter

beans = {
    lateRequestContextFilter(FilterRegistrationBean) {
        filter = new org.springframework.web.filter.RequestContextFilter()
        order = -100
    }
}