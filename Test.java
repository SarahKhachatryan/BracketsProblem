import java.lang.reflect.Array;
import java.util.Stack;

public class Test {
    public static boolean brackets(String str)
    {
        String[] arr= str.split("");
        Stack s = new Stack();
        for(int i=0;i<arr.length;i++)
        {
            switch (arr[i])
            {
                case "(":
                {
                    s.push("(");
                } break;
                case "{":
                {
                    s.push("{");
                } break;
                case "[":
                {
                    s.push("[");
                } break;
                case ")":
                {
                    if(!s.isEmpty()&&s.peek()=="(")
                    {
                        s.pop();
                    }
                    else{
                      return false;
                    }
                }break;
                case "]":
                {
                    if(!s.isEmpty() &&s.peek()=="[")
                    {
                        s.pop();
                    }
                    else{
                        return false;
                    }
                }break;
                case "}":
                {
                    if(!s.isEmpty() && s.peek()=="{")
                    {
                        s.pop();
                    }
                    else{
                        return false;
                    }
                }break;
            }
        }
        if(s.isEmpty())
            return true;
        return false;
    }

    public static void main(String[] args) {
        String str= "{()]jshd}[jdh]";
        if(brackets(str))
        {
            System.out.println("Is balanced");
        }
        else
        {
            System.out.println("Not Balanced");
        }


    }
}
