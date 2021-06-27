package com.jose.IoC;

public class JefeEmpleado implements Empleados {

    //Creacion de campo tipo CreaciónInforme
    private CreacionInformes informeNuevo;

    public JefeEmpleado(CreacionInformes informeNuevo) {
        this.informeNuevo = informeNuevo;
    }

    public String getTareas(){
      return "gestiono las teraeas relativas a mis empleados de sección";
  }

    @Override
    public String getInforme() {
        return "Informe presentado por el Jefe con arreglos " + informeNuevo.getInforme();
    }
}
