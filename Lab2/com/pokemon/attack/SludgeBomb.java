package com.pokemon.attack;
import ru.ifmo.se.pokemon.*;

public class SludgeBomb extends SpecialMove{
	public SludgeBomb(Type type, double pow, double acc){
		super(type, pow, acc);
	} 
	protected java.lang.String describe(){
		return "использует Sludge Bomb";
	}
	protected void applyOppEffects(Pokemon p){
		Effect e = new Effect().chance(0.3);
		e.poison(p);
	}
}