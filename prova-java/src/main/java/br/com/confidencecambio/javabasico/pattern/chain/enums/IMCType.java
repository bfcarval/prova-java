package br.com.confidencecambio.javabasico.pattern.chain.enums;

import br.com.confidencecambio.javabasico.pattern.chain.IMCHeavyObesity;
import br.com.confidencecambio.javabasico.pattern.chain.IMCHeavyWeight;
import br.com.confidencecambio.javabasico.pattern.chain.IMCLowWeight;
import br.com.confidencecambio.javabasico.pattern.chain.IMCNormal;
import br.com.confidencecambio.javabasico.pattern.chain.IMCObesityOne;
import br.com.confidencecambio.javabasico.pattern.chain.IMCObesityTwo;
import br.com.confidencecambio.javabasico.pattern.chain.interfaces.IMCFactory;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum IMCType {

    LOW_WEIGHT(new IMCLowWeight()),
    NORMAL(new IMCNormal()),
    HEAVY_WEIGHT(new IMCHeavyWeight()),
    OBESITY_ONE(new IMCObesityOne()),
    OBESITY_TWO(new IMCObesityTwo()),
    HEAVY_OBESITY(new IMCHeavyObesity());

    private final IMCFactory imcFactory;
}
