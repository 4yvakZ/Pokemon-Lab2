package com.pokemon.attack;
import ru.ifmo.se.pokemon.*;

public class SeismicToss extends PhysicalMove{
	public SeismicToss(Type type, double pow, double acc){
		super(type, pow, acc);
	}
	protected java.lang.String	describe(){
		return "использует Seismic Toss";
	}
}
