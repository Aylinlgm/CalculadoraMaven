
package com.mycompany.calculadoramaven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication //levanta servidor de aplicaciones Tomcat
//ver github.com/jbarillas/SpringBootCalculator
//entrar a localhost:8080

public class CalculadoraMain {

    public static void main(String[] args) {
           SpringApplication.run(CalculadoraMain.class, args);
    }
    
}
