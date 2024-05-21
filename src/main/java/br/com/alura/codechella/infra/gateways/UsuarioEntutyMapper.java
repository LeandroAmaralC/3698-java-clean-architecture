package br.com.alura.codechella.infra.gateways;

import br.com.alura.codechella.domain.entites.usuario.Usuario;
import br.com.alura.codechella.infra.persistence.UsuarioEntity;

public class UsuarioEntutyMapper {

   public  UsuarioEntity toEntity(Usuario usuario) {
       return new UsuarioEntity(usuario.getCpf(), usuario.getNome(), usuario.getNascimento(), usuario.getEmail());

   }

   public Usuario toDomain(UsuarioEntity entity) {
       return new Usuario (entity.getCpf(), entity.getNome(), entity.getNascimento(), entity.getEmail());
   }
}
