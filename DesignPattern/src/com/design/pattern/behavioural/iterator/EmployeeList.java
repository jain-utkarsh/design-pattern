package com.design.pattern.behavioural.iterator;

import java.util.ArrayList;
import java.util.List;
import com.design.pattern.behavioural.iterator.Emloyee;

public class EmployeeList implements CustomIterable{

	List<Emloyee> employeeList = new ArrayList<Emloyee>();
	
	{
		employeeList.add(new Emloyee("name", 1));
		employeeList.add(new Emloyee("name", 2));
		employeeList.add(new Emloyee("name", 3));
		employeeList.add(new Emloyee("name", 4));
	}
	
	@Override
	public CustomIterator iterator() {
		return new CustomIteratorImpl();
	}
	
	private class CustomIteratorImpl implements CustomIterator {

		int index;
		
		@Override
		public boolean hasNext() {
			if(index == employeeList.size()) {
				return false;
			}
			return true;
		}

		@Override
		public Object next() {
			return employeeList.get(index++); 
		}
		
	}
}
