package com.pokemon.attack;
import ru.ifmo.se.pokemon.*;

public class SludgeWave extends SpecialMove{
	public SludgeWave(Type type, double pow, double acc){
		super(type, pow, acc);
	} 
	protected java.lang.String describe(){
		return "использует Sludge Wave";
	}
	protected void applyOppEffects(Pokemon p){
		Effect e = new Effect().chance(0.1);
		e.poison(p);
	}
}