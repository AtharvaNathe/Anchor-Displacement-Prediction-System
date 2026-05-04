package com.predator.Anchor.Prediction;

public class PredictionRequest {
    private double P;
    private double UM;
    private double LM;
    private double ER;
    private double SBP;
    private double SPBD;
    private double load;
	public double getP() {
		return P;
	}
	public void setP(double p) {
		P = p;
	}
	public double getUM() {
		return UM;
	}
	public void setUM(double uM) {
		UM = uM;
	}
	public double getLM() {
		return LM;
	}
	public void setLM(double lM) {
		LM = lM;
	}
	public double getER() {
		return ER;
	}
	public void setER(double eR) {
		ER = eR;
	}
	public double getSBP() {
		return SBP;
	}
	public void setSBP(double sBP) {
		SBP = sBP;
	}
	public double getSPBD() {
		return SPBD;
	}
	public void setSPBD(double sPBD) {
		SPBD = sPBD;
	}
	public double getLoad() {
		return load;
	}
	public void setLoad(double load) {
		this.load = load;
	}

    // Getters & Setters
}