package taskapp.application;
import org.beryx.textio.*;
import taskapp.model.*;

public class Main{
	public static void main(String[]args)
	{
		TextIO textIO=TextIoFactory.getTextIO();
		TextTerminal terminal=textIO.getTextTerminal();
		TaskManager taskManager=new TaskManager();

		boolean quit=false;
		while (!quit){
			terminal.println();
			TodoCommand command=textIO.newEnumInputReader(TodoCommand.class).withAllValuesInline().read("Coose Coomand?");
			switch (command)
			{
				case EXIT:
					terminal.println("Bye");
					quit=true;
					break;
				case COUNT:
					terminal.println("Tasks:"+taskManager.getNumberOfTasks());
					break;

			}


		}
	}
	public enum TodoCommand{
		EXIT, COUNT
	}
}