/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculadoramaven.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class OperacionesBasicasController {
    
    
    @GetMapping("/suma")
    public int suma(@RequestParam int a,@RequestParam int b)
    {
        return a + b;
    }
    
     @GetMapping("/resta")
    public int resta(@RequestParam int a,@RequestParam int b)
    {
        return a - b;
    }
    
     @GetMapping("/multiplicacion")
    public int multiplicacion(@RequestParam int a,@RequestParam int b)
    {
        return a * b;
    }
    
     @GetMapping("/division")
    public int division(@RequestParam int a,@RequestParam int b)
    {
        return a / b;
    }
    
}
