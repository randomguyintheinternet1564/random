package new1.units;

import mindustry.entities.*;
import mindustry.entities.bullet.*;
import mindustry.content.*;
import midustry.type.*;

public class RDCUnitType{
	public static UnitType me;
	public static void load(){
		me = new REALmeUnitType("me");
}