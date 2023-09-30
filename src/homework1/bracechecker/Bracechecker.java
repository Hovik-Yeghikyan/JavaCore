package homework1.bracechecker;

public class Bracechecker {
    private String text;

    Bracechecker(String sentence) {
        text = sentence;
    }

    public void check() {
        Stack stk = new Stack();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            switch (c) {
                case '[':
                case '{':
                case '(':
                    stk.push(c);
                    break;
                case ']':
                    if (stk.index == -1) {
                        System.out.println("Error:closed ] at " + i);
                        break;
                    }
                    if (stk.lastchar() == '[') {
                        stk.pop();
                        break;
                    }
                    if (stk.lastchar() == '{') {
                        System.out.println("Error: opened { but closed at ] " + i);
                        break;
                    }
                    if (stk.lastchar() == '(') {
                        System.out.println("Error: opened ( but closed at ] " + i);
                        break;
                    }

                case '}':
                    if (stk.index == -1) {
                        System.out.println("Error: closed } at " + i);
                        break;
                    }
                    if (stk.lastchar() == '{') {
                        stk.pop();
                        break;
                    }
                    if (stk.lastchar() == '[') {
                        System.out.println("Error: opened [ but closed at } " + i);
                        break;
                    }
                    if (stk.lastchar() == '(') {
                        System.out.println("Error: opened ( but closed at } " + i);
                        break;
                    }


                case ')':
                    if (stk.index == -1) {
                        System.out.println("Error: closed ) at " + i);
                        break;
                    }
                    if (stk.lastchar() == '(') {
                        stk.pop();
                        break;
                    }
                    if (stk.lastchar() == '[') {
                        System.out.println("Error: opened [ but closed at ) " + i);
                        break;
                    }
                    if (stk.lastchar() == '{') {
                        System.out.println("Error: opened { but closed at ) " + i);
                        break;
                    }
            }
        }
    }
}

