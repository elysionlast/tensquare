package com.tensquare.qa.client;

import entity.Result;
import entity.StatusCode;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("tensquare-article")
public interface ArticleClient {
    @GetMapping("/article/{articleId}")
    public Result findById(@PathVariable("articleId") String articleId);
}
