import java.util.stream.IntStream;
import java.util.Arrays;
public class Stack
{
    //variables
    private int[] stack;
    private int size;
    
    public Stack()
    {
        stack= new int[5];
        size=0;
    }

    /*adds value to array*/
    public void push(int num)
    {
        stack[size]=num;
        size++;
    }
    /*Removes value from array*/
    public void pop()
    {
        int[] newStack = new int[size-1];
        System.out.println("\tpop:"+stack[0]);
        for(int i=1;i<stack.length;i++)
        {
            newStack[i-1]=stack[i];
        }
        stack=newStack;
    }

    /*Outputs array*/
    public String getStack()
    {
        String array = "List:";
        for (int n: stack)
        {
            array+=n+", ";
        };
        return array;
    }

    /*
    * changes the array's size to fit the number of values
    */
    public void compress()
    {
        if(size< stack.length)
        {
            int[] newStack= new int[size];
            for (int i=0; (i<size);i++)
            {
                newStack[i]=stack[i];
            }
            stack=newStack;
        }
    }
}//end class Stack
