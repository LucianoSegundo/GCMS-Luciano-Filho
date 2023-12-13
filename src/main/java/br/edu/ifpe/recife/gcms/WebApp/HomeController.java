package br.edu.ifpe.recife.gcms.WebApp;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class HomeController {
@RequestMapping("/")
public @ResponseBody String greeting() {
return "Hello, World";
}
@RequestMapping("/Luciano")
public @ResponseBody String greetingLuciano() {
return "Hello, Luciano!";
}
@RequestMapping("/NãoLuciano")
public @ResponseBody String greetingNãoLuciano() {
return "Hello, Não sou Luciano!";
}

}
