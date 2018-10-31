package com.pokemon.attack;
import ru.ifmo.se.pokemon.*;

public class EnergyBall extends SpecialMove{
	public EnergyBall(Type type, double pow, double acc){
		super(type, pow, acc);
	} 
	protected java.lang.String describe(){
		return "использует Energy Ball";
	}
	protected void applyOppEffects(Pokemon p){
		Effect e = new Effect().chance(0.1).stat(Stat.SPECIAL_DEFENSE, -1);
		p.setCondition(e);
	}
}