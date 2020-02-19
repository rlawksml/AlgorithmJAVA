import java.util.*;

// LIFO 마지막 입력이 첫음 나옴
// last in first out

// pop() 값 삭제
// push() 값 넣기
// Peek() 값 확인
// IsEmpty() 스텍 내부 확인

class Stack<T>{
	private Node<T> top;
	// Node를 통해서 입력값 저장 밑 입력 값 다음 값 설정
	class Node<T>{
		private T data;
		private Node<T> next;
		
		// 생성자 NODE를 통해서 Data, Next 수정
		public Node(T input){
			this.data = data;
		}
	}


	
	public T pop(){
		if(top == null){
		System.out.println("값이 없습니다.");
		}

		T item = top.data;
		top = top.next;
		return item;
	}

	public void push(T input){
		// 노드를 한개 생성한다.
		Node<T> t = new Node<T>(data);
		if(top == null){
			top = t;
		}
		t.next = top;
		top = t;


	}

	public T peek(){
		if(top == null){
			System.out.println("값이 없습니다.");
		}
		return top.data;
	}

	public boolean IsEmpty(){
		if(top == null){
			System.out.println("true");
		}
		System.out.println("false");
	}
}


public class Test{
	public static void main(Stirng args[]){

		Stack<Integer> Stack = new Stack<Integer>();
		Stack.push(10);
		Stack.push(3);
		System.out.println(Stack.peek());
		Stack.pop();
		System.out.println(Stack.peek());
		Stack.pop();
		System.out.println(Stack.peek());
	
	}
}
