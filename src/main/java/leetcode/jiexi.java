package leetcode;

import javax.swing.plaf.nimbus.State;
import java.util.Stack;

public class jiexi {
    public boolean parseBoolExpr(String expression) {
        Stack<String> stack=new Stack<String>();
        Stack<String> stack1=new Stack<String>();
        int f=0;
        int t=0;

        for(int i=0;i<expression.length();i++){
            if(expression.charAt(i)=='('||expression.charAt(i)==','){
                continue;

            }else if(expression.charAt(i)!=')'){
                stack.push(String.valueOf(expression.charAt(i)));


            }
            else if(expression.charAt(i)==')'){
                for(int u=0;u<expression.length();u++){
                    //stack1.push(stack.pop());
                    String peek=stack.peek();
                    if((peek.equals("!"))||(peek.equals("&"))||(peek.equals("|"))){
                        stack1.push(stack.pop());
                        break;
                    }else{
                        stack1.push(stack.pop());
                    }




                }
                for(int y=0;y<stack1.size();y++){
                    if(stack1.peek().equals("!")){
                        stack1.pop();
                        if(stack1.peek().equals("t")){
                            stack.push("f");
                            break;
                        }else if(stack1.peek().equals("f")){
                            stack.push("t");
                            break;
                        }


                    }else if(stack1.peek().equals("&")){
                        stack1.pop();
                        for(int s=0;s<expression.length();s++){
                            if(!stack1.empty()){
                                if(stack1.pop().equals("f")) {

                                    f++;
                                    break;
                                }
                            }else {
                                break;
                            }

                        }
                        if(f!=0){
                            stack.push("f");
                            f=0;
                            break;
                        }else {
                            stack.push("t");
                            break;
                        }

                    }else if(stack1.peek().equals("|")){
                        stack1.pop();


                        if(!stack1.empty()){

                        }
                        for(int s=0;s<expression.length();s++){

                            if(!stack1.empty()){
                                if(stack1.pop().equals("t")) {

                                    t++;
                                    break;
                                }
                            }else {
                                break;
                            }

                        }
                        if(t!=0){
                            stack.push("t");
                            t=0;
                            break;
                        }else {
                            stack.push("f");
                            break;
                        }

                    }



                }



                while (!stack1.empty()){
                    stack1.pop();
                }


            }





        }
        return stack.pop() == "t";
    }
//    public String operaration(Stack<String> stack){
//
//
//
//
//
//
//        return "t";
//    }

    public static void main(String[] args) {
        jiexi jiexi=new jiexi();
        boolean re=jiexi.parseBoolExpr("!(&(f,t))");
        System.out.println(re);
    }
}
