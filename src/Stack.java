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
        if(size==stack.length)
        {
            int[] newStack= new int[size+1];
            for (int i=0; (i<size);i++)
            {
                newStack[i]=stack[i];
            }
            stack=newStack;
        }
        stack[size]=num;
        size++;
    }

    /*Removes value from array*/
    public void pop()
    {
        int[] newStack = new int[size-1];
        System.out.println("\tpop:"+stack[0]);
        for(int i=1;i<size;i++)
        {
            newStack[i-1]=stack[i];
        }
        stack=newStack;
        size-=1;
    }

    /*Shows the first element of list (does not remove or add anything)*/
    public int peek()
    {
       return stack[0];
    }

    /*Determines whether an element is in the stack
    * If element found → returns position
    * else returns -1
    * */

    public int search(int num)
    {
        int position= -1;

        for (int i=0;i<size;i++)
        {
            if(stack[i]==num)
            {
                position=i;
            }
        }
        return position;
    }

    /*Outputs array*/
    public String getStack()
    {
        String array = "List: ";
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
        int newSize=0;
        if(size< stack.length)
        {
            int[] newStack= new int[size];
            for (int i=0; (i<size);i++)
            {
                newStack[i]=stack[i];
                newSize++;
            }
            stack=newStack;
            size=newSize;
        }
    }
}//end class Stack
