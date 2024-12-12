package com.csc;

public class QueueTees<T> {
  int SIZE = 5; //size of the array
  T[] items; //array to contain cutie objects
  int front;
  int rear;

  @SuppressWarnings("unchecked")
  QueueTees() { //initialize an empty queue
    items = (T[]) new Object[SIZE];
    front = -1;
    rear = -1;
  }

  boolean isFull() { 
    if (rear == SIZE - 1) { //if 
      return true;
    }
    return false;
  }

  boolean isEmpty() {
    if (front == -1) {
      return true;
    } 
    else {
      return false;
    }
  }

  void enQueue(T element) {
    if (isFull()) {
      System.out.println("Cannot add Cutie -- Queue is full");
    }
    else {
      if (front == -1) { //if queue is empty, increment front
        front++;
      }
      rear++;  //increment rear pointer to allow room for the new cutie object
      items[rear] = element; //set the cuties array at the last index to the cutie object
      System.out.println("Added " + element + " to the queue.");
    }
  }

  
  T deQueue() {
    if (isEmpty()) {
      System.out.println("Queue is empty");
      return null;
    }
    T element = items[front]; //set the cutie object to the object at the front index
    if (front >= rear) { // if Q has only one element, delete, then reset the queue 
      front = -1;
      rear = -1;
    }
    else {
      front++;
    }
    System.out.println(element + " was deleted from the queue");
    return(element);
  }

  void display() {
    if (isEmpty()) {
      System.out.println("Queue is empty");
    }
    else {
      System.out.println("Front Index: " + front);
      System.out.println("Items: ");
      for (int i = front; i <= rear; i++) {
        System.out.println(items[i] + " ");
      }
      System.out.println("Rear Index: " + rear);
    }
  }

  int size() {
    if (isEmpty()) {
      return 0;
    }
    return ((rear - front) + 1);
  }

  void clear() {
    if (isEmpty()) { // if empty, can't clear
      System.out.println("Cannot clear -- Queue is empty");
    } else {
      for (int i = front; i <= rear; i++) { // loop through elements in the queue, assign null values
        items[i] = null;
      }

      //reset queue, popping elements
      front = -1;
      rear = -1;
      System.out.println("QUEUE CLEARED");
    }
  }

  public static void main(String[] args) {
    Puppy puppy = new Puppy();
    Bunny bunny = new Bunny();
    Panda panda = new Panda();

    QueueTees<Cutie> queue = new QueueTees<>();
    /* 
    System.out.println("Queue Size: " + queue.size());

    queue.enQueue(puppy);
    queue.enQueue(bunny);
    queue.enQueue(panda);

    queue.size();
    queue.display();

    System.out.println("Queue Size: " + queue.size());

    queue.deQueue();
    queue.deQueue();
    queue.deQueue();

    queue.display();
    System.out.println("Queue Size: " + queue.size());

    */
    queue.enQueue(puppy);
    queue.enQueue(bunny);
    queue.enQueue(panda);

    System.out.println("Queue Size: " + queue.size());
    queue.display();

    queue.clear();
    queue.display();
    System.out.println("Queue Size: " + queue.size());
  }
}
