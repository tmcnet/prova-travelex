package br.com.confidencecambio.javabasico.desafio1.service;

import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

@Service
public class ImcService {


    public double calculaImc(@NonNull Double peso, @NonNull Double altura) {
    	
    	double imc = peso / Math.pow(altura, 2);
    	
    	return imc;
    }
}
