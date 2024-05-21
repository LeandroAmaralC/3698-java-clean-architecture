package br.com.alura.codechella.naousar.model;

import java.util.regex.Pattern;

public class ValidaTelefone {

    private static final String PHONE_NUMBER_PATTERN = "^\\d{4}-\\d{4}$";
    private static final Pattern pattern = Pattern.compile(PHONE_NUMBER_PATTERN);

    public static boolean telefoneValido(String phoneNumber) {
        return pattern.matcher(phoneNumber).matches();
    }

    public static void main(String[] args) {
        String phoneNumber = "1234-5678";
        if (telefoneValido(phoneNumber)) {
            System.out.println("Número de telefone válido.");
        } else {
            System.out.println("Número de telefone inválido.");
        }
    }
}
