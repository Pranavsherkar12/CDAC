class Queue{
int size = 5;
int Q[] = new int[size];
int front, rear;
Queue(){
front = -1;
rear = -1;
	}
boolean isEmpty(){
return (front == -1);
	}
boolean isFull (){
return (rear == size-1);
	}
void enqueue(int x){
if(isFull()){
System.out.println("Queue is full !");
		}
else{
if(front == -1){
front = 0;// set front to 0 if queue is empty
}
rear++;
Q[rear] = x;
System.out.println(x + " Inserted");
		}
	}
int dequeue(){
//Already empty queue
if(isEmpty()){
System.out.println("Queue is empty!");
return -1;
		}
else{
int x = Q[front];
System.out.println(x+ " Deleted");
if (front > rear){
front = -1;
rear = -1;
}else{
front++;
}
return x;
		}
	}
void display(){
if(isEmpty()){
System.out.println("Empty Queue !");
	}else{
System.out.print("Queue elements: ");
for(int i = front;i <= rear; i++){
System.out.print(Q[i]+" ");
			}
System.out.println();
		}
}
public class a3q6{
public static void main(String[] args){
Queue q=new Queue();
enqueue(5);
enqueue(10);
dequeue;
}
}
