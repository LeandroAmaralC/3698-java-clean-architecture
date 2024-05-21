package br.com.alura.codechella.naousar.model;

import java.util.regex.Pattern;

public class ValidaCep {

    private static final String CEP_PATTERN = "^\\d{5}-\\d{3}$";
    private static final Pattern pattern = Pattern.compile(CEP_PATTERN);

    public static boolean cepValido(String cep) {
        return pattern.matcher(cep).matches();
    }

    public static void main(String[] args) {
        String cep = "12345-678";
        if (cepValido(cep)) {
            System.out.println("CEP válido.");
        } else {
            System.out.println("CEP inválido.");
        }
    }
}
