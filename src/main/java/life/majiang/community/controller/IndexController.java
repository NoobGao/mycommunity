package life.majiang.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author gao
 * @Date 2021/5/30
 * @Time 14:22
 **/
@Controller
public class IndexController {

    /**
     * 访问主页
     */
    @RequestMapping({"","/","/index"})
    public String index(){
        return "index";
    }
}
