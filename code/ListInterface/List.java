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

    


*/