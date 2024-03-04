package io.caroline.projeto02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Projeto02Application {

public static void main(String[] args){

	SpringApplication.run(Projeto02Application.class, args);


	//ApplicationContext ctx =  SpringApplication.run(Projeto02Application.class, args);
	//	VeiculoComponent component = (VeiculoComponent) ctx.getBean("veiculoComponent");
	//	component.service();

	}
}
