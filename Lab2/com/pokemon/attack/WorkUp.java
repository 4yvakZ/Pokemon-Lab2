package com.pokemon.attack;
import ru.ifmo.se.pokemon.*;

public class WorkUp extends StatusMove{
	public WorkUp(Type type, double pow, double acc){
		super(type, pow, acc);
	}
	protected java.lang.String	describe(){
		return "использует Work Up";
	}
	protected void applySelfEffects(Pokemon p){
		p.setMod(Stat.ATTACK, 1);
		p.setMod(Stat.SPECIAL_ATTACK, 1);
	}
}
