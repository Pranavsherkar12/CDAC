import java.util.*;
public class a3q4{
// A utility function to return precedence of a given operator.Higher returned value means higher precedence
static int Prec(char ch) {
switch (ch) {
case '+':
case '-':
return 1;
case '*':
case '/':
return 2;
case '^':
return 3;
    }
return -1;
  }
// The main method that converts given infix expression to postfix expression.
static String q5(String exp) {
// initializing empty String for result
String result = new String("");
// initializing empty stack
Stack < Character > stack = new Stack < > ();
for (int i = 0; i < exp.length(); ++i) {
char c = exp.charAt(i);
// If the scanned character is an operand, add it to output.
if(Character.isLetterOrDigit(c))
result += c;
// If the scanned character is an '(', push it to the stack.
else if (c == '(')
stack.push(c);
// If the scanned character is an ')', pop and output from the stack until an '(' is encountered.
else if (c == ')') {
while(!stack.isEmpty() &&
stack.peek() != '(')
result += stack.pop();
stack.pop();
      } else // an operator is encountered
	 {
while (!stack.isEmpty() && Prec(c) <=
Prec(stack.peek())) {
result += stack.pop();
        }
stack.push(c);
      } }
// pop all the operators from the stack
while (!stack.isEmpty()) {
if(stack.peek() == '(')
return "Invalid Expression";
      result += stack.pop();
    }
return result;
  }
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String s5="A+B*C";
String s52="A*B+C/D";
System.out.println(q5(s5));
System.out.println(q5(s52));
	}
}
 
