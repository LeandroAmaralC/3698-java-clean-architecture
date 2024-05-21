package br.com.alura.codechella.infra.gateways;

import br.com.alura.codechella.application.gateways.RepositorioDeUsuario;
import br.com.alura.codechella.domain.entites.usuario.Usuario;

import java.util.List;

public class UsuarioDeRepositorioJpa implements RepositorioDeUsuario {
    @Override
    public Usuario cadastrarUsuario(Usuario usuario) {
        return null;
    }

    @Override
    public List<Usuario> listarTodos() {
        return null;
    }
}
