package com.yojulab.study_springboot.controller;

import com.yojulab.study_springboot.service.CarInforsService;
import com.yojulab.study_springboot.service.CarsInfoService_Kiye;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
@RequestMapping("/carInfoKiye")
public class CarInfoController_Kiye {
    @Autowired
    CarsInfoService_Kiye carsInfoService_kiye;

    @GetMapping("/searchKiye")
    public ModelAndView Seacrh(@RequestParam Map params, ModelAndView modelAndView) {
        Object result = carsInfoService_kiye.selectTotal(params);

        modelAndView.addObject("params", params);
        modelAndView.addObject("result", result);

        modelAndView.setViewName("/WEB-INF/views/carinfor/list_leekiye.jsp");
        return modelAndView;
    }

    @PostMapping("/delete/{UNIQUE_ID}")
    public ModelAndView delete(@PathVariable String UNIQUE_ID, @RequestParam Map params, ModelAndView modelAndView) {
        Object result = carsInfoService_kiye.delete(params, UNIQUE_ID);
        modelAndView.addObject("params", params);
        modelAndView.addObject("result", result);
        modelAndView.setViewName("/WEB-INF/views/carinfor/list_leekiye.jsp");

        return modelAndView;
    }

}
