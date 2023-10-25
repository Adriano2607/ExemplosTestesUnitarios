package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import javax.swing.*;

import static javax.swing.JOptionPane.*;
import static org.junit.jupiter.api.Assertions.*;



class modelClienteTest {
    String nome = JOptionPane.showInputDialog("Nome: ");
    String sexo = JOptionPane.showInputDialog("Sexo: ");
    String telefone = JOptionPane.showInputDialog("Telefone: ");
    String endereco = JOptionPane.showInputDialog("Endereço: ");
    modelCliente cliente = new modelCliente(nome,sexo,telefone,endereco);

    @Test
    @DisplayName("verifica 9 digitos telefone")
     void validaTelefone(){
        assertTrue(cliente.validaTelefone(cliente));
    }

    @Test
    @DisplayName("Verifica Nulo")
    void validaNulo(){
       assertNull(cliente.dadosNulo(cliente));
    }

    @Test
    @DisplayName("true se tiver numero no nome")
    void validanome(){
        assertTrue(cliente.validaNome(cliente));
    }




}