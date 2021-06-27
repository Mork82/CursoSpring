package com.jose.IoC;

public class SecretarioEmpleado implements Empleados {
    @Override
    public String getTareas() {
        return "gestionar la agenda de los jefes";
    }

    @Override
    public String getInforme() {
        return null;
    }
}
