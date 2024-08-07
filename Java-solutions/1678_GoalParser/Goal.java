/**
 * Goal
 */
public class Goal {

    String interpret(String command) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < command.length(); i++){
            if(command.charAt(i) == 'G'){
                sb.append('G');
            }
            if(command.charAt(i) == '('){
                if(command.charAt(i + 1) == ')'){
                    sb.append('o');
                    i++;
                }else{
                    sb.append("al");
                    i += 3;
                }
            }
        }
        return sb.toString();
    }
}