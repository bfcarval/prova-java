package br.com.confidencecambio.javabasico.pattern.chain;

import br.com.confidencecambio.javabasico.pattern.chain.interfaces.IMCFactory;
import java.util.Optional;

public class IMCObesityTwo implements IMCFactory {

    @Override
    public Optional<String> isCorrectIMC(final double imcResult) {
        return imcResult >= 35.0 && imcResult <= 39.9 ?
                Optional.of("IMC - Obesidade grau 2, resultado: ".concat(String.valueOf(imcResult))) :
                Optional.empty();
    }
}