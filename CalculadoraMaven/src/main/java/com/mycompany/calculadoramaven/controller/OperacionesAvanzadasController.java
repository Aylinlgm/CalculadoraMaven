
package com.mycompany.calculadoramaven.controller;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OperacionesAvanzadasController {
    
    @GetMapping("/factorial")
    public int factorial(@RequestParam int a)
    {
        if(a==0)
        {
            return 1; 
        }
        else
        {
            return a * factorial(a-1);
        }
    }
    
     @GetMapping("/cuadrado")
    public int cuadrado(@RequestParam int a)
    {
        return a * a;
        
    } 
    
    @GetMapping("/potencia")
    public int potencia(@RequestParam int base,@RequestParam int exponente)
    {
        return (int)pow(base,exponente);
    }
    
    @GetMapping("/absoluto")
    public int absoluto(@RequestParam int a)
    {
        if (a > 0)
            
        {
            return a;
        }
        else 
        {
            return a * (-1);
        }
    }
    
    
     @GetMapping("/raiz")
    public double raiz(@RequestParam int a)
    {
        return sqrt(a);
    }
    
}
