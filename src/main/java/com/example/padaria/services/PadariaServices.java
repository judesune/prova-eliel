package com.example.padaria.services;

import com.example.padaria;
import com.example.padaria.PadariaApplication.models.PadariaModel;
import com.example.padaria.repositories.PadariaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PadariaServices {

   @Autowired
   private PadariaRepository padariaRepository;

   public List<PadariaModel> findAll(){
       return  padariaRepository.findAll();
   }

   public PadariaModel buscarPorId(Long id){
       return  padariaRepository.findById(id).get();
   }

   public PadariaModel criarPessoa(PadariaModel padariaModelModel) {
       return  padariaRepository.save(padariaModel);
   }

    public void deletar(Long id){
       padariaRepository.deleteById(id);
    }
    
    public PadariaModel atualizar(Long id, PadariaModel padariaModel){
       PadariaModel func = padariaRepository.findById(id).get();
       func.setNome(padariaModel.getNome());
       func.setCpf(padariaModel.getEndereco());
       return  padariaRepository.save(func);
    }


}
