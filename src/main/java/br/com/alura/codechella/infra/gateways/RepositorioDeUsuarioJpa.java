package br.com.alura.codechella.infra.gateways;

import br.com.alura.codechella.application.gateways.RepositorioDeUsuario;
import br.com.alura.codechella.domain.entites.usuario.Usuario;
import br.com.alura.codechella.infra.persistence.UsuarioEntity;
import br.com.alura.codechella.infra.persistence.UsuarioRepository;

import java.util.List;

public class RepositorioDeUsuarioJpa implements RepositorioDeUsuario {

    private final UsuarioRepository repositorio;

    private final UsuarioEntutyMapper mapper;

    public RepositorioDeUsuarioJpa(UsuarioRepository repositorio,  UsuarioEntutyMapper mapper) {
        this.repositorio = repositorio;
        this.mapper = mapper;
    }

    @Override
    public Usuario cadastrarUsuario(Usuario usuario) {
        UsuarioEntity entity = mapper.toEntity(usuario);
        repositorio.save(entity);
        Usuario usuarioSalvo = mapper.toDomain(entity);
        return usuarioSalvo;
    }

    @Override
    public List<Usuario> listarTodos() {
       // return repositorio.findAll();
        return null;
    }
}
