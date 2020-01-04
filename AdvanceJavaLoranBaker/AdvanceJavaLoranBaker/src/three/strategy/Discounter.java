package three.strategy;

import java.math.BigDecimal;

public interface Discounter {
    
    public abstract BigDecimal applyDiscount(BigDecimal amount);
}
