import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //exemplo de uso da classe Pair com tipos distintos
        Pair<String, Integer> p1 = new Pair<>("Hello", 123);
        System.out.println("Par 1: (" + p1.getFirst() + ", " + p1.getSecond() + ")");

        Pair<Double, Character> p2 = new Pair<>(3.14, 'A');
        System.out.println("Par 2: (" + p2.getFirst() + ", " + p2.getSecond() + ")");

        //instancia a classe Manager
        Manager gerente = new Manager("João");
        ArrayList<Employee> empregados = new ArrayList<>();
        //atribui um objeto Manager para o ArrayList de Employee
        empregados.add(gerente);

        System.out.println("Objeto adicionado ao ArrayList: " + empregados.get(0));
    }
}