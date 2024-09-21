package com.petShop;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludar")
public class PetShopHolaMundo {

    @GetMapping("/hola")
    public String Saludar(){
        return "Nos vemos a dios ADSO";
    }

}




