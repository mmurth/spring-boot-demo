package at.murth.springbootdemo;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @CrossOrigin(origins="http://localhost:8080", maxAge = 3600L)
    @GetMapping("/account")
    public String getBalance() {
        return "Your are almost poor."; // rephrased message
    }

}
