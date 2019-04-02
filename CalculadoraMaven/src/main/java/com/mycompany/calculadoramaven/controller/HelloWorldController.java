
package com.mycompany.calculadoramaven.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    
      @GetMapping("/hola")  //para acceder como localhost:8080/hola
    public String holamundo()
    {
        return "Hola mundo";
    }
    
}
