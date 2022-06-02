import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SILab2Test {

    private List<String> createList(String... elems){
        return new ArrayList<>(Arrays.asList(elems));
    }

    @Test
    void testEveryStatementAndEveryBranch(){
        IllegalArgumentException ex = Assertions.assertThrows(IllegalArgumentException.class,() -> SILab2.funcion(createList()));
        Assertions.assertTrue(ex.getMessage().contains("List length should be greater than 0"));

        ex = Assertions.assertThrows(IllegalArgumentException.class,() -> SILab2.funcion(createList("0", "#", "0", "0", "0")));
        Assertions.assertTrue(ex.getMessage().contains("List length should be a perfect square"));

        Assertions.assertEquals(createList("#", "1", "1", "#", "3", "#", "2", "#", "2"),
                SILab2.funcion(createList("#", "0", "0", "#", "0", "#", "0", "#", "0")));
    }
}
