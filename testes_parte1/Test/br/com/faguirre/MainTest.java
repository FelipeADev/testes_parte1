package br.com.faguirre;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class MainTest {
    @Test
    public static void main (String[] args){

        List<Pessoa> pessoas = new Pessoa().registroPessoas();

        List<Pessoa> pessoasF = pessoas.stream()
                .filter(pessoa -> pessoa.getSexualidade().equals("Feminino"))
                .collect(Collectors.toList());
        System.out.println(pessoasF.toString());

        Assert.assertEquals("[Luiza, Lara, Carol]", pessoasF.toString());

    }
}