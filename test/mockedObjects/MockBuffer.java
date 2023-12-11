package test.mockedObjects;

import java.util.Queue;

import main.Buffer;
import main.Item;

public class MockBuffer extends Buffer {
	
	
	public MockBuffer() {
		super();
	}

	public Queue<Item> getBuffer() {
		return super.buffer;

	}

	public boolean isEmpty() {
		return buffer.isEmpty();
	}

	
	
}
