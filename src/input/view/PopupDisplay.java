package input.view;

import javax.swing.JOptionPane;
/**
 * This class provides popups for input and output.
 * @author mhop1073
 */
public class PopupDisplay
{
/**
 * Provides a popup box for asking a question and allows the user to submit a text answer.
 * Returns the user response as a String.
 * @param input The supplied question for the popup.
 * @return The user's answer to the question.
 */
	public String getAnswer(String input)
	{
		String answer = "";
			
		answer = JOptionPane.showInputDialog(null, input);
		
		return answer;
	}
	/**
	 * This allows for the popup to be displayed and respond to the answer as a sing.
	 * @param input Display popup window 
	 */
	public void displayResponse(String input)
	{
		JOptionPane.showMessageDialog(null, input);
	}
}
