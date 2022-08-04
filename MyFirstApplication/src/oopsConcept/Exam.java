package oopsConcept;

public class Exam {

	public static void main(String[] args) {
		
		Question q1 = new Question();
		q1.createQuestion(1000016,"What is Object",'A',6);
		q1.showQuestionDetails();
		q1.changeQuestion("what is your name");
		System.out.println("After changing the question");
		q1.showQuestionDetails();
		
		Question q2 = new Question();
		q2.createQuestion(1000020,"What is ByteCode",'C',8);
		q2.showQuestionDetails();
		
		Question q3 = new Question();
		Question q4 = new Question();
		Question q5 = new Question();
		
		int totalMarks = q1.qWT + q2.qWT;
		if(totalMarks == 10)
		{
			System.out.println("Paper set properly");
		}
		else
		{
			if(q1.qWT < q1.qWT)
			{
				q1.changeQuestionWeight(10 - q2.qWT);
			}
			else
			{
				q2.changeQuestionWeight(10 - q1.qWT);
			}
		}
		
		System.out.println("__________________________________");
		
		q1.showQuestionDetails();
		q2.showQuestionDetails();
		
		

	}

}
