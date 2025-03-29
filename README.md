# JavaDSA

Studies about Java Data Structures and Algorithms in the [Udemy course](https://www.udemy.com/course/data-structures-and-algorithms-java/) :

- [X] LinkedList
      <p><b> Methods </b>: printList, append, removeLast, prepend, removeFirst, get, set, insert, remove and reverse
- [X] Doubly LinkedList
         <p><b> Methods </b>: printList, append, removeLast, prepend, removeFirst, get, set, insert, remove

- [X] Stacks 
	<p><b> Methods </b>: push, pop
- [X] Queues
      	<p><b> Methods </b>: enqueue, dequeue
- [X] Trees
	<p><b> Methods </b>: insert, contains
- [ ] Hash Tables
- [ ] Graphs
- [ ] Heaps
- [ ] Recursion
- [ ] Tree Traversal
- [ ] Basic Sorts
- [ ] Merge Sort
- [ ] Quick Sort



# Highlights in LinkedList
I'm truly passionate about LinkedList. It's a way to create a data structure, with Node object. 
Which Node object has it owns value and the reference to the next node, so it creates a chain. 
<p>It's possible to figure out where is the end of the LinkedList in two ways:</p>

1. where is the the Node which points to the Tail reference
2. When the next node is null
   
<p>Time complexity of which method:</p>

- prepend = O(1)
- append = O(n) 
- removeFirst = O(1)
- removeLast = O(n)
- insert = O(n)
- remove = O(n)
- get/set = O(n)

<b>KeyNotes:</b> 

1. In a singly linkedlist, operations like append and removeLast would have time complexity of O(n) instead of O(1), as you would need to traverse the
list to reach the last node, even with the reference of tail retrieved. The point is, to make this operations, we also have to point the second-to-last node point null 
to the next atribute and to make this action is only possible traversing the list.

2. In Java, LinkedList was built as a DoublyLinkedList, so the time complexity to addLast and removeLast is O(1).

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
# Stack vs Queue
<p>Stack -> LIFO ---> Last in First Out</p>
<p>Queue -> FIFO ---> First in First Out</p>

# Key notes:

<p> Among all the algoritms that I've encountered so far, which include Linked List, Doubly Linked List, Stack, Queue and Binary Tree: the methods for insertion are crucial to remember,  how to handle the cases when the structure is empty! This is the first step that have to be taken! Obs.: method for insertion for Queue is called as enqueue and for the Stack is called as push! </p>
<b><p>Linked List and Doubly Linked List</b> => check lenght, if it is zero, head and tail must be null, so just point them to the new node;</p>
<b><p>Stack</b> => check height, if it is zero, top must be null, so just point it to the new node;</p> 
<b><p>Queue</b> => check lenght, if it is zero, first and last must be null, so just point them to the new node;</p> 
<b><p>Binary Tree </b>=> check root, must be null, so just point it to the new node;</p>

# Highlights in Trees
## Terminology:

![image](https://github.com/user-attachments/assets/3a1b2285-3e6c-4cf1-9fae-5bac53361292)

![image](https://github.com/user-attachments/assets/bbc03dd0-30e4-4f26-a8b6-338177f73454)

![image](https://github.com/user-attachments/assets/05695777-f528-4715-9ed5-da31353843c6)

![image](https://github.com/user-attachments/assets/8271cb6d-bfa9-4e87-8fbc-01084ec9b777)

![image](https://github.com/user-attachments/assets/7c481a19-b120-4bba-98e4-1c529051758c)

<p> Although the images here always illustrate a binay tree, tree can also have more than two children. This is not a strict rule!</p>

<p> <b>The rule</b> is Trees can not have more than one parent! <b>Spoiler Alert! </b> When a 'Tree' has more than one parent, it's a <b>Graph</b>, not a <b>Tree!</b></p>

## Leaf vs Node

<p><b>Node</b>: It's a basic unit of the tree, that contains data and may have reference to others node (children).</p>

<p><b>Leaf</b>: It's a basic unit of the tree, that contains data but doens't have reference to others node(children). It's essentialy the endpoint of a path in the tree. </p>










