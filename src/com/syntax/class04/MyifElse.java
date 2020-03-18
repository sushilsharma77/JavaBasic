package com.syntax.class04;

public class MyifElse {
	public static void main(String[] args) {
		// if student completed a quiz we will check for a score
		// if score >90 --> great job
		// if score > 80 --> well done
		// if score > 70 --> you could have done better
		// if student did not completed the quiz -->
		// not good please do homework ontime

		boolean quizCompleted = true;
		int score = 76;
		if (quizCompleted) {
			System.out.println("We will check for a score");
			if (score > 90) {
				System.out.println("great job");
			}
			if (score > 80) {
				System.out.println("Well done");
			}
			if (score > 70) {
				System.out.println("You could have done better");
			}
			if (score < 60) {
				System.out.println("You failed");
			}

		}

		else {
			System.out.println("Not good please do homework on time");

		}

	}
}
