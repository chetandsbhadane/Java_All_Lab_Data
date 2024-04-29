package com.app.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.app.core.Status;
import com.app.core.Task;
import com.app.sorting.compareDate;

public class Tester {

	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)){
			List<Task> tList = new ArrayList<>();
			int ch=0;
			do {
				System.out.println("1.Add\n2.REMOVE\n3.UPDATE\n4.pending tasks\n5.today pending tasks\n6.sortbydate");
				ch = sc.nextInt();
				try {
					switch(ch) {
					case 1:
						System.out.println("Enter Taskid, taskName, desc, taskDate, status, active");
						tList.add(new Task(sc.nextInt(), sc.next(), sc.next(), LocalDate.parse(sc.next()), Status.valueOf(sc.next())));
						break;
						
					case 2:
						System.out.println("Enter taskId to remove");
						Task t2 = functions.findById(sc.nextInt(), tList);
						System.out.println("REMOVED..");
						break;
						
					case 3:
						System.out.println("update task status..");
						System.out.println("Enter taskid and options from INPROGRESS, COMPLETED");
						functions.updateStatus(sc.nextInt(),sc.next(),tList);
						System.out.println("updated..");
						break;
					case 4:
						System.out.println("All pending tasks..");
						for(Task t:tList) {
							if(t.getStatus().equals(Status.PENDING)) {
								System.out.println(t);
							}
						}
						break;
						
					case 5:
						System.out.println("all today's pending tasks");
						for(Task t3:tList) {
							if(t3.getTaskDate().equals(LocalDate.now())) {
								System.out.println(t3);
							}
						}
						break;
						
					case 6:
						System.out.println("sorted by task date..");
						Collections.sort(tList,new compareDate());
						break;
						
					case 7:
						for(Task t5:tList) {
							System.out.println(t5);
						}
						break;
					}
				}catch(Exception e) {
					//sc.nextLine();
					e.printStackTrace();
				}
			}while(ch!=0);
		}

	}

}
