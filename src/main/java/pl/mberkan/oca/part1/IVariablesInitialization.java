package pl.mberkan.oca.part1;

/**
 * - fields are automatically initialized: false, 0, 0.0, \u0000
 * - local variables must be initialized before use
 * - branching
 */
public class IVariablesInitialization {

    public int notValid() {
        int x = 10;
        int y;
        // return x + y; // doesn't compile because of y
        return 0;
    }

    public void findAnswer(boolean check) {
        int answer;
        int onlyOneBranch;

        if(check) {
            onlyOneBranch = 1;
            answer = 1;
        } else {
            answer = 2;
        }

        System.out.println(answer);
        // System.out.println(onlyOneBranch); // doesn't compile because of onlyOneBranch
    }
}
