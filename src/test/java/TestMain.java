import org.example.Direct;
import org.example.Robot;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class TestMain {
    @Test
    public static void main(String[] args) {
        Set<Object> trace = new HashSet<>();
        Robot robot = new Robot(1, 1);

        //
        assertEquals(robot, new Robot(1, 1));


        // Проверка equals()
        assertEquals(robot.equals(new Robot(1, 1)), true);
        assertEquals(robot.equals(new Robot(1, 2)), false);

        // Проверка equals() на 1000 объектов класса Robot
        for (int i = 1; i < 1000; i++) {
            assertTrue(robot.equals(new Robot(1, i)));
            robot.step(Direct.UP);
        }
        //
        trace.clear();
        //
        Robot robot1 = new Robot(1, 1);
        assertTrue(trace.add(robot1)); // 1, 1

        //Проверка hashCode() - своство записи уникального объекта в  <Object>HashSet()
        assertTrue(trace.add(robot1.step(Direct.UP))); // 1, 2
        assertTrue(trace.add(robot1.step(Direct.UP))); // 1, 3
        assertFalse(trace.add(robot1.step(Direct.DOWN))); //1,2
        assertFalse(trace.add(robot1.step(Direct.DOWN))); //1, 1
        assertTrue(trace.add(robot1.step(Direct.RIGHT))); //2, 1
        assertFalse(trace.add(robot1.step(Direct.LEFT))); //1, 1

        // тысяча шагов вправо и запись 1000 уникальных объектов в <Object>HashSet();
        for (int i = 0; i < 1000; i++) trace.add(robot1.step(Direct.RIGHT));

        assertFalse(trace.add(robot1.step(Direct.LEFT))); //1000, 1
        assertTrue(trace.add(robot1.step(Direct.UP))); //1000, 2

    }
}
