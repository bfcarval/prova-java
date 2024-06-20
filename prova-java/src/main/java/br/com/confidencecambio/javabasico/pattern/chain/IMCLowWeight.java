package br.com.confidencecambio.javabasico.pattern.chain;

import br.com.confidencecambio.javabasico.pattern.chain.interfaces.IMCFactory;
import java.util.Optional;

public class IMCLowWeight implements IMCFactory {

    @Override
    public Optional<String> isCorrectIMC(final double imcResult) {
        return imcResult <= 18.5 ?
                Optional.of("IMC - Peso abaixo do normal, resultado: ".concat(String.valueOf(imcResult))) :
                Optional.empty();
    }
}