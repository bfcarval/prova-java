package br.com.confidencecambio.javabasico.pattern.chain;

import br.com.confidencecambio.javabasico.pattern.chain.interfaces.IMCFactory;
import java.util.Optional;

public class IMCNormal implements IMCFactory {

    @Override
    public Optional<String> isCorrectIMC(final double imcResult) {
        return imcResult >= 18.6 && imcResult <= 24.9 ?
                Optional.of("IMC - Peso normal, resultado: ".concat(String.valueOf(imcResult))) :
                Optional.empty();
    }
}