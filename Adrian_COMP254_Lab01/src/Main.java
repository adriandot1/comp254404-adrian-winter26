import linkedlists.DoublyLinkedList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> L = new DoublyLinkedList<>();
        DoublyLinkedList<Integer> M = new DoublyLinkedList<>();

        // Populate L: [10, 20, 30]
        L.addLast(10); L.addLast(20); L.addLast(30);

        // Populate M: [40, 50]
        M.addLast(40); M.addLast(50);

        System.out.print("List L: "); L.display();
        System.out.print("List M: "); M.display();

        L.concat(M);

        System.out.print("Concatenated List L': ");
        L.display();
        System.out.println("New size: " + L.size());
    }



}