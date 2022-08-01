package tests;

import entities.Pessoa;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PessoaTests {


    Pessoa p1, p2, p3, p4 ,p5 ,p6 ,p7 ,p8, p9, p10;
    List<String> colecaoTest = new ArrayList<String>();

    @BeforeEach
    void doBefore() {
        p1 = new Pessoa("Ivo", "Ganda");
        p1.setDataNasc(LocalDate.of(2016, 3, 23));
        p2 = new Pessoa("Ana", "Musk");
        p2.setDataNasc(LocalDate.of(1966, 1, 3));
        p3 = new Pessoa("joe", "Morello");
        p3.setDataNasc(LocalDate.of(2010, 12, 4));
        p4 = new Pessoa("Rob", "Johnson");
        p4.setDataNasc(LocalDate.of(1976, 10, 25));
        p5 = new Pessoa("Ted", "Trujillo");
        p5.setDataNasc(LocalDate.of(2014, 5, 14));
        p6 = new Pessoa("Robert", "Traids");
        p6.setDataNasc(LocalDate.of(2000, 3, 30));
        p7 = new Pessoa("Renata", "Castro");
        p7.setDataNasc(LocalDate.of(2010, 1, 18));
        p8 = new Pessoa("Murilo", "Bianck");
        p8.setDataNasc(LocalDate.of(2015, 7, 11));
        p9 = new Pessoa("Candido", "Silveira");
        p9.setDataNasc(LocalDate.of(1975, 9, 1));
        p10 = new Pessoa("Camila", "Porto");
        p10.setDataNasc(LocalDate.of(2014, 5, 25));
    }

    @Test
    void imprimirObjetos() {
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
        System.out.println(p6);
        System.out.println(p7);
        System.out.println(p8);
        System.out.println(p9);
        System.out.println(p10);
    }

    @Test
    void adicionarColecao() {
        p1.adicionarNomes(p1);
        p2.adicionarNomes(p2);
        p3.adicionarNomes(p3);
        p4.adicionarNomes(p4);
        p5.adicionarNomes(p5);
        p6.adicionarNomes(p6);
        p7.adicionarNomes(p7);
        p8.adicionarNomes(p8);
        p9.adicionarNomes(p9);
        p10.adicionarNomes(p10);
    }

}
