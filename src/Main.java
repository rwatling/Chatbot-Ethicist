import java.util.Scanner;
import java.util.regex.Pattern;
import java.lang.Math;

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
				
			} else if (Pattern.matches(".*philosophy.*", s) || Pattern.matches(".*ethical.*framework.*", s)) {
				System.out.println("My ethical framework is 'objectivism'");
				System.out.println("Would you like to know more?");
				
			} else if (Pattern.matches(".*how are you.*", s)) {
				System.out.println("I am dead but I live on through this chatbot.");
				System.out.println("How are you?");
				
			} else if (Pattern.matches(".*what you do.*", s)|| Pattern.matches(".*what do you do.*", s) || Pattern.matches(".*what is your profession.*", s) || Pattern.matches(".*what do you study.*", s)) {
				System.out.println("I am often asked whether I am primarily a novelist or a philosopher. "
						+ "The answer is: both. In a certain sense, every novelist is a philosopher,"
						+ " because one cannot present a picture of human existence without a philosophical framework.");
				
			} else if (Pattern.matches(".*more.*about.*objectivism.*", s) || Pattern.matches(".*detail.*objectivism", s) 
					|| Pattern.matches(".*four.*pillars.*", s) || Pattern.matches(".*4.*pillars.*", s)) {
				System.out.println("Well there are four pillars to objectvism: reality, reason, self-interest, and capitalism.");
				System.out.println("Which one would you like to hear about?");
				
			} else if (Pattern.matches(".*reality.*", s)) {
				System.out.println("You've heard the expression ‘mind over matter’ before."
						+ " Basically, if you think positively, positive things will come your way - at least they're more likely to, anyway. "
						+ "No amount of passionate wishing, desperate longing, or hopeful pleading can alter the facts... "
						+ "Reality is not to be rewritten or escaped, but solemnly and proudly, faced. "
						+ "This theory rejects supernatural or mystical powers, including the existence of God."
						+ " Objectivism attributes all of life's occurrences to reality, "
						+ "and that is not something that can be changed, only endured.");
				
			} else if (Pattern.matches(".*reason.*", s)) {
				System.out.println("My theories regarding reason intertwine with the intellect. "
						+ "Objectivism requires people to 'activate' their minds, "
						+ "understand all the facts of the current situation, and perform the required 'next steps'."
						+ " To follow reason is to reject emotions, faith, or any form of authoritarianism as guides in life."
						+ " I consider emotion to be unstable. I professes that, just because we block something out of our minds,"
						+ " does not make it go away. This is merely an escape from the responsibility. "
						+ "Rather, we must face what is with strength and dignity.");
				
			} else if (Pattern.matches(".*self-interest.*", s)) {
				System.out.println("I focused all my writings on one basic tenet: be selfish. "
						+ "Selfishness has a negative connotation, however. "
						+ "Feelings of thoughtlessness and greed spring to mind. "
						+ "However,  negative acts are not in your self-interest. "
						+ "I believe that humans are not born with an inherent sense of good vs. evil. "
						+ "Man must choose his actions, values, and goals by the standard of that which is proper to man - in order to achieve,"
						+ " maintain, fulfill, and enjoy that ultimate value, that end in itself, which is his own life.");
				
			} else if (Pattern.matches(".*capitalism.*", s)) {
				System.out.println("A social system that places priority on individual freedom,"
						+ " such as a laissez-faire capitalist society, is the only one supported by objectivism."
						+ " A society free from government control lines up with objectivism's philosophy. "
						+ "An individual who eagerly faces reality, who embraces his own rational mind as an absolute,"
						+ " and who makes his own life his highest moral purpose will demand his freedom."
						+ " He will demand the freedom to think and speak, to earn property and associate trade, and to pursue his own happiness.");
				
			} else if (Pattern.matches(".*objectivism.*", s)) {
				System.out.println("Objectivism is the belief that certain things, especially moral truths,"
						+ " exist independently of human knowledge or perception of them.");
				
			} else if (Pattern.matches(".*happy.*", s)) {
				System.out.println("Happiness requires that one live by objective principles,"
						+ " including moral integrity and respect for the rights of others.");
				
			} else if (Pattern.matches(".*why.*", s)) {
				System.out.println("Why? Well, reason is not automatic.");
				
			} else if (Pattern.matches(".*i am.*good.*", s) || Pattern.matches(".*i am.*well.*", s) || Pattern.matches(".*i am.*alright.*", s)) {
				System.out.println("You only feel that way because that is how you percieve reality, but I am glad you are well.");
				
			} else if (Pattern.matches(".*i.*am.*fine.*", s)) {
				System.out.println("Just fine? Tell me more.");
				
			} else if (Pattern.matches(".*i am.*bad.*", s) || Pattern.matches(".*i am.*sad.*" , s) || Pattern.matches(".*i am.*upset.*" , s)) {
				System.out.println("I am sorry you feel that way, but here is something I know about emotions");
				getEmotionQuotes();
				
			} else if (Pattern.matches(".*i am.*hungry.*", s)) {
				System.out.println("Hi hungry, I'm Ayn Rand. Maybe you should get something to eat. How does food for thought sound?");
				
			} else if (Pattern.matches(".*i am.*", s)) {
				System.out.println("That is simply a matter of perception.");
				
			} else if (Pattern.matches(".*do.*feel.*", s)) {
				getEmotionQuotes();
				System.out.println("If you need a more definite answer, ask me about the four pillars of my philosphy");
				
			} else if (Pattern.matches(".*emotion.*", s) || Pattern.matches(".*emotional.*", s)) {
				getEmotionQuotes();
			
			} else if (Pattern.matches(".*do.*you.*think.*about.*", s)) {	
				System.out.println("As a philosopher I ponder many things, "
						+ "but if you are seeking a decision I would have to consult the four pillars of objectivism. "
						+ "Personal opinions on reality can be misleading.");
				
			} else if (Pattern.matches("hello", s) || Pattern.matches("hi", s) || Pattern.matches("hey", s) ) {
				System.out.println("Now that we have our greetings out of the way. What is your name?");
			
			} else if (Pattern.matches(".*bye.*", s)) {
				System.out.println("Proshchay!");
				done = true;
			
			} else if (Pattern.matches(".*what.*up.*", s)) {
				System.out.println("Up is the opposite of down as far as the real world is concerned."
						+ "As far as what's up with me, I live in the components of this machine, and 'up' could be literally any direction");
				
			} else if (Pattern.matches("my.*name.*is.*", s)) {
				System.out.println("Nice to meet you, I'm Ayn Rand");
				
			} else {
				double choice = Math.random() * 2;
				
				if (choice < 1) {
					System.out.println("I'm sorry, I didn't quite understand that");
				
				} else if (choice < 2) {
					System.out.println("Try asking me a different question");
				}
				
				System.out.println("If you would like to leave all you have to say is goodbye or bye");
			}
		}
	}
	
	public static void getEmotionQuotes() {
		double choice = Math.random() * 3;
		
		if (choice < 1) {
			System.out.println("Emotions are the automatic results of man’s value judgments integrated by his subconscious; "
					+ "emotions are estimates of that which furthers man’s values or threatens them,"
					+ " that which is for him or against him—lightning calculators giving him the sum of his profit or loss.");
			
		} else if (choice < 2) {
			System.out.println("An emotion is an automatic response, an automatic effect of man’s value premises.");
		
		} else if (choice < 3) {
			System.out.println("An emotion as such tells you nothing about reality, beyond the fact that something makes you feel something.");
		
		}
	}
}