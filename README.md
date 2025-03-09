# JavaDSA

Studies about Java Data Structures and Algorithms in the Udemy course (https://www.udemy.com/course/data-structures-and-algorithms-java/):

- [X] LinkedList
      <p><b> Methods </b>: printList, append, removeLast, prepend, removeFirst, get, set, insert, remove and reverse
- [ ] Doubly LinkedList
         <p><b> Methods </b>: printList, append, removeLast, prepend, removeFirst, get, set, insert, remove

- [ ] Stacks and Queues
- [ ] Trees
- [ ] Hash Tables
- [ ] Graphs
- [ ] Heaps
- [ ] Recursion
- [ ] Tree Traversal
- [ ] Basic Sorts
- [ ] Merge Sort
- [ ] Quick Sort


# Highlights in LinkedList
## Remove method
<b>Before:</b>
```java
public Node remove(int index) {
      if (index < 0 || index > lenght) return null;
	if (index == 0) return removeFirst();
	if (index == lenght) return removeLast();

      // get the node to be removed
	Node temp = get(index);
	//get the previous node of the one to be removed
	Node prev = get(index - 1);
	prev.next = temp.next;
	temp.next = null;
	lenght--;

	return temp;
}
```
<b>After</b>:
```java
public Node remove(int index) {
      if (index < 0 || index > lenght) return null;
	if (index == 0) return removeFirst();
	if (index == lenght) return removeLast();
      
      //get the previous node of the one to be removed
      Node prev = get(index - 1);

      //get the node to be removed
      //Method get is a time complexity of O(n)
      //Node temp = get(index);
      //Faster way to grab the node to be removed instead of get
      Node temp = prev.next; 
      prev.next = temp.next;
      temp.next = null;
      lenght--;

      return temp;
}
```

## Reversing LinkedList
<img width="600" alt="image" src="https://github.com/user-attachments/assets/4d842317-6b9f-4766-9b2b-591b5a68b6f8" />


# Highlights in DoublyLinkedList
## Get Method:
<b>Before:</b>
```java
public Node get(int index) {
		
		if (index < 0 || index >= length ) return null;
		
		Node temp = head;
		
		for(int i = 0 ; i < index; i ++) {
			temp = temp.next;
		}
		
		return temp;
	}
```

<b>After</b>:
<p>Making more eficient: </p>

```java
public Node get(int index) {
	if (index < 0 || index >= length ) return null;
		
		Node temp = head;
		if (index < length/2) {
			for(int i = 0 ; i < index; i ++) {
				temp = temp.next;
			}
		} else {
			temp = tail;
			for (int i = length - 1; i > index; i--) {
				temp = temp.prev;
			}
		}
		return temp;
	}
 }
```
