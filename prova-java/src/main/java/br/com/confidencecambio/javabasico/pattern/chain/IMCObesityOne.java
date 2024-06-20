package br.com.confidencecambio.javabasico.pattern.chain;

import br.com.confidencecambio.javabasico.pattern.chain.interfaces.IMCFactory;
import java.util.Optional;

public class IMCObesityOne implements IMCFactory {

    @Override
    public Optional<String> isCorrectIMC(final double imcResult) {
        return imcResult >= 30.0 && imcResult <= 34.9 ?
                Optional.of("IMC - Obesidade grau 1, resultado: ".concat(String.valueOf(imcResult))) :
                Optional.empty();
    }
}