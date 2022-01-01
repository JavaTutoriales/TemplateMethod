package com.javatutoriales.patrones;

import com.javatutoriales.patrones.model.CanalDatos;
import com.javatutoriales.patrones.model.Dato;

public abstract class ConversorDatos {
    public final int convierte(int[] numeros) {

        preConvierte(numeros);

        CanalDatos canalDatos = conecta(numeros);

        Dato datoEntrada = selecciona(canalDatos);

        preProcesa(datoEntrada);
        
        Dato datoProcesado = procesa(datoEntrada);

        postProcesa(datoProcesado);

        if(isNotificacionNecesaria(datoProcesado)){
            notifica(datoProcesado);
        }

        desconecta(canalDatos);

        postConvierte(datoProcesado.getDatoProcesado());

        return datoProcesado.getDatoProcesado();
    }

    protected void postProcesa(Dato datoProcesado) {
    }

    protected void preProcesa(Dato datoEntrada) {
    }

    protected void preConvierte(int[] numeros) {
    }

    protected void postConvierte(int datoProcesado) {
    }

    protected abstract CanalDatos conecta(int[] numeros);

    protected abstract Dato selecciona(CanalDatos canalDatos);

    protected abstract Dato procesa(Dato datoEntrada);

    protected boolean isNotificacionNecesaria(Dato dato){
        return false;
    }

    protected abstract void notifica(Dato dato);

    protected abstract void desconecta(CanalDatos canalDatos);
}
