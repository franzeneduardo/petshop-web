package br.com.tt.petshop.repository;

import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class VacinaRepository {

    public List<String> listarVacinas(){
        return List.of("Anti pulgas", "Anti Rabica", "Trivalente");
    }

}
