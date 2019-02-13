package test1;

abstract class AbstractIt {
	abstract float getFloat();
}

class AbstractTest extends AbstractIt {
	float getFloat() {
		return 0.0f;
	}
}