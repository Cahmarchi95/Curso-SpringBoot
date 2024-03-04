package io.caroline.projeto02;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bikeBean")
public class Bicicleta implements Veiculo {
    @Override
    public void start() {
        System.out.println("Começar a pedalar");
    }

    @Override
    public void stop() {
        System.out.println("Parar de pedalar");

    }
}
