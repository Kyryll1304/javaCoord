import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    void testGetters() {
        Point point = new Point(3, 4);
        assertEquals(3, point.getX());
        assertEquals(4, point.getY());
    }

    @Test
    void testSetters() {
        Point point = new Point(3, 4);
        point.setX(5);
        point.setY(6);
        assertEquals(5, point.getX());
        assertEquals(6, point.getY());
    }

    @Test
    void testDistanceTo() {
        Point point1 = new Point(1, 2);
        Point point2 = new Point(4, 6);
        assertEquals(5.0, point1.distanceTo(point2));
    }

    @Test
    void testDistanceBetween() {
        Point point1 = new Point(1, 2);
        Point point2 = new Point(4, 6);
        assertEquals(5.0, Point.distanceBetween(point1, point2));
    }

    @Test
    void testEquals() {
        Point point1 = new Point(1, 2);
        Point point2 = new Point(1, 2);
        Point point3 = new Point(3, 4);
        assertEquals(point1, point2);
        assertNotEquals(point1, point3);
    }

    @Test
    void testToString() {
        Point point = new Point(3, 4);
        assertEquals("(3, 4)", point.toString());
    }

    @Test
    void testClone() {
        Point point1 = new Point(3, 4);
        Point point2 = point1.clone();
        assertNotSame(point1, point2);
        assertEquals(point1, point2);
    }
}
