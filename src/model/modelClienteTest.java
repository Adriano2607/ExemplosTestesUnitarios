package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



class modelClienteTest {
    private modelCliente cliente;

    @BeforeEach
    void cfg() {
        cliente = new modelCliente("Nome", "Sexo", 123456789, "Endereço");
    }

    @Test
    @DisplayName("Verifica se o telefone tem 9 dígitos")
     void validaTelefone(){
        assertTrue(cliente.validaTelefone());
    }

    @Test
    @DisplayName("Verifica se os dados não são nulos")
    void validaNulo(){
       assertFalse(cliente.dadosNulo());
    }

    @Test
    @DisplayName("Verifica se o nome não contém números")
    void validanome(){
        assertFalse(cliente.validaNomeSemNumero());
    }


}