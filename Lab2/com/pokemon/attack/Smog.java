package com.pokemon.attack;
import ru.ifmo.se.pokemon.*;

public class Smog extends SpecialMove{
	public Smog(Type type, double pow, double acc){
		super(type, pow, acc);
	} 
	protected java.lang.String describe(){
		return "использует Smog";
	}
	protected void applyOppEffects(Pokemon p){
		Effect e = new Effect().chance(0.4);
		e.poison(p);
	}
}