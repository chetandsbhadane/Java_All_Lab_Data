package com.app.core;
import java.time.LocalDate;

/*2. Create a menu driven application "TaskManager" to manage your day-to-day
 *  tasks. 

You can create a class Task with fields like taskId, taskName, description, 
taskDate, status, active. 
taskId should be unique and generated automatically.
status should be either PENDING, IN PROGRESS or COMPLETED.
active should be either true or false. Deleted task will have active=false 
Newly added task should have default status as PENDING and active=true

You can use suitable data structure to store data in memory.

Following functionalities are expected -

a. Add New Task                       
b. Delete a task                         
c. Update task status               
d. Display all pending tasks     
e. Display all pending tasks for today           
f.  Display all tasks sorted by taskDate */
public class Task {
	private int taskId;
	private String taskName;
	private String desc;
	private LocalDate taskDate;
	private Status status=Status.PENDING;
	private boolean active=false;
	public Task(int taskId, String taskName, String desc, LocalDate taskDate, Status status) {
		super();
		this.taskId = taskId;
		this.taskName = taskName;
		this.desc = desc;
		this.taskDate = taskDate;
		this.status = status;
		this.active = true;
	}
	public Task(int taskId) {
		this.taskId = taskId;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof Task) {
			Task t = (Task)o;
			return this.taskId == t.taskId;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "Task [taskId=" + taskId + ", taskName=" + taskName + ", desc=" + desc + ", taskDate=" + taskDate
				+ ", status=" + status + ", active=" + active + "]";
	}
	public int getTaskId() {
		return taskId;
	}
	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public LocalDate getTaskDate() {
		return taskDate;
	}
	public void setTaskDate(LocalDate taskDate) {
		this.taskDate = taskDate;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	
	
}
