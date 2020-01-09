package comm;

public class Truck extends Transport {
	public double disCovered;
	double fuelUsed;
	double fuelEff;

	@Override
	public void calDistance() {

	}

	@Override
	public void calFuelEfficiency() {

	}

	public double cal(double start, double end, double initalFuel, double leftFuel) {

		disCovered = end - start;
		fuelUsed = initalFuel - leftFuel;

		fuelEff = (fuelUsed) / (disCovered);
		return fuelEff;

	}

}
