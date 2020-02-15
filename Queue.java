import java.util.*;

// FIFO 처음 입력이 먼저 나오는 것

// Add() 값 추가
// Remove() 값 삭제
// Peek() 값 확인
// IsEmpty() 큐 내부 확인

class Queue<T>{

	// Node를 통해서 입력값 저장 밑 입력 값 다음 값 설정
	class Node<T>{
		private T data;
		private Node<T> next;
		
		// 생성자 NODE를 통해서 Data, Next 수정
		public Node(T data){
			this.data = data;
		}
	}

	private Node<T> Last;
	private Node<T> First;
	
	public void add(T data){
		// 노드를 한개 생성한다.
		Node<T> t = new Node<T>(data);

		// 마지막 인지 아닌지 확인
		if(last != null){
			last.next = t;
		}
		last = t;
		if(first == null){
			first = last;
		}

	}

	public void remove(T data){
		if(first == null){
			System.out.println("값이 없습니다.");
		}
		T data = first.data;
		first = first.next;

		if(first == null){
			last = null;
		}
		System.out.println(data);
	}

	public T peek(){
		if(first == null){
			System.out.println("값이 없습니다.");
		}
		return first.data;
	}

	public boolean IsEmpty(){
		if(first == null){
			System.out.println("true");
		}
		System.out.println("false");
	}
}


public class Test{
	public static void main(Stirng args[]){

		Queue<Integer> queue = new Queue<Integer>();
		queue.add(10);
		queue.add(3);
		System.out.println(queue.peek());
		queue.remove();
		System.out.println(queue.peek());
		queue.remove();
		System.out.println(queue.peek());
	
	}
}
