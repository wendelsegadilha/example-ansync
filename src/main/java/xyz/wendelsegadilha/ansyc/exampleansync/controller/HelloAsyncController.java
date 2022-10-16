package xyz.wendelsegadilha.ansyc.exampleansync.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.wendelsegadilha.ansyc.exampleansync.service.AsyncService;

@RestController
public class HelloAsyncController {

    @Autowired
    private AsyncService helloService;

    /**
     * Controller para testarmos o resultado, que deve ser a visualização da mensagem de sucesso
     * antes da execução do método hello().
     * @return
     */
    @GetMapping("/hello")
    public String hello() {
        String mensagemRetorno = "Sucesso!";
        try {
            helloService.hello();
        } catch (InterruptedException e) {
            mensagemRetorno = "Erro.";
        }
        return mensagemRetorno;
    }

}
