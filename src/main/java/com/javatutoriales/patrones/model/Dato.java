package com.javatutoriales.patrones.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Dato {
    private final int[] numerosSeleccionados;
    private int datoProcesado;
}
