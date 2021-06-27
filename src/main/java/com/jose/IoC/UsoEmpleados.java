package com.jose.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {
    public static void main(String[] args) {

       /* //Creacion de objetos de tipo empleado

        Empleados Empleado1 = new DirectorEmpleado();


        //Uso de los objetos creados
        System.out.println(Empleado1.getTareas());*/

        //Crear un contexto

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //Pedir al contexto el bean

        Empleados Juan = context.getBean("miEmpleado", Empleados.class);

        //Utilizar el objeto
        System.out.println(Juan.getTareas());
        System.out.println(Juan.getInforme());

        //cerramos el xml
        context.close();
    }
}
