package oopsConcept;

public class Question {
	
	int qId,qWT;
	String qText;
	char answer;
	
	public void createQuestion(int id,String q,char ans,int wt)
	{
		qId = id;
		qText = q;
		answer = ans;
		qWT = wt;
		System.out.println("Questions is created");
	}
	
	public void showQuestionDetails()
	{
		System.out.println("Question ID is:"+qId);
		System.out.println("Question is:"+qText);
		System.out.println("Question answer is:"+answer);
		System.out.println("Question weight is:"+qWT);
	}
	
	public void changeQuestion(String newQuestion)
	{
		qText = newQuestion;
		System.out.println("Question is updated");
	}
	
	public void changeQuestionWeight(int newWT)
	{
		qWT = newWT;
		System.out.println("Question weightage is updated");
	}

}
