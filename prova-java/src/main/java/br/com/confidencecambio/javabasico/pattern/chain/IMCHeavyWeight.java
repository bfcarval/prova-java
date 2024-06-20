package br.com.confidencecambio.javabasico.pattern.chain;

import br.com.confidencecambio.javabasico.pattern.chain.interfaces.IMCFactory;
import java.util.Optional;

public class IMCHeavyWeight implements IMCFactory {

    @Override
    public Optional<String> isCorrectIMC(double imcResult) {
        return imcResult >= 25.0 && imcResult <= 29.9 ?
                Optional.of("IMC - Sobrepeso, resultado: ".concat(String.valueOf(imcResult))) :
                Optional.empty();
    }
}