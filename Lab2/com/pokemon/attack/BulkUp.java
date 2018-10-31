package com.pokemon.attack;
import ru.ifmo.se.pokemon.*;

public class BulkUp extends StatusMove{
	public BulkUp(Type type, double pow, double acc){
		super(type, pow, acc);
	}
	protected java.lang.String	describe(){
		return "использует Bulk Up";
	}
	protected void applySelfEffects(Pokemon p){
		p.setMod(Stat.ATTACK, 1);
		p.setMod(Stat.DEFENSE, 1);
	}
}
