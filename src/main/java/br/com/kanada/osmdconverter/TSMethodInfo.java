package br.com.kanada.osmdconverter;

import java.util.ArrayList;
import java.util.List;

public class TSMethodInfo {
    public boolean found = false;
    public String className;
    public String name;
    public String returnType = "";
    public String visibility = "";
    public String staticModifier = "";
    public List<Parameter> parameters = new ArrayList<>();

    public static class Parameter {
        public String name = "";
        public String type = "";
        public boolean optional = false;
    }
}
