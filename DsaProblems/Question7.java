import java.util.*;
public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String ip=sc.next();
            //Complete the code
            Stack<Character> st = new Stack<>();
             for(int i=0;i<ip.length();i++){
                 
                if(ip.charAt(i)=='(' || ip.charAt(i)=='['|| ip.charAt(i)=='{'){
                     st.push(ip.charAt(i));
                } 
                else if(!st.isEmpty() && (ip.charAt(i)==')' && st.peek()=='(' ) ){
                     st.pop();
                }
                 else if(!st.isEmpty() && (ip.charAt(i)=='}' && st.peek()=='{' ) ){
                     st.pop();
                }
                 else if(!st.isEmpty() && (ip.charAt(i)==']' && st.peek()=='[' ) ){
                     st.pop();
                }
                else{
                    st.push(ip.charAt(i));
                }
             }   
             System.out.println(st.isEmpty());     
		}
        sc.close();
		
    }
    
}
