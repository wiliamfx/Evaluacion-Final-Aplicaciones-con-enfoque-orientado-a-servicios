package com.Evaluacion.controller;

import com.Evaluacion.Compra;
import com.Evaluacion.service.CompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/compra")
public class CompraController {

    @Autowired
    private CompraService compraService;

    @PostMapping
    public ResponseEntity<Compra> aplicarDescuento(@RequestBody Compra compra) {
        Compra resultado = compraService.aplicarDescuento(compra);
        return ResponseEntity.ok(resultado);
    }
}
