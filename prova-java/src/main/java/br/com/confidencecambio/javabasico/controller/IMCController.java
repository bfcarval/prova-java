package br.com.confidencecambio.javabasico.controller;

import br.com.confidencecambio.javabasico.service.IMCService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/imc")
public class IMCController {

    private IMCService imcService;

    public IMCController(final IMCService imcService) {
        this.imcService = imcService;
    }

    @RequestMapping(value = "/calc", method = RequestMethod.GET)
    public ResponseEntity<String> calcIMC(
            @RequestParam(value = "peso", defaultValue = "0.0", required = false) double peso,
            @RequestParam(value = "altura", defaultValue = "0.0", required = false) double altura) {
        return ResponseEntity.ok(imcService.calcIMC(peso, altura));
    }
}
