package com.pokemon.attack;
import ru.ifmo.se.pokemon.*;

public class AncientPower extends SpecialMove{
	public AncientPower(Type type, double pow, double acc){
		super(type, pow, acc);
	} 
	protected java.lang.String describe(){
		return "использует Ancient Power";
	}
	protected void applySelfEffects(Pokemon p){
		Effect e = new Effect().chance(0.1).stat(Stat.SPECIAL_ATTACK, 1).stat(Stat.ATTACK, 1).stat(Stat.SPECIAL_DEFENSE, 1).stat(Stat.DEFENSE, 1).stat(Stat.SPEED, 1);
		p.setCondition(e);
	}
}