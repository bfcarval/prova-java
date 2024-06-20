package br.com.confidencecambio.javabasico.pattern.chain.interfaces;

import java.util.Optional;

public interface IMCFactory {

    Optional<String> isCorrectIMC(final double imcResult);
}
