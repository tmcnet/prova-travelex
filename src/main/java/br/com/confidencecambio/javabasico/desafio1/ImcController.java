package br.com.confidencecambio.javabasico.desafio1;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.confidencecambio.javabasico.desafio1.service.IMCService;

@RestController
public class ImcController {

	private IMCService service;

	public ImcController(final IMCService service) {

		this.service = service;
	}

	@GetMapping(value = "/imc")
	public ResponseEntity<Double> calcular(@RequestParam(value = "peso") String peso,
			@RequestParam(value = "altura") String altura) {
		
		Optional<String> pesoOptional = Optional.ofNullable(peso);
		Optional<String> alturaOptional = Optional.ofNullable(altura);

		if (pesoOptional.isPresent() && !pesoOptional.get().isEmpty() && alturaOptional.isPresent()
				&& !alturaOptional.get().isEmpty()) {

			var imc = service.calculaImc(Double.valueOf(peso), Double.valueOf(altura));

			return new ResponseEntity<Double>(imc, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
}
