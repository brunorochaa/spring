package rocha.bruno.exemploHelloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import rocha.bruno.exemploHelloWorld.model.Produto;

@RestController
public class ProdutoController {
    @GetMapping("/produtos")
    public String getProducts(){
        return "Área dos produtos!";
    }

    @GetMapping("/produto")
    public Produto getProduct() {
        Produto produto = new Produto();
        produto.setDescricao("Testando");
        return produto;
    }
}
