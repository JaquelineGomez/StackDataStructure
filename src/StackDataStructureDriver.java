public class StackDataStructureDriver
{
    public static void main(String[] args) {

        Stack test = new Stack();
        test.push(35);
        test.push(25);
        test.push(1);
        test.compress();
        test.push(34);

        System.out.println(test.getStack());
        test.pop();
        test.compress();

        System.out.println(test.getStack());
        System.out.println("The element at the beginning of the stack: "+ test.peek());
        System.out.println("Position of 25:\t"+test.search(25));
        System.out.println("Position of 13: "+test.search(13));
    }//end main method
}//end class StackDataStructureDriver
