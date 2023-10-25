package model;

public class modelCliente {

    private String nome;
    private String sexo;
    private String telefone;
    private String endereco;

    public modelCliente(String nome, String sexo, String telefone, String endereco) {
        this.nome = nome;
        this.sexo = sexo;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public boolean validaTelefone(modelCliente cliente){
        return cliente.getTelefone().length() == 9;
    }

    public Boolean dadosNulo(modelCliente cliente) {
        if (cliente.getNome().isEmpty() || cliente.getSexo().isEmpty() || cliente.getTelefone().isEmpty() || cliente.getEndereco().isEmpty()) {
            return null;
        }

        return true;
    }

    public boolean validaNome(modelCliente cliente) {
        return cliente.getNome().matches(".*\\d.*");
    }

//    public boolean validaNomeTipo(modelCliente cliente) {
//        return cliente.getNome() instanceof String;
//    }


}
