public class StackDataStructureDriver
{
    public static void main(String[] args) {

        Stack test = new Stack();
        test.push(35);
        test.push(25);
        test.compress();
        System.out.println(test.getStack());
    }//end main method
}//end class StackDataStructureDriver
