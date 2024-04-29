package com.app.sorting;

import java.util.Comparator;

import com.app.core.Task;

public class compareDate implements Comparator<Task>{

	@Override
	public int compare(Task o1, Task o2) {
		return o1.getTaskDate().compareTo(o2.getTaskDate());
		
	}
}
