package br.com.confidencecambio.javabasico.service;

import br.com.confidencecambio.javabasico.pattern.chain.enums.IMCType;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Arrays;
import org.springframework.stereotype.Service;

@Service
public class IMCService {

    public String calcIMC(final double peso, final double altura) {
        final var imc = peso / (altura * altura);

        if (Double.isNaN(imc)) return "Valores não suportados";

        final var imcRounded = new BigDecimal(imc).setScale(2, RoundingMode.DOWN).doubleValue();
        final var imcResult = new StringBuilder();

        Arrays.stream(IMCType.values()).forEach( p -> {
            final var imcSearchResult = p.getImcFactory().isCorrectIMC(imcRounded);

            if (imcSearchResult.isPresent() && !imcSearchResult.get().isBlank()) {
                imcResult.append(imcSearchResult.get());
            }

        });

        return imcResult.toString();
    }
}