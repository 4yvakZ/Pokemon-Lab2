package com.pokemon.attack;
import ru.ifmo.se.pokemon.*;

public class CalmMind extends StatusMove{
	public CalmMind(Type type, double pow, double acc){
		super(type, pow, acc);
	} 
	protected java.lang.String describe(){
		return "использует Calm Mind";
	}
	protected void applySelfEffects(Pokemon p){
		p.setMod(Stat.SPECIAL_ATTACK, 1);
		p.setMod(Stat.SPECIAL_DEFENSE, 1);
	}
}