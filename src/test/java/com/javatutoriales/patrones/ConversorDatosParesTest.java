package com.javatutoriales.patrones;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ConversorDatosParesTest {

    @Test
    public void testConvierteDatos_cuandoValorMenorA100() {
        ConversorDatos conversorDatos = new ConversorDatosPares();

        assertThat(conversorDatos.convierte(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10})).isEqualTo(30);
    }

    @Test
    public void testConvierteDatos_cuandoValorMayorA100() {
        ConversorDatos conversorDatos = new ConversorDatosPares();

        assertThat(conversorDatos.convierte(new int[]{2, 4, 6, 8, 10, 12, 14, 16, 18, 20})).isEqualTo(110);
    }
}