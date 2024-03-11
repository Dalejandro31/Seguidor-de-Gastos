package interfaces;

import entities.Gasto;

@FunctionalInterface
public interface GastoFunction {
    Double apply(Gasto gasto);
}
