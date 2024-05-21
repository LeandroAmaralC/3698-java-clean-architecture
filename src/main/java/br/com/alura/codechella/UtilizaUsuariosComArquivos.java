package br.com.alura.codechella;

import br.com.alura.codechella.domain.entities.usuario.Usuario;
import br.com.alura.codechella.infra.gateways.RepositorioDeUsuarioEmArquivo;

import java.time.LocalDate;

public class UtilizaUsuariosComArquivos {

    public static void main(String[] args) {
        RepositorioDeUsuarioEmArquivo repositorioDeUsuarioEmArquivo = new RepositorioDeUsuarioEmArquivo();
        repositorioDeUsuarioEmArquivo.cadastrarUsuario(new Usuario("456.789.888-88", "Joao", LocalDate.parse("2000-10-15"), "joao@dot.com"));

        repositorioDeUsuarioEmArquivo.cadastrarUsuario(new Usuario("456.789.888-88", "Joao", LocalDate.parse("2000-10-15"), "joao@dot.com"));

        repositorioDeUsuarioEmArquivo.cadastrarUsuario(new Usuario("456.789.888-88", "Joao", LocalDate.parse("2000-10-15"), "joao@dot.com"));

      System.out.println(repositorioDeUsuarioEmArquivo.listarTodos());
    }
}
