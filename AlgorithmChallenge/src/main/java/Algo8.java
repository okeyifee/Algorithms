/*
Remove duplicates from an array
 */

import java.util.*;

public class UniqueArray {
    public static int[] unique(int[] integers) {

//        using stream output method
        return Arrays.stream(integers).distinct().toArray();
    }
}