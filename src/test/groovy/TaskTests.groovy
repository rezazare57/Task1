import spock.lang.Specification
import taskapp.application.*
import taskapp.model.*


class TasksTests extends Specification{
	def "new task list has no tasks "(){
		given:
		TaskManager t=new TaskManager()
		when:
		int numTasks=t.getNumberOfTasks()
		then:
		numTasks==0

	}

	def "Task Manager with one task added shows one task"(){
		given:
		TaskManager t=new TaskManager()
		t.addTask(new Task("Do the dishes"))
		when:
		int numTasks=t.getNumberOfTasks()
		then:
		numTasks==1


	}
}