package com.javatutoriales.patrones;

import com.javatutoriales.patrones.model.CanalDatos;
import com.javatutoriales.patrones.model.Dato;

import java.util.Arrays;

public class ConversorDatosPares extends ConversorDatos {
    @Override
    protected CanalDatos conecta(int[] numeros) {
        return new CanalDatos(numeros);
    }

    @Override
    protected Dato selecciona(CanalDatos canalDatos) {

        int[] numerosPares = Arrays.stream(canalDatos.getDatos()).filter(numero -> numero % 2 == 0).toArray();

        Dato dato = new Dato(numerosPares);

        return dato;
    }

    @Override
    protected Dato procesa(Dato datoEntrada) {
        int resultadoSuma = Arrays.stream(datoEntrada.getNumerosSeleccionados()).sum();

        Dato datoSalida = new Dato(datoEntrada.getNumerosSeleccionados());
        datoSalida.setDatoProcesado(resultadoSuma);

        return datoSalida;
    }

    @Override
    protected boolean isNotificacionNecesaria(Dato dato) {
        return dato.getDatoProcesado() > 100;
    }

    @Override
    protected void notifica(Dato dato) {

    }

    @Override
    protected void desconecta(CanalDatos canalDatos) {
        canalDatos.setDatos(null);
    }
}
