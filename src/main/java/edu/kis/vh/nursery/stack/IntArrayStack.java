package edu.kis.vh.nursery.stack;

public class IntArrayStack implements IntStack{

    public static final int NUMBERS_SIZE = 12;
    public static final int TOTAL_START_VALUE = -1;
    private final int[] numbers = new int[NUMBERS_SIZE];

    public int total = TOTAL_START_VALUE;

    /**
     *
     * @param in liczba którą chcemy dodać do naszej wyliczanki
     *           (jest równe z dołożeniem tej liczby na stos)
     */
    @Override
    public void push(int in) {
        if (!isFull()) {
            numbers[++total] = in;
        }
    }

    /**
     * Sprawdza czy na stosie znajdują się już jakieś elementy
     * @return true gdy stos jest pusty lub false gdy na stosie są jakieś elementy
     */
    @Override
    public boolean isEmpty() {
        return total == -1;
    }

    /**
     * Sprawdza czy stos jest pełny
     * @return true gdy stos jest pełny lub false gdy możliwe jest dodanie kolejnych elementów
     */
    @Override
    public boolean isFull() {
        return total == 11;
    }

    /**
     *
     * @return Zwraca liczbę będącą ostatnią na stosie (liczbę bierzącą)
     */
    @Override
    public int top() {
        if (isEmpty())
            return -1;
        return numbers[total];
    }

    /**
     * Zdejmuje pierwszą liczbę ze stosu
     * @return liczba będąca pierwsza do zdjęcia ze stosu. Liczba ta jest usuwana ze stosu
     */
    @Override
    public int pop() {
        if (isEmpty())
            return -1;
        return numbers[total--];
    }
}
