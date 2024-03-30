package Control;

public class Main {
    public static void main(String[] args) {
        System.out.println("Создаём двусвязный список testList");
        MyLinkedList<Integer> testlist = new MyLinkedList<>();
        System.out.println("Размер: "+ testlist.size());
        System.out.println("В коде видно, что мы не задаём размер сразу, т.к. у двусвязного списка динамический размер");
        System.out.println("Добавим 3 элемента: 5, 7 и 10");
        testlist.add(5);
        testlist.add(7);
        testlist.add(10);
        System.out.println("Размер: "+ testlist.size());
        System.out.println("Индекс: 0 Элемент: "+testlist.get(0));
        System.out.println("Индекс: 1 Элемент: "+testlist.get(1));
        System.out.println("Индекс: 2 Элемент: "+testlist.get(2));
        System.out.println("Удалим элемент под индексом 1 и проверим, сместятся ли следующий элемент");
        testlist.remove(1);
        System.out.println("Размер: "+ testlist.size());
        System.out.println("Индекс: 0 Элемент: "+testlist.get(0));
        System.out.println("Индекс: 1 Элемент: "+testlist.get(1));
        System.out.println("Можно удалить всё сразу");
        testlist.clear();
        System.out.println("Размер: "+ testlist.size());
    }
}
