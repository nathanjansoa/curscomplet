package exercicio;

import java.util.NoSuchElementException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.Queue;

public class Queues {
	public static void start() {
        //  (head) <- oooooooooooooooooooooooo <- (tail) FIFO (first in, first out)
        java.util.Queue<Integer> q1 = new ArrayBlockingQueue<Integer>(3);
        // Usando o add quando adiciona um numero maior que o definido retorna IllegalStateException
        q1.add(10);
        q1.add(20);
        q1.add(30);
        // Retorna o 
        System.out.println("Head of queue is: " + q1.element());
        
        try {
            q1.add(40);
        } catch (IllegalStateException e) {
            System.out.println("Tried to add too many items to the queue.");
        }
        
        for(Integer value: q1) {
            System.out.println("Queue value: " + value);
        }
        
        System.out.println("Removed from queue: " + q1.remove());
        System.out.println("Removed from queue: " + q1.remove());
        System.out.println("Removed from queue: " + q1.remove());
        
        try {
            System.out.println("Removed from queue: " + q1.remove());
        } catch (NoSuchElementException e) {
            System.out.println("Tried to remove too many items from queue");
        }
        ////////////////////////////////////////////////////////////////////
        Queue<Integer> q2 = new ArrayBlockingQueue<Integer>(2);
        //Aceita nulo
        System.out.println("Queue 2 peek: " + q2.peek());
        // Usando o offer retorna false se tentar colocar mais do que o definido.
        q2.offer(10);
        q2.offer(20);
        
        System.out.println("Queue 2 peek: " + q2.peek());
        
        if(q2.offer(30) == false) {
            System.out.println("Offer failed to add third item.");
        }
        
        for(Integer value: q2) {
            System.out.println("Queue 2 value: " + value);
        }
        
        System.out.println("Queue 2 poll: " + q2.poll());
        System.out.println("Queue 2 poll: " + q2.poll());
        System.out.println("Queue 2 poll: " + q2.poll());
    }

}
