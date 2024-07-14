package AA_Sheet;

//-------------------------------Person Class-------------------------------
class Person_Q {
    private String name;
    private int id;

    public Person_Q(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}

//-------------------------------Node Class-------------------------------
class Node_Q {
    private Person_Q person;
    private Node_Q next;

    public Node_Q(Person_Q person) {
        this.person = person;
        this.next = null;
    }

    public Person_Q getPerson() {
        return person;
    }

    public Node_Q getNext() {
        return next;
    }

    public void setNext(Node_Q next) {
        this.next = next;
    }
}

//-------------------------------Queue Class-------------------------------
class A04_Queue {
    private Node_Q front;
    private Node_Q rear;

    public A04_Queue() {
        this.front = null;
        this.rear = null;
    }

    //-------------------------------ENQUEUE/ADD: O(1)-------------------------------
    public void enqueue(Person_Q newPerson) {
        // Set node to fill the person in the queue
        Node_Q newNode = new Node_Q(newPerson);

        // If the queue is empty
        if (front == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.setNext(newNode);
            rear = newNode;
        }
    }

    //-------------------------------DEQUEUE/REMOVE: O(1)-------------------------------
    public Person_Q dequeue() {
        if (front == null) {
            return null;
        }
        // Save so it will be accessible later
        Person_Q person = front.getPerson();
        // If only one element is in the queue:
        if (front == rear) {
            front = null;
            rear = null;
        } else {
            front = front.getNext();
        }
        return person;
    }

    //-------------------------------SEARCH: O(n)-------------------------------
    public boolean search(int value) {
        Node_Q current = front;
        while (current != null) {
            if (current.getPerson().getId() == value) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    //-------------------------------DISPLAY-------------------------------
    public void display() {
        Node_Q current = front;
        while (current != null) {
            System.out.println("Person ID: " + current.getPerson().getId() + ", Name: " + current.getPerson().getName());
            current = current.getNext();
        }
    }
}

//-------------------------------Main Class-------------------------------
class test4 {
    public static void main(String[] args) {
        A04_Queue queue = new A04_Queue();

        Person_Q person1 = new Person_Q("Alice", 1);
        Person_Q person2 = new Person_Q("Bob", 2);
        Person_Q person3 = new Person_Q("Charlie", 3);

        queue.enqueue(person1);
        queue.enqueue(person2);
        queue.enqueue(person3);

        System.out.println("Queue after enqueuing 3 persons:");
        queue.display();

        System.out.println("\nDequeue operation:");
        Person_Q dequeuedPerson = queue.dequeue();
        if (dequeuedPerson != null) {
            System.out.println("Dequeued Person: " + dequeuedPerson.getName());
        }

        System.out.println("\nQueue after dequeuing one person:");
        queue.display();

        System.out.println("\nSearch for Person with ID 2:");
        boolean found = queue.search(2);
        System.out.println("Person with ID 2 found: " + found);
    }
}
