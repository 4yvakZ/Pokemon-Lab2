package com.pokemon.attack;
import ru.ifmo.se.pokemon.*;

public class ConfuseRay extends StatusMove{
	public ConfuseRay(Type type, double pow, double acc){
		super(type, pow, acc);
	} 
	protected java.lang.String describe(){
		return "использует Confuse Ray";
	}
	protected void apply0ppEffects(Pokemon p){
		Effect e = new Effect() .chance(1);
		e.poison(p); 
	}
}