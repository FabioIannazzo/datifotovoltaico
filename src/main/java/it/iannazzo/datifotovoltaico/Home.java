package it.iannazzo.datifotovoltaico;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {
    @GetMapping("/")
    public String home() {
        return "Ciao da DATIFOTOVOLTAICO!";
    }
}
