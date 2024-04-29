package com.app.Test;

import java.util.List;

import com.app.core.Status;
import com.app.core.Task;
import com.app.exceptions.TaskIdIsNotFoundException;

public class functions {
	
	public static Task findById(int taskId, List<Task> tList) throws TaskIdIsNotFoundException {
		Task t = new Task(taskId);
		int index = tList.indexOf(t);
		if(index == -1) {
			throw new TaskIdIsNotFoundException("id is not found");
		}
		return tList.get(index);
	}
	
	public static void updateStatus(int taskId,String updatedStatus,List<Task> tList) throws TaskIdIsNotFoundException {
		Task t2 = findById(taskId, tList);
		t2.setStatus(Status.valueOf(updatedStatus));
	}
}
