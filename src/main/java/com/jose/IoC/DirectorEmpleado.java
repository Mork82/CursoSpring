package com.jose.IoC;

public class DirectorEmpleado implements Empleados {
    //Creacion de campo tipo CreaciónInforme
    private CreacionInformes informeNuevo;

    //Creacion de contrsuctor que inyecta la depencia
    public DirectorEmpleado(CreacionInformes informeNuevo) {
        this.informeNuevo = informeNuevo;
    }

    @Override
    public String getTareas() {
        return "Gestionar la plantilla de la empresa";
    }

    @Override
    public String getInforme() {
        return "Informe creado por el director: " + informeNuevo.getInforme();
    }
}
