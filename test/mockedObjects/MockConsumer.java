package test.mockedObjects;

import main.Consumer;
import main.Item;

public class MockConsumer implements Consumer {

	MockBuffer mockBuffer;

	public MockConsumer(MockBuffer mockBuffer) {

		this.mockBuffer = mockBuffer;

	}

	public Item removeItem() {

		return mockBuffer.remove();

	}
	

	@Override
	public void run() {
	}

	@Override
	public void stopRunning() {
	}

}
