package loops;

public class forLoop1 {
    public static void main(String[] args) {


        //loop -> is for repeating similar things over and over again
        //for(initializer;condition;update){body}
        //initializer will run only once when computer reaches the loop
        //condition -> this will decide when to terminate the loop (true/false question)
        //update -> usually its purpose is to make condition false
        //initializer->condition check->body->update->condition check->

        for(int i=0; i<10; i++){
            System.out.print(i+1 + " ");
        }

        //number++ increment same as (number = number + 1)
        //number-- decrement same as (number = number -1)

    }

}
