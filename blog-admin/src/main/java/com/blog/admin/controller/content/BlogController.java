package com.blog.admin.controller.content;

import com.blog.common.enums.SystemExceptionEnum;
import com.blog.common.exception.GlobalException;
import com.blog.common.exception.SystemExceptionInfo;
import com.blog.common.redis.RedisService;
import com.blog.common.response.ResponseInfo;
import com.blog.component.entity.content.Blog;
import com.blog.component.service.content.BlogService;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(tags = "博客文章")
@RequestMapping(value = "/blog")
@RestController
public class BlogController {

    private static final Logger logger = LoggerFactory.getLogger(BlogController.class);

    @Autowired
    private BlogService blogService;
    @Autowired
    private RedisService redisService;

    /**
     * 参数放在哪个地方
     * query --> 请求参数的获取：@RequestParam
     * header --> 请求参数的获取：@RequestHeader
     * path（用于restful接口）--> 请求参数的获取：@PathVariable
     * body（请求体）--> @RequestBody User user
     * form（普通表单提交）
     *
     * required	参数是否必须必填
     * @param id
     * @param name
     * @return
     */
    @ApiOperation(value = "测试接口")
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    @ApiImplicitParams({ @ApiImplicitParam(name="name",value="用户名",dataType="string", paramType = "query",example="xingguo"),
            @ApiImplicitParam(name="id",value="用户id",dataType="Integer", paramType = "query")}
            )
    public ResponseInfo test(@RequestParam Integer id, @RequestParam String name){
        logger.info("测试数据： " + name+id);
        return new ResponseInfo(blogService.getAll());
    }

    @ApiResponses({
            @ApiResponse(code = 200, message = "请求成功"),
            @ApiResponse(code = 400, message = "请求参数没填好"),
            @ApiResponse(code = 404, message = "请求路径没有或页面跳转路径不对")
    })
    @ApiOperation("更改用户信息")
    @PostMapping("/updateUserInfo")
    public int updateUserInfo(@RequestBody @ApiParam(name="用户对象",value="传入json格式",required=true) Blog blog){
        return 1;
    }

    /**
     * @PathVariable用于获取get请求url路径上的参数，即参数绑定的作用，通俗的说是url中"?"前面绑定的参数。
     * @param id
     * @return
     */
    @ApiOperation("查询单体信息")
    @GetMapping("/query/{id}")
    public ResponseInfo queryById( @ApiParam(name = "id", value = "学生id",required = true) @PathVariable("id") Integer id) {
        return new ResponseInfo(blogService.getAll());
    }

    /**
     * @RequestParam用于获取前端传过来的参数，可以是get、post请求，通俗的说是url中"?"后面拼接的每个参数。
     * @param id
     * @return
     */
    @ApiOperation("查询学生信息")
    @RequestMapping(value = "/query/student",method = RequestMethod.GET)
    public ResponseInfo queryByIdStu(@RequestParam("id") Integer id) throws GlobalException {
        if(false){
            throw new GlobalException(new SystemExceptionInfo(
                    SystemExceptionEnum.ACCOUNT_LOCKED.getDefaultMessage(),
                    SystemExceptionEnum.ACCOUNT_LOCKED.getCode()));
        }
        return new ResponseInfo(blogService.getAll());
    }

    //超时时间10s
    private static final int TIMEOUT = 10 * 1000;
    /**
     *
     * @RequestParam
     * @param
     * @return
     */
    @ApiOperation("查询学生信息")
    @RequestMapping(value = "/query/redisLock",method = RequestMethod.GET)
    public ResponseInfo redisLock() throws GlobalException {
        redisService.setString("liwenhua","李文华");
        long time = System.currentTimeMillis() + TIMEOUT;
        //加锁
        if (!redisService.lock("liwenhua", String.valueOf(time))){
            throw new GlobalException(new SystemExceptionInfo("人太多了，等会儿再试吧~", 101));
        }
        return new ResponseInfo();
    }
}
