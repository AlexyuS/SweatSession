package controller;


import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyWebAppController {
    
    private Integer version=0;
    
    @PostConstruct
    void onInit(){
        System.out.println(MyWebAppController.class.getName()+" has been instantiated");
    }
    @GetMapping
    public String doGet()  {
       return "Version number is:"+version;
    }

    @PostMapping
    public void doPost()  {
       version++;
    }
    
    
}
