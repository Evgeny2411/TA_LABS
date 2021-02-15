package Lab2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Перше завдання ітеративним методом:");
        new IterativeMethod().iterativeMethod();
        System.out.println("Перше завдання рекурсивним методом:");
        new RecursionMethod().recursionMethod(1, 0);
        System.out.println("");
        try {
            System.out.println("Друге завдання:");
            System.out.println(new AkkermanFunction().akkermanFunction(4, 4));
        }catch (StackOverflowError ex) {
            System.err.println("Ваш компухтер занадто слабкий((");
        }
    }
}
