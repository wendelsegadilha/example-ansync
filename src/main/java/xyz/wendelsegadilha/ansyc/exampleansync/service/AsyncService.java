package xyz.wendelsegadilha.ansyc.exampleansync.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncService {

    /**
     * @Async para dizer ao Spring que o método hello() deve ser executado de forma assíncrona.
     * @throws InterruptedException
     */
    @Async
    public void hello() throws InterruptedException {
        /*
        Para simular um possível processamento que envolve um maior tempo,
        usamos o Thread.Sleep com 10 segundos de duração.
         */
        Thread.sleep(10000);
        System.out.println("Hello Async!");
    }

}
