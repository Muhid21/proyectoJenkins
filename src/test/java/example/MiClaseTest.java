package example;

// Use ONLY JUnit 5 (Jupiter) imports
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

// The class name MUST match the filename "MiClaseTest.java"
public class MiClaseTest {

    @Test
    public void testDiaLaboral_Lunes() {
        assertTrue(MiClase.dia_laboral("Lunes"), "Lunes debería ser un día laboral");
    }

    @Test
    public void testDiaLaboral_Martes() {
        assertTrue(MiClase.dia_laboral("Martes"), "Martes debería ser un día laboral");
    }

    @Test
    public void testDiaLaboral_Miercoles() {
        assertTrue(MiClase.dia_laboral("Miercoles"), "Miércoles debería ser un día laboral");
    }

    @Test
    public void testDiaLaboral_Jueves() {
        assertTrue(MiClase.dia_laboral("Jueves"), "Jueves debería ser un día laboral");
    }

    @Test
    public void testDiaLaboral_Viernes() {
        assertTrue(MiClase.dia_laboral("Viernes"), "Viernes debería ser un día laboral");
    }

    @Test
    public void testDiaNoLaboral_Sabado() {
        assertFalse(MiClase.dia_laboral("Sabado"), "Sábado no debería ser un día laboral");
    }

    @Test
    public void testDiaNoLaboral_Domingo() {
        assertFalse(MiClase.dia_laboral("Domingo"), "Domingo no debería ser un día laboral");
    }
}
