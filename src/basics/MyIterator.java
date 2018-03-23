package basics;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyIterator<T> implements Iterator<T>{
	private Integer cursor = 0;
	private final int range;
    
    public MyIterator(int range) {
        this.range = range;
    }

	@Override
	public boolean hasNext() {
		return cursor < range;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T next() {
		if(this.hasNext()) {
            return (T) cursor++;
        }
        throw new NoSuchElementException();
	}


}
