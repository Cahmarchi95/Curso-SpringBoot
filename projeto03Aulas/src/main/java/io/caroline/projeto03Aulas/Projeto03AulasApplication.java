package io.caroline.projeto03Aulas;

import io.caroline.projeto03Aulas.controller.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"io.caroline.projeto03Aulas.services","io.caroline.projeto03Aulas.controller" })
public class Projeto03AulasApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(Projeto03AulasApplication.class, args);
		MyController controller = (MyController) ctx.getBean("myController");
		controller.hello();
	}

}
