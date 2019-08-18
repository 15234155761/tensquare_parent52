package com.tensquare.article.controller;

import com.tensquare.article.pojo.Comment;
import com.tensquare.article.service.CommentService;
import entity.Result;
import entity.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin //跨源
@RequestMapping("/comment")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @RequestMapping(method = RequestMethod.POST)
    public Result save(Comment comment){
        commentService.add(comment);
        return new Result(true, StatusCode.OK,"提交成功");
    }

    @RequestMapping(value = "/article/{articleid}",method = RequestMethod.GET)
    public Result findByArticleid(@PathVariable String articleid){
        return new Result(true,StatusCode.OK,"查询成功",commentService.findByArticleid(articleid));
    }

    @RequestMapping(value = "/article/{articleid}",method = RequestMethod.DELETE)
    public Result deleteArticle(@PathVariable String articleid){
        return new Result(true,StatusCode.OK,"删除成功",commentService.deleteArticle(articleid));
    }

}
