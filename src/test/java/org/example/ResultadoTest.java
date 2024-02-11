package org.example;

import junit.framework.TestCase;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.when;

public class ResultadoTest extends TestCase {

    @InjectMocks
    Main main;

    String var;


    @Mock
    Resultado resultado;

    @BeforeEach
    public void setUp() throws Exception {
        //super.setUp();
        var = "mensajeTest";
    }

    public void testMensaje() {
        when(resultado.mensaje(var)).thenReturn(var);
        assertFalse(resultado.mensaje(var).isEmpty());
    }
}