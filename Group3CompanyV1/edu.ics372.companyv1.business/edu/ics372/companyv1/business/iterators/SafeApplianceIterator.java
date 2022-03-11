package edu.ics372.companyv1.business.iterators;

import java.util.Iterator;
import java.util.NoSuchElementException;

import edu.ics372.companyv1.business.entities.Appliance;
import edu.ics372.companyv1.business.facade.Result;
public class SafeApplianceIterator implements Iterator<Result>{
	private Iterator<Appliance> iterator;
	private Result result = new Result();
	public SafeApplianceIterator (Iterator<Appliance> iterator) {
		this.iterator = iterator;
	}
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return iterator.hasNext();
	}

	@Override
	public Result next() {
		if(iterator.hasNext()) {
			result.setApplianceField(iterator.next());
		}
		else
		{
			throw new NoSuchElementException("No element");
		}
		return result;
	}

}
