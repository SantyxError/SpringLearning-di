package com.bolsaideas.springboot.di.app.models.services;

//@Component("miServicioComplejo")

public class MiServicioComplejo implements IServicio {

    @Override
    public String operacion() {
        return "ejecutando algún proceso importante complicado ...";
    }

}
