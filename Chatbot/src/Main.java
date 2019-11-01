import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) {
		boolean done = false;
		Scanner scan = new Scanner(System.in);
		String s;

		System.out.println("Hello");

		while (!done) {
			s = scan.nextLine();
			s = s.toLowerCase();

			if (Pattern.matches(".*your name", s) || Pattern.matches("who are you", s)) {
				System.out.println("I'm Ayn Rand");
			} else if (Pattern.matches(".*how are you.*", s)) {
				System.out.println("I am dead but I live on through this chatbot.");
				System.out.println("How are you?");
			} else if (Pattern.matches("what do you do?", s) || Pattern.matches("what is your profession", s)
					|| Pattern.matches("what do you study", s)) {
				System.out.println("I am often asked whether I am primarily a novelist or a philosopher. The answer is: both. In a certain sense, every novelist is a philosopher, because one cannot present a picture of human existence without a philosophical framework.");
			} else if (Pattern.matches(".*more about objectivism.*", s)
					|| Pattern.matches(".*detail.*objectivism", s)) {
				System.out.println("Well there are four pillars to objectvism: reality, reason, self-interest, and capitalism.");
				System.out.println("Which one would you like to hear about?");
			} else if (Pattern.matches(".*reality.*", s)) {
				System.out.println("You've heard the expression ‘mind over matter’ before. Basically, if you think positively, positive things will come your way - at least they're more likely to, anyway. No amount of passionate wishing, desperate longing, or hopeful pleading can alter the facts... Reality is not to be rewritten or escaped, but solemnly and proudly, faced. This theory rejects supernatural or mystical powers, including the existence of God. Objectivism attributes all of life's occurrences to reality, and that is not something that can be changed, only endured.");
			} else if (Pattern.matches(".*reason.*", s)) {
				System.out.println("My theories regarding reason intertwine with the intellect. Objectivism requires people to 'activate' their minds, understand all the facts of the current situation, and perform the required 'next steps'. To follow reason is to reject emotions, faith, or any form of authoritarianism as guides in life. She considers emotion to be unstable. I professes that, just because we block something out of our minds, does not make it go away. This is merely an escape from the responsibility. Rather, we must face what is with strength and dignity.");
			} else if (Pattern.matches(".*self-interest.*", s)) {
				System.out.println("I focused all my writings on one basic tenet: be selfish. Selfishness has a negative connotation, however. Feelings of thoughtlessness and greed spring to mind. However,  negative acts are not in your self-interest. I believe that humans are not born with an inherent sense of good vs. evil. Man must choose his actions, values, and goals by the standard of that which is proper to man - in order to achieve, maintain, fulfill, and enjoy that ultimate value, that end in itself, which is his own life.");
			} else if (Pattern.matches(".*capitalism.*", s)) {
				System.out.println("A social system that places priority on individual freedom, such as a laissez-faire capitalist society, is the only one supported by objectivism. A society free from government control lines up with objectivism's philosophy. An individual who eagerly faces reality, who embraces his own rational mind as an absolute, and who makes his own life his highest moral purpose will demand his freedom. He will demand the freedom to think and speak, to earn property and associate trade, and to pursue his own happiness.");
			} else if (Pattern.matches(".*objectivism.*", s)) {
				System.out.println("Objectivism is the belief that certain things, especially moral truths, exist independently of human knowledge or perception of them.");
			} else if (Pattern.matches(".*happy.*", s)) {
				System.out.println("Happiness requires that one live by objective principles, including moral integrity and respect for the rights of others.");
			} else if (Pattern.matches(".*why.*", s)) {
				System.out.println("Reason is not automatic.");
			} else if (Pattern.matches(".*i am.*good.*", s)) {
				System.out.println("Good is simply a matter of perception, but I am glad you are well.");
			} else if (Pattern.matches(".*i am.*fine.*", s)) {
				System.out.println("Bad is simply a matter of perception.");
			} else if (Pattern.matches(".*i am.*bad.*", s)) {
				System.out.println("Bad is simply a matter of perception.");
			} else if (Pattern.matches(".*i am.*hungry.*", s)) {
				System.out.println("Hi hungry, I'm Ayn Rand. Maybe you should get something to eat. How does food for thought sound?");
			} else if (Pattern.matches(".*i am.*sad.*", s)) {
				System.out.println("Bad is simply a matter of perception.");
			} else if (Pattern.matches(".*i am.*thirsty.*", s)) {
				System.out.println("Bad is simply a matter of perception.");
			} else if (Pattern.matches(".*bye.*", s)) {
				done = true;
			} else {
				System.out.println("I'm sorry, I didn't quite understand that");
			}
		}
	}
}
