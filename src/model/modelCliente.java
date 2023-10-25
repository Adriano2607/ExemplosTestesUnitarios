package model;

public class modelCliente {
    private static int ultimoId = 0;

    private int id;
    private String nome;
    private String sexo;
    private Integer telefone;
    private String endereco;

    public modelCliente(String nome, String sexo, Integer telefone, String endereco) {
        this.id = ++ultimoId;
        this.nome = nome;
        this.sexo = sexo;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public int getId() {
        return id;
    }

    public boolean validaTelefone(){
        String numeroStr = Integer.toString(telefone);
        return numeroStr.length() == 9;
    }

    public boolean dadosNulo() {
        return nome == null || nome.isEmpty() || sexo == null || sexo.isEmpty()  || endereco == null || endereco.isEmpty() || telefone == null;
    }


    public boolean validaNomeSemNumero() {
        return nome.matches(".*\\d.*");
    }



}
