import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>(List.of("Java", "Python", "C#", "Kotlin", "JavaScript"));
        //1. creacion del stream
        nombres.stream()
                //2. Operacion intermedia
                .filter(s -> s.contains("J"))
                //3. Operacion terminal
                .forEach(System.out::println);
    }
}