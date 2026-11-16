package lesson4;

public class Loops {


    /*

            for (int i = 0; @;*) {
              if(@) {
                 // ------- code here
              }
              *
            }
     */
    public void startLoops() {

        //Phase 1 - regular for loop
        for (int i = 0; i < 3; i++) {
            System.out.println(i);
        }

        //Phase 2 - i outside the loop
        int i = 0;
        for (i = 0; i < 3; i++) {
            System.out.println(i);
        }
        System.out.println(i);

        //Phase 3 - no need for initial i
        for (; i < 3; i++) {
            System.out.println(i);
        }
        System.out.println(i);


        //Phase 4 - no need for later action
        for (; i < 3;) {
            System.out.println(i);
            i += 2;
        }
        System.out.println(i);

        //Phase 5 - no need for real condition - exit with break
        for (; true;) {
            System.out.println(i);
            i += 2;
            if (i > 20) {
                break;
            }
        }
        System.out.println(i);

        continueFunc();
    }

    private void continueFunc() {
        //Phase 6
        for (int i = 0; i < 10; i += 2) {
            System.out.println(i);
        }

        for (int i = 0; ; i += 2) {
            if (i >= 10) {
                break;
            }
            System.out.println(i);
        }

        for (int i = 0; ; ) {
            if (i >= 10) {
                break;
            }
            System.out.println(i);
            i += 2;
        }

        for (int i = 0; ; i++) {
            if (i >= 10) {
                break;
            }
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        for (int i = 0; ; i++) {
            if (i >= 10) {
                break;
            }
            if (i % 2 != 0) {
                continue;
            }
            System.out.println(i);
        }
    }

    private void whileLoops() {
        int i = 0;
        while (true) {
            i++;

            if (i > 10) {
                break;
            }
        }
    }
}
