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
    
    public void push(int num)
    {
        stack[size]=num;
        size++;
    }

    public String getStack()
    {
        String array = "";
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
