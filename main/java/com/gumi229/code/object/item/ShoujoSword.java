package com.gumi229.code.object.item;

import java.util.HashSet;

import com.gumi229.code.until.ProgrammingParadigm;

import net.minecraft.item.Item;
import net.minecraft.item.ItemTool;

public class ShoujoSword extends ItemTool {
	private Item ingot;
	public final ProgrammingParadigm type;
	private int level = 0;

	public ShoujoSword(ShoujoIngot ingot, ProgrammingParadigm pp) {
		super(ingot.attack, ingot.attackSpeech, ingot.toolMaterial, new HashSet());
		this.ingot = ingot;
		this.type = pp;
	}

	public void addLevel(int i) {
		this.level += i;
	}

}
