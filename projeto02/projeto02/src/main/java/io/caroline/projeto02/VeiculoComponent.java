package io.caroline.projeto02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class VeiculoComponent {

    @Autowired
    @Qualifier("carroBean")
    private Veiculo veiculo;

    public void service(){
        veiculo.start();
        veiculo.stop();
    }

}
