package test.mockedObjects;

import main.Item;
import main.Producer;

public class MockProducer implements Producer {

	MockBuffer mockBuffer;

	public MockProducer(MockBuffer mockBuffer) {

		this.mockBuffer = mockBuffer;
	}

	public boolean additem(Item item) {

		return mockBuffer.add(item);

	}

	@Override
	public void run() {
	}

	@Override
	public void stopRunning() {
	}

}
