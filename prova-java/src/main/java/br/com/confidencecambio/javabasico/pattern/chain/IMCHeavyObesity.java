package br.com.confidencecambio.javabasico.pattern.chain;

import br.com.confidencecambio.javabasico.pattern.chain.interfaces.IMCFactory;
import java.util.Optional;

public class IMCHeavyObesity implements IMCFactory {

    @Override
    public Optional<String> isCorrectIMC(final double imcResult) {
        return imcResult >= 40.0?
                Optional.of("IMC - Obesidade extrema, resultado: ".concat(String.valueOf(imcResult))) :
                Optional.empty();
    }
}