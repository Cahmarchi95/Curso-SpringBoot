package io.caroline.projeto02;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("carroBean")
public class Carro implements Veiculo{

    @Override
    public void start() {
        System.out.println("Ligando Carro");
    }

    @Override
    public void stop() {
        System.out.println("Desligando Carro");

    }
}
