package cmd;
    import BotLogic.Skills;
    import java.util.Scanner;

public class kek {
    private Scanner input;
    private Skills skills;
   public kek(){
       skills = new Skills();
       input = new Scanner(System.in);
   }
    public void responseForCMD() {
        while(true) {
            String messageFromCMD = input.nextLine();
            StringBuilder Answer = new StringBuilder("");
            String[] messageWords = messageFromCMD.split(" ");
            if (messageWords[0].charAt(0) == '/') {
                    Answer.append(Skills.useCommand(messageWords[0]));
            }else {
                Answer.append(Skills.toDefaultAnswer());
            }

            System.out.println(Answer);
        }
    }
}