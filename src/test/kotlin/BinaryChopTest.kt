import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*



class BinaryChopTest {

    @Test
    fun testBinaryChop() {

        assertEquals(-1, chop(3, emptyList()))
        assertEquals(-1, chop(3, listOf(1)))
        assertEquals(0,  chop(1, listOf(1)))

        assertEquals(0,  chop(1, listOf(1, 3, 5)))
        assertEquals(1,  chop(3, listOf(1, 3, 5)))
        assertEquals(2,  chop(5, listOf(1, 3, 5)))
        assertEquals(-1, chop(0, listOf(1, 3, 5)))
        assertEquals(-1, chop(2, listOf(1, 3, 5)))
        assertEquals(-1, chop(4, listOf(1, 3, 5)))
        assertEquals(-1, chop(6, listOf(1, 3, 5)))

        assertEquals(0,  chop(1, listOf(1, 3, 5, 7)))
        assertEquals(1,  chop(3, listOf(1, 3, 5, 7)))
        assertEquals(2,  chop(5, listOf(1, 3, 5, 7)))
        assertEquals(3,  chop(7, listOf(1, 3, 5, 7)))
        assertEquals(-1, chop(0, listOf(1, 3, 5, 7)))
        assertEquals(-1, chop(2, listOf(1, 3, 5, 7)))
        assertEquals(-1, chop(4, listOf(1, 3, 5, 7)))
        assertEquals(-1, chop(6, listOf(1, 3, 5, 7)))
        assertEquals(-1, chop(8, listOf(1, 3, 5, 7)))

    }
}