package com.blog.admin.controller.content;

import com.blog.common.exception.GlobalException;
import com.blog.common.response.ResponseInfo;
import com.blog.component.entity.content.Blog;
import com.blog.component.entity.content.BlogVisitLog;
import com.blog.component.service.content.BlogService;
import com.blog.component.vo.content.BlogVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Slf4j
@Api(tags = "博客内容接口")
@RestController
@RequestMapping(value = "/arc")
public class ArticleController {
    @Autowired
    private BlogService blogService;


    @ApiOperation(value = "添加文章")
    @RequestMapping(value = "/add" ,method = RequestMethod.POST)
    public ResponseInfo addArticle(@Valid @RequestBody BlogVo vo, BindingResult bindingResult) throws GlobalException {
        if(bindingResult.hasErrors()){
            List<FieldError> fieldErrors = bindingResult.getFieldErrors();
            fieldErrors.forEach(fieldError -> {
                //日志打印不符合校验的字段名和错误提示
                //log.error("error field is : {} ,message is : {}", fieldError.getField(), fieldError.getDefaultMessage());
                //log.error("error field is : {} ,message is : {}", fieldError.getField(), fieldError.getDefaultMessage());
            });
            // pesponsibles.setError_msg(fieldErrors);
            return new ResponseInfo();
        }

        blogService.addArticle(vo);
        return new ResponseInfo(bindingResult);
    }
    @GetMapping("/blog")
    public Blog getBlog(){
        System.out.printf("测试前端链接成功！");
        Blog blog = new Blog();
        blog.setBlogId(111);
        blog.setTitle("李文虎");
        return blog;
    }

}
