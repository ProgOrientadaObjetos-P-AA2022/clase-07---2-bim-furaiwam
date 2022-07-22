package paquete1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Field;

import static org.junit.Assert.*;

public class EstudiantePresencialTest {
    private EstudiantePresencial instance;

    public EstudiantePresencialTest(){

    }
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        instance = new EstudiantePresencial();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testEstablecerNumeroCreditos() throws
            IllegalArgumentException,
            NoSuchFieldException,
            IllegalAccessException {
        System.out.println("establecerNumeroCreditos");
        int numero = 10;
        instance.establecerNumeroCreditos(numero);
        Field field = instance.getClass().getDeclaredField("numeroCreditos");
        field.setAccessible(true);
        assertEquals(field.get(instance), 10);
    }

    @Test
    public void testEstablecerCostoCredito() throws
    IllegalArgumentException,
    NoSuchFieldException,
    IllegalAccessException {
        System.out.println("establecerNumeroCreditos");
        int numero = 10;
        instance.establecerCostoCredito(numero);
        Field field = instance.getClass().getDeclaredField("numeroCreditos");
        field.setAccessible(true);
        assertEquals(field.get(instance), 10);
    }

    @Test
    public void testCalcularMatriculaPresencial() throws
            IllegalArgumentException,
            NoSuchFieldException,
            IllegalAccessException {
        System.out.println("establecerNumeroCreditos");
        int numero = 10;
        instance.calcularMatriculaPresencial(" ");
        Field field = instance.getClass().getDeclaredField("numeroCreditos");
        field.setAccessible(true);
        assertEquals(field.get(instance), 10);
    }

    @Test
    public void tetObtenerNumeroCreditos() {
        System.out.println("obtenerNumeroCreditos");
        int expResult = 10;
        instance.obtenerNumeroCreditos(10);
        String result = instance.obtenerNombresEstudiante();
        assertEquals(expResult, result);

    }

    @Test
    public void testObtenerCostoCredito() {
        System.out.println("obtenerCostoCreditos");
        int expResult = 32;
        instance.establecerNombresEstudiante( 32);
        String result = instance.obtenerCostoCredito();
        assertEquals(expResult, result);
    }

    @Test
    public void testObtenerMatriculaPresencial() {
        System.out.println("obtenerNombresEstudiante");
        String expResult = "rené";
        instance.establecerNombresEstudiante("René");
        String result = instance.obtenerNombresEstudiante();
        assertEquals(expResult, result);
    }
}