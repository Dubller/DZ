package com.example.demo3;

import java.util.Map;
import java.util.TreeMap;

public class Model {

    TreeMap<String, String> elementKeyValue = new TreeMap<>();


    public boolean unit (String input) {
        boolean result = false;
        String[] cell = input.split(" ");
        if (cell.length == 2 && !elementKeyValue.containsKey((cell[0]))) {
            if (checkEng(cell[0]) && checkRuss(cell[1])) {
                elementKeyValue.put(cell[0], cell[1]);
                result = true;
            }
        }
        return result;
    }

    public boolean checkEng(String value) {
        return value.matches("^[a-zA-Z]+$");
    }

    public boolean checkRuss(String value) {
        return value.matches("^[а-яА-Я]+$");
    }
    public void removeElementKeyValue(String key) {elementKeyValue.remove(key);}
    public String editorByKey(String key) {
String result=key + " " +elementKeyValue.get(key);
elementKeyValue.remove(key);
return result;
    }
}
