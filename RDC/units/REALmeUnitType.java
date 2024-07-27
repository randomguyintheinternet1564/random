package new1.units;

import mindustry.type.*;
import arc.struce.*;
import mindustry.*;
import mindustry.bullet.*;
import new1.*;
import arc.*;
import mindustry.graphics.*;
import mindustry.entities.*;
import mindustry.entities.bullet.*;

public class REALmeUnitType extends UnitType{
	static float test = 2;
	public REALmeUnitType(string name){
		super(name);
		type = flying;
		health = 9999999999f;
		armor = 10000000000000f;
		speed = 10f;
		rotateSpeed = 0.1f;
		hitSize = 5
		description ="its me, the same unit, but this time i won't hold back anymore"
weapons.addAll(
	new Weapon("testing")
		reload = 1,
		bullet = new BulletType(10f, 100f);
}	
	@Override
	public void init(){
		super.init();
		immunities.addALL(Vars.content.statusEffects());
			}
	@Override
	public void load()
	{
		super.load();
	}
},
