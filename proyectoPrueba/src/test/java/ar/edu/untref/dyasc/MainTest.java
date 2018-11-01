package ar.edu.untref.dyasc;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

public class MainTest {

    @Test
    public void test() {
        File archivo = new File("prueba.txt");
        assertTrue(archivo.exists());
    }

}
