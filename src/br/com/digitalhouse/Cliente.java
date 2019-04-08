package br.com.digitalhouse;

class Cliente {
    private static String nome;
    private static String sobrenome;

    public static void setNome(String nome) {
        Cliente.nome = nome;
    }

    public static void setSobrenome(String sobrenome) {
        Cliente.sobrenome = sobrenome;
    }

    public static String getNome() {
        return nome;
    }

    public static String getSobrenome() {
        return sobrenome;
    }


}
