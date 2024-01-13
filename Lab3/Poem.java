package Lab3;
// KHAN MOHD OWAIS RAZA
// 20BCD7138
// 01/12/2021
public class Poem {
    private String name;
    private int lines;
    public Poem(String name, int lines) {
        this.name = name;
        this.lines = lines;
    }
    public String getName() {
        return name;
    }
    public int getLines() {
        return lines;
    }
}