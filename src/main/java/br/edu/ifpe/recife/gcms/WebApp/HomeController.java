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
@RequestMapping("/Alteração responsavel")
public @ResponseBody String greetingAlteração() {
return "Hello, Alteração responsavel!";
}
@RequestMapping("/começo responsavelmente responsavel")
public @ResponseBody String greetingcomeço() {
return "Hello,  começo responsavelmente responsavel!";
}
@RequestMapping("/Alteração iresponsavel")
public @ResponseBody String greetingAlteração2() {
return "Hello, Alteração iresponsavel!";
}

@RequestMapping("/meio responsavel")
public @ResponseBody String greetingmeio() {
return "Hello,  meio responsavel!";

}
}
