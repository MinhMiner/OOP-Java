import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.Week4;

public class Week4Test {
    @Test
    public void testMax2Int1(){
        assertEquals(5, Week4.max2Int(3, 5));
    }

    @Test
    public void testMax2Int2(){
        assertEquals(-8, Week4.max2Int(-8, -20));
    }

    @Test
    public void testMax2Int3(){
        assertEquals(155, Week4.max2Int(-155, 155));
    }

    @Test
    public void testMax2Int4(){
        assertEquals(727, Week4.max2Int(727, 727));
    }

    @Test
    public void testMax2Int5(){
        assertEquals(2124798520, Week4.max2Int(2124789520, 2124798520));
    }

    @Test
    public void testMinArray1(){
        assertEquals(12, Week4.minArray(new int[] {16, 28, 192, 847, 12, 75, 14}));
    }

    @Test
    public void testMinArray2(){
        assertEquals(-551, Week4.minArray(new int[] {-492, 847, 9127, -551, -192, -5, 9, 78427}));
    }

    @Test
    public void testMinArray3(){
        assertEquals(0, Week4.minArray(new int[] {9, 0, 2, 0, 5, 0, 13}));
    }

    @Test
    public void testMinArray4(){
        assertEquals(10, Week4.minArray(new int[] {10, 13, 16, 19, 22}));
    }

    @Test
    public void testMinArray5(){
        assertEquals(1, Week4.minArray(new int[] {1}));
    }

    @Test
    public void testCalculateBMI1() {
        assertEquals("Thiếu cân", Week4.calculateBMI(50, 1.75));
    }

    @Test
    public void testCalculateBMI2() {
        assertEquals("Bình thường", Week4.calculateBMI(65, 1.75));
    }

    @Test
    public void testCalculateBMI3() {
        assertEquals("Thừa cân", Week4.calculateBMI(75, 1.75));
    }

    @Test
    public void testCalculateBMI4() {
        assertEquals("Béo phì", Week4.calculateBMI(95, 1.75));
    }

    @Test
    public void testCalculateBMI5() {
        assertEquals("Bình thường", Week4.calculateBMI(70, 1.80));
    }
}