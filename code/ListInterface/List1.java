/*
-> Iterable
    -> Collection
        -> List
            -> ArrayList
            -> LinkedList
            -> Vector
                -> Stack

    -> Sequence Collection -> List
        -> getFirst()
        -> getLast()
        -> addFirst() 
        -> addLast()
        -> removeFirst()
        -> removeLast()

List Properties
    -> Elements have a position
    -> Duplicates are allowed
    -> Insertion order is preserved
    -> You can access elements by Index

    E get(index)
    set(index, E value)
    example: set(1,6) // replace and put value 6 in 1st position

    add(1, 6) // right shift the previous values and insert 6 in the existing list

    addAll(index, Collection <? extends E>)

    remove(index);

    indexOf(Object o); // first index of a multiple occuring value

    lastIndexOf(Object o); // last index of a multiple occuring value

    listIterator() 
        -> forward iteration
        -> backward iteration
        -> insert
        -> remove

    listIterator(int index) // iterate from specific index

    of() // List<Integer> l = list.of(1,2,3);

    copyOf() // same copy of another list


*/

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class List1 {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);

        System.out.println(l.get(1));
        l.set(1, 5);
        System.out.println(l);

        l.addAll(0, List.of(9,8,7));
        System.out.println(l);

        l.remove(0);
        System.out.println(l);

        ListIterator<Integer> iterator = l.listIterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}