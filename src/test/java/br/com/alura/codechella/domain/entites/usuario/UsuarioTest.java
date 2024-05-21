package br.com.alura.codechella.domain.entites.usuario;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class UsuarioTest {
    @Test
    public void naoDeveCadastrarCPFComFormatoInvalido() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new Usuario("123.456.789-99", "Jaque", LocalDate.parse("1990-09-08"), "emailcom"));
    }

    @Test
    public void deveCriarUsuarioFabricaDeUsuario(){
        FabricaDeUsuario fabrica = new FabricaDeUsuario();
        Usuario usuario = fabrica.comNomeCPFNascimento("Emily", "654.123.897-88", LocalDate.parse("2000-10-01"));

        Assertions.assertEquals("Emily", usuario.getNome() );

        usuario = fabrica.incluirEndereco("12345-999", 40, "apto 201");

        Assertions.assertEquals( "apto 201", usuario.getEndereco().getComplemento());
    }
}
