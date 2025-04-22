package utilidades;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

class FechaTest {

    @org.junit.jupiter.api.Test
    void esValida() {
    }

    @org.junit.jupiter.api.Test
    void esBisiesto() {
        assertTrue(Fecha.esBisiesto(2004));
        assertTrue(Fecha.esBisiesto(2000));
        assertFalse(Fecha.esBisiesto(2025));
        assertFalse(Fecha.esBisiesto(2100));
    }

    @org.junit.jupiter.api.Test
    void diaDelAnio() {
        Fecha f1 = new Fecha(22,1,2025);
        assertEquals(22,f1.diaDelAnio());

        Fecha f2 = new Fecha(22,2,2025);
        assertEquals(53,f2.diaDelAnio());
    }

    @org.junit.jupiter.api.Test
    void diasEntreFechas() {

    }
}