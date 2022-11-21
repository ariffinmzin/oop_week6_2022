class Week6 {

    //statement 1
    //statement 1
    //statement 1
    //statement 1
    //statement 1
    //statement 2
    //statement 3

    //selection statement
    //repetition statement

    public void singleIfExample() {

        double mark = 90.0;

        if(mark==80.0) {

            System.out.println("Mark is equal to 80");
        }

    }

    public void ifElseExample() {

        double mark = 90.0;

        if(mark==80.0) {

            System.out.println("Mark is equal to 80");
        }
        else {

            System.out.println("Mark is not equal to 80");

        }

    }

    public void multiIfElseExample() {

        double mark = 90.0;

        if(mark>=80.0 && mark<=100) {

            System.out.println("You get an A");
        }
        else if(mark>=70.0 && mark<=79.0) {

            System.out.println("You get B");
        }
        else if(mark==100.0) {

            System.out.println("Mark is equal to 100");
        }
        else {

            System.out.println("Mark is not equal to 80, 90 or 100");

        }

    }

    public void switchCaseExample() {

        int mark = 90;
        char letterOne = 'A'; 

        //int, char, string

        switch(letterOne) {

            case 'A' : System.out.println("Letter is equal to A");
            break;

            case 'a' : System.out.println("Mark is equal to a");
            break;

            default : System.out.println("Letter is not equal to either a or A");
            break;

        }        

    }

    public void whileExample() {

        String sentence = "Hello";
        int i = 0;
             
        while(i<10){

            System.out.println(sentence);
            i++; //1

        }
    }

    public void doWhileExample() {

        String sentence = "Hello";
        int i = 0;
             
        do{

            System.out.println(sentence);
            i++; //1

        }while(i<10);

    }

    public void forExample() {

        String sentence = "Hello";

        for(int i=0;i<10;i++) {

            System.out.println(sentence);

        }

    }



    public static void main(String[] args) {

        Week6 w1 = new Week6();
        //w1.singleIfExample();
        //w1.ifElseExample();
        //w1.multiIfElseExample();
        //w1.switchCaseExample();
        //w1.whileExample();
        //w1.doWhileExample();
        w1.forExample();

    }


}