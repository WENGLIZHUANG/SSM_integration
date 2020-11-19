package gdut.wlz.controller;

import gdut.wlz.domain.User;
import gdut.wlz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.List;

/**
 * @author: BUG_BOY
 * DATE:2020/11/18  11:23
 */
@Controller
public class WebController{
    /**
     * 使用注入就可以获取到service层的对象
     */
    @Resource
    private UserService userService;

    @RequestMapping(value = "/dataShow",produces = "application/json; charset=utf-8")
    public ModelAndView findAll() throws IOException {
        ModelAndView modelAndView = new ModelAndView();
        //设置跳转页面
        modelAndView.setViewName("datashow.jsp");
        //设置信息
        modelAndView.addObject("userList", userService.findAll());
        return modelAndView;
    }
}
