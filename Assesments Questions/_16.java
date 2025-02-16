// 16.Given a string containing "L" and "R", where "L" means move the robot left  and 
// "R" means move the robot right, start from the origin (0) and return "L" if the final 
// position is on the left, "R" if it is on the right, or " " if it remains at the origin. 
public class _16 {

    public static void main(String[] args) {
        String commands = "LLRRRL"; 
        String result = finalPosition(commands);
        System.out.println("Final position: \"" + result + "\""); 
    }

    public static String finalPosition(String commands) {
        int position = 0; 

      
        for (char command : commands.toCharArray()) {
            if (command == 'L') {
                position--;
            } else if (command == 'R') {
                position++;
            }
        }

        
        if (position < 0) {
            return "L"; 
        } else if (position > 0) {
            return "R"; 
        } else {
            return " "; 
        }
    }

}
