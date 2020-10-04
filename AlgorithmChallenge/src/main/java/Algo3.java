

import java.util.Map;

public class HtmlColorParser {
    private final Map<String, String> presetColors;

    public HtmlColorParser(Map<String, String> presetColors) {
        this.presetColors = presetColors;
    }


    public RGB parse(String color) {
//       Checks if keys(names of preset colour in lowercase exist)
        if (presetColors.containsKey(color.toLowerCase())){
            return parse(presetColors.get(color.toLowerCase()));
        }

//       checks if string(colour) contains color name and 3-digit hexadecimal
        if (color.length() == 4){
            return parse("#" + color.charAt(1) +
                    color.charAt(1) + color.charAt(2) +
                    color.charAt(2) + color.charAt(3) + color.charAt(3));
        } else {
            return new RGB(
                    Integer.parseInt(color.substring(1,3),16),
                    Integer.parseInt(color.substring(3,5),16),
                    Integer.parseInt(color.substring(5,7),16));
        }
    }
}