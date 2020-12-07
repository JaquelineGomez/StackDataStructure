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

}//end class Stack
