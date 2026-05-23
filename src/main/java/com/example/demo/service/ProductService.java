package com.example.demo.service;
import com.example.demo.entity.Produto;
import com.example.demo.entity.User;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;

@Service
public class ProductService {
    List<Produto> lista =  new ArrayList<>();

    public ProductService(){
        this.lista.add(new Produto(1, "Faca de Cozinha", "uma bela faca", 10.50, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSUkjQvtfGOIRPb88Z5t8l_aKonVr0eoK-IeA&s"));
        this.lista.add(new Produto(2, "Veja", "veja bem", 14.99, "https://www.vejalimpeza.com.br/static/ac24c49dab9e97a2ca1ef47252f2dc0c/9ade2/Veja_Multiuso_Lavanda_500ml.webp"));
    }
    public Produto buscarPorId(int id){
        for (int i = 0; i <= lista.size(); i++){
            if(this.lista.get(i).getId() == id){
                return this.lista.get(i);
            }
        }
        return null;
    }

}
