package com.yojulab.study_springboot.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.yojulab.study_springboot.service.CarInforsService;

@Controller
@RequestMapping("/carInfor/map")
public class CarInforsWithMapController {
    @Autowired
    CarInforsService carInforsService;

    // /selectSearch?search=YEAR&words=2020
    // /selectSearch/CAR_NAME/소
    @GetMapping("/selectSearch")
    // 컨트롤러의 function 은 서비스 콜, view 템플릿으로 넘기는것만 들어감
    public ModelAndView selectSearch(@RequestParam Map params
                            , ModelAndView modelAndView) {
        // 모델엔 뷰에는 뷰의 이름(템플릿, 예를들어 타임리프면 그 이름),
        // Object result = carInforsService.selectSearch(params);
        Object result = carInforsService.selectSearchWithPagination(params);
        modelAndView.addObject("params", params);
        modelAndView.addObject("result", result);
        
        modelAndView.setViewName("/WEB-INF/views/carinfor/list_map.jsp");
        return modelAndView;
    }

    // delete with MVC
    @PostMapping("/deleteAndSelectSearch/{UNIQUE_ID}")
    public ModelAndView deleteAndSelectSearch(@PathVariable String UNIQUE_ID
                        , @RequestParam Map params, ModelAndView modelAndView) {
        Object result = carInforsService.deleteAndSelectSearch(UNIQUE_ID, params);
        modelAndView.addObject("params", params);
        modelAndView.addObject("result", result);

        modelAndView.setViewName("/WEB-INF/views/carinfor/list_map.jsp");
        return modelAndView;
    }

    // /selectDetail/CI002
    @GetMapping("/selectDetail/{UNIQUE_ID}")
    public ModelAndView selectDetail(@PathVariable String UNIQUE_ID
                        , @RequestParam Map params, ModelAndView modelAndView) {
        Object result = carInforsService.selectDetail(UNIQUE_ID, params);
        modelAndView.addObject("params", params);

        modelAndView.setViewName("/WEB-INF/views/carinfor/list_map.jsp");
        return modelAndView;
    }
}


