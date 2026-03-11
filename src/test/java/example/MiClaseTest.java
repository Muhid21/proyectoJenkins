package example;

import org.junit.Test;
import static org.junit.Assert.*;

public class test {

    @Test
    public void testDiaLaboral_Lunes() {
        assertTrue("Lunes debería ser un día laboral", MiClase.dia_laboral("Lunes"));
    }

    @Test
    public void testDiaLaboral_Martes() {
        assertTrue("Martes debería ser un día laboral", MiClase.dia_laboral("Martes"));
    }

    @Test
    public void testDiaLaboral_Miercoles() {
        assertTrue("Miércoles debería ser un día laboral", MiClase.dia_laboral("Miercoles"));
    }

    @Test
    public void testDiaLaboral_Jueves() {
        assertTrue("Jueves debería ser un día laboral", MiClase.dia_laboral("Jueves"));
    }

    @Test
    public void testDiaLaboral_Viernes() {
        assertTrue("Viernes debería ser un día laboral", MiClase.dia_laboral("Viernes"));
    }

    @Test
    public void testDiaNoLaboral_Sabado() {
        assertFalse("Sábado no debería ser un día laboral", MiClase.dia_laboral("Sabado"));
    }

    @Test
    public void testDiaNoLaboral_Domingo() {
        assertFalse("Domingo no debería ser un día laboral", MiClase.dia_laboral("Domingo"));
    }
}
