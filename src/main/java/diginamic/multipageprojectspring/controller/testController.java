package diginamic.multipageprojectspring.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class testController {

    private List<String> liste;


    @PostMapping("/test1")
    @ResponseBody
     public ResponseEntity<Object> ajoutliste(@RequestBody List<String> list)
    {
        this.liste = list;
        return ResponseEntity.ok().build();
    }

    @GetMapping("/test1")
    public ModelAndView test(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("liste",this.liste);
        modelAndView.setViewName("test");
        return modelAndView;
    }

    @GetMapping("/test2")
    public String test2(){


        return "test2";
    }


}
