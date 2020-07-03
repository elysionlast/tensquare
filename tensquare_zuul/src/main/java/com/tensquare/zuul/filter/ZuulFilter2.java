package com.tensquare.zuul.filter;

import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

@Component
public class ZuulFilter2 extends com.netflix.zuul.ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
//        RequestContext ctx = RequestContext.getCurrentContext();
//        ctx.setSendZuulResponse(false);
        System.out.println("zuulfilter2 passed");
        return null;
    }
}
