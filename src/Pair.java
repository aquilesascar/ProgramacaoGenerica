public class Pair<T extends Comparable<T>, U extends Comparable<U>> implements Comparable<Pair<T, U>> {
    private T first;
    private U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    @Override
    public int compareTo(Pair<T, U> other) {
        // Compara com base no primeiro elemento
        int result = this.first.compareTo(other.getFirst());
        // Se forem iguais, compara com base no segundo elemento
        if (result == 0) {
            result = this.second.compareTo(other.getSecond());
        }
        return result;
    }
}