package homework1.bracechecker;

public class Bracechecker {
    private String text;
    private char c;


    Bracechecker(String sentence) {
        text = sentence;


    }

    public void check() {
        Stack stk = new Stack();
        int pop;
        for (int i = 0; i < text.length(); i++) {
            c = text.charAt(i);
            switch (c) {
                case '[':
                case '{':
                case '(':
                    stk.push(c);
                    break;
                case ']':
                    pop = stk.pop();
                    if (pop == 0) {
                        System.out.println("Error: " + c + " closed, but not opened " + i);
                    } else if (pop != '[') {
                        System.out.println("Error: " + c + " closed.but opened " + (char) pop + " at " + i);
                    }
                    break;
                case '}':
                    pop = stk.pop();
                    if (pop == 0) {
                        System.out.println("Error: " + c + " closed, but not opened " + i);
                    } else if (pop != '{') {
                        System.out.println("Error: " + c + " closed.but opened " + (char) pop + " at " + i);
                    }
                    break;
                case ')':
                    pop = stk.pop();
                    if (pop == 0) {
                        System.out.println("Error: " + c + " closed, but not opened " + i);
                    } else if (pop != '(') {
                        System.out.println("Error: " + c + " closed.but opened " + (char) pop + " at " + i);
                    }
                    break;
            }
        }
        while (stk.getIndex()!=-1){
            System.out.println("Error: Opened " + (char)stk.pop() + " but not closed");
        }
    }
}




