package com.floristeria.v1.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.floristeria.v1.entidades.Arreglo;
import com.floristeria.v1.servicios.arregloServicio;

@Controller
public class arregloControlador {

    @Autowired
    private arregloServicio arregloServicio;

    @GetMapping("/arreglos/nuevo")
    public String mostrarFormularioArreglo(Model modelo) {
        Arreglo arreglo = new Arreglo();
        modelo.addAttribute("arreglo", arreglo);
        return "crear_arreglo";
    }

    @PostMapping("/arreglos")
    public String guardarArreglo(@ModelAttribute("arreglo") Arreglo arreglo) {
        arregloServicio.guardarArreglo(arreglo);
        return "redirect:/arreglos";
    }

    @GetMapping("/arreglos/editar/{id}")
    public String mostrarFormularioEdicion(@PathVariable Long id, Model modelo) {
        Arreglo arreglo = arregloServicio.arregloById(id);
        if (arreglo == null) {
            throw new RuntimeException("Arreglo no encontrado para el ID: " + id);
        }
        modelo.addAttribute("arreglo", arreglo);
        return "editar_arreglo"; // Nombre de la plantilla HTML
    }

    @PostMapping("/arreglos/{id}")
    public String actualizarArreglo(@PathVariable Long id, @ModelAttribute("arreglo") Arreglo arreglo, Model modelo) {
        Arreglo arregloExistente = arregloServicio.arregloById(id);

        arregloExistente.setId(id);
        arregloExistente.setNombre(arreglo.getNombre());
        arregloExistente.setDescripcion(arreglo.getDescripcion());
        arregloExistente.setPrecio(arreglo.getPrecio());

        arregloServicio.actualizarInfoArreglo(arregloExistente);
        return "redirect:/arreglos";
    }

    @GetMapping("/arreglos/{id}")
    public String eliminarArreglo(@PathVariable Long id) {
        arregloServicio.eliminarArreglo(id);
        return "redirect:/arreglos";
    }

    @GetMapping("/arreglos")
    public String listarArreglos(Model modelo) {
        modelo.addAttribute("arreglos", arregloServicio.listarArreglos());
        return "arreglos";
    }

}
