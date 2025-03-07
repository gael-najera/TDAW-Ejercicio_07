package com.upiiz.Ejercicio_07.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MascotasController {
    @GetMapping("/mascotas")
    public String listadoMascotas() {
        return "mascotas/mascotas-listado";
    }

    @GetMapping("/mascotas/actualizar")
    public String actualizarMascotas() {
        return "mascotas/mascotas-actualizar";
    }

    @PostMapping("/mascotas/actualizar")
    public String actualizarMascota() {
        return "redirect:/mascotas";
    }

    @GetMapping("/mascotas/eliminar")
    public String eliminarMascotas() {

        return "mascotas/mascotas-eliminar";
    }

    @PostMapping("/mascotas/eliminar")
    public String eliminarMascota() {
        return "redirect:/mascotas";
    }


    @GetMapping("/mascotas/agregar")
    public String mostrarGuardar() {
        return "mascotas/mascotas-agregar";
    }

    @PostMapping("/mascotas/guardar")
    public String agregarMascotas() {
        //Guardamos y redireccionamos al listado
        return "redirect:/mascotas";
    }
}

