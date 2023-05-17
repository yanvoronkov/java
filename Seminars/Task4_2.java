package Seminars;


public class Task4_2<T> {
	public static void main(String[] args) {

		//Реализуйте очередь с помощью LinkedList со следующими методами: enqueue() - помещает элемент в конец очереди,
		//dequeue() - возвращает первый элемент из очереди и удаляет его, first() - возвращает первый элемент из
		//очереди, не удаляя.

			MyQueue <Integer> queue = new MyQueue<Integer>();
			queue.enqueue(1);
			queue.enqueue(2);
			queue.dequeue();
			queue.first();

		}
}
