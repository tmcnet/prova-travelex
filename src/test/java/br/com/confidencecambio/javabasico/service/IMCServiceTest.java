package br.com.confidencecambio.javabasico.service;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.confidencecambio.javabasico.desafio1.service.ImcService;

public class IMCServiceTest {

	@Autowired
    private ImcService service;


    @Test
    @DisplayName("Quando um peso e altura for passado, deve retornar o IMC correto")
    public void quandoPassarUmPesoEAlturaQueroImcDeResposta(){
        var peso = 82.3;
        var altura = 1.77;
        Double imc = service.calculaImc(peso, altura);
        assertEquals(imc, 30,0);
    }

    @Test
    public void quandoPassarValorNuloQueroUmaExcecaoLancada(){

        Double imc = service.calculaImc(null, null);
        assertNotNull("teste", imc);
    }

}