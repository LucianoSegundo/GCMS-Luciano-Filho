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
public @ResponseBody String greetingDeuclano() {
return "Hello, Luciano!";
}
@RequestMapping("/Alteração responsavel")
public @ResponseBody String greetingFulano() {
return "Hello, Alteração responsavel!";
}
}